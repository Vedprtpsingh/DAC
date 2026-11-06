/** RepVault backend. Deploy as Web App: Execute as "Me", Access "Only myself". */
const TZ = 'Asia/Kolkata';
const SHEETS = {
  Exercises: ['Exercise_ID', 'Exercise_Name', 'Created_Date', 'Status'],
  Exercise_Records: ['Record_ID', 'Exercise_ID', 'Exercise_Name', 'Exercise_Date', 'Set_Number', 'Repetitions', 'Created_At', 'Updated_At'],
  Settings: ['Setting_Name', 'Setting_Value']
};

function doGet() {
  return HtmlService.createHtmlOutputFromFile('Index').setTitle('RepVault')
    .addMetaTag('viewport', 'width=device-width, initial-scale=1, viewport-fit=cover');
}

/** Run once from the editor to authorize and create the database. */
function setup() { db_(); }

/* ---------- helpers ---------- */
function db_() {
  const props = PropertiesService.getScriptProperties();
  let ss = null;
  const id = props.getProperty('SS_ID');
  if (id) { try { ss = SpreadsheetApp.openById(id); } catch (e) { ss = null; } }
  if (!ss) { ss = SpreadsheetApp.create('RepVault Database'); props.setProperty('SS_ID', ss.getId()); }
  Object.keys(SHEETS).forEach(n => {
    if (ss.getSheetByName(n)) return;
    const s = ss.insertSheet(n);
    s.getRange('A:Z').setNumberFormat('@'); // keep dates and IDs as plain text
    s.getRange(1, 1, 1, SHEETS[n].length).setValues([SHEETS[n]]).setFontWeight('bold');
    s.setFrozenRows(1);
  });
  const def = ss.getSheetByName('Sheet1');
  if (def && ss.getSheets().length > 1) ss.deleteSheet(def);
  return ss;
}
const today_ = () => Utilities.formatDate(new Date(), TZ, 'yyyy-MM-dd');
const uid_ = p => p + '_' + Utilities.getUuid().slice(0, 8);
const rows_ = s => { const n = s.getLastRow(); return n < 2 ? [] : s.getRange(2, 1, n - 1, s.getLastColumn()).getValues(); };
function rowIdx_(s, id) {
  const r = rows_(s);
  for (let i = 0; i < r.length; i++) if (String(r[i][0]) === String(id)) return i + 2;
  throw new Error('Record not found');
}
function name_(v) {
  v = String(v || '').replace(/\s+/g, ' ').trim().replace(/^[=+\-@]+/, '');
  if (!v || v.length > 40) throw new Error('Name must be 1 to 40 characters');
  return v;
}
function reps_(v) {
  v = Number(v);
  if (!Number.isInteger(v) || v < 1 || v > 100000) throw new Error('Repetitions must be a whole number from 1 to 100000');
  return v;
}
function date_(v) {
  v = String(v || today_());
  if (!/^\d{4}-\d{2}-\d{2}$/.test(v) || v > today_()) throw new Error('Invalid date');
  return v;
}
function put_(ss, k, v) {
  const s = ss.getSheetByName('Settings'), r = rows_(s);
  for (let i = 0; i < r.length; i++) if (r[i][0] === k) { s.getRange(i + 2, 2).setValue(v); return; }
  s.appendRow([k, v]);
}
function data_(ss) {
  const ex = rows_(ss.getSheetByName('Exercises')).map(r => ({ id: String(r[0]), name: String(r[1]), status: String(r[3]) }));
  const rec = rows_(ss.getSheetByName('Exercise_Records')).map(r => ({
    id: String(r[0]), ex: String(r[1]), date: String(r[3]), n: Number(r[4]), reps: Number(r[5]), at: String(r[6])
  }));
  const cfg = {};
  rows_(ss.getSheetByName('Settings')).forEach(r => { if (r[1] !== '') cfg[r[0]] = String(r[1]); });
  return { today: today_(), exercises: ex, records: rec, settings: cfg };
}

/* ---------- actions ---------- */
const A = {
  list() {},
  addExercise(ss, p) {
    const n = name_(p.name), s = ss.getSheetByName('Exercises');
    if (rows_(s).some(r => r[3] === 'Active' && String(r[1]).toLowerCase() === n.toLowerCase()))
      throw new Error('An exercise with that name already exists');
    s.appendRow([uid_('ex'), n, today_(), 'Active']);
  },
  renameExercise(ss, p) {
    const s = ss.getSheetByName('Exercises'), n = name_(p.name);
    if (rows_(s).some(r => r[3] === 'Active' && String(r[0]) !== String(p.id) && String(r[1]).toLowerCase() === n.toLowerCase())) throw new Error('An exercise with that name already exists');
    s.getRange(rowIdx_(s, p.id), 2).setValue(n); // history keeps its own IDs
  },
  deleteExercise(ss, p) { // archived, never erased: history stays intact
    const s = ss.getSheetByName('Exercises');
    s.getRange(rowIdx_(s, p.id), 4).setValue('Archived');
  },
  addSet(ss, p) {
    if (!p.requestId) throw new Error('Missing request ID');
    const cache = CacheService.getScriptCache(), key = 'rid_' + String(p.requestId).slice(0, 40);
    if (cache.get(key)) return; // duplicate submission
    const ex = rows_(ss.getSheetByName('Exercises')).find(r => String(r[0]) === String(p.exerciseId) && r[3] === 'Active');
    if (!ex) throw new Error('Exercise not found');
    const d = date_(p.date), v = reps_(p.reps), s = ss.getSheetByName('Exercise_Records');
    const n = rows_(s).filter(r => String(r[1]) === String(ex[0]) && String(r[3]) === d).length + 1;
    const now = new Date().toISOString();
    s.appendRow([uid_('rec'), ex[0], ex[1], d, n, v, now, now]);
    cache.put(key, '1', 600);
  },
  editSet(ss, p) {
    const s = ss.getSheetByName('Exercise_Records'), i = rowIdx_(s, p.id);
    s.getRange(i, 6).setValue(reps_(p.reps));
    s.getRange(i, 8).setValue(new Date().toISOString());
  },
  deleteSet(ss, p) {
    const s = ss.getSheetByName('Exercise_Records'), i = rowIdx_(s, p.id);
    const row = s.getRange(i, 1, 1, 8).getValues()[0];
    s.deleteRow(i);
    let n = 0; // renumber remaining sets for that exercise and day
    rows_(s).forEach((r, j) => {
      if (String(r[1]) === String(row[1]) && String(r[3]) === String(row[3])) s.getRange(j + 2, 5).setValue(++n);
    });
  },
  resetToday(ss) { put_(ss, 'ResetAt:' + today_(), new Date().toISOString()); },
  restoreToday(ss) { put_(ss, 'ResetAt:' + today_(), ''); }
};

/** Single entry point called by the frontend. Locked to prevent simultaneous writes. */
function api(action, p) {
  const lock = LockService.getScriptLock();
  try {
    lock.waitLock(20000);
    if (!Object.prototype.hasOwnProperty.call(A, action)) throw new Error('Unknown action');
    const ss = db_();
    A[action](ss, p || {});
    return { ok: true, data: data_(ss) };
  } catch (e) {
    return { ok: false, error: String(e.message || e) };
  } finally {
    try { lock.releaseLock(); } catch (e) {}
  }
}
