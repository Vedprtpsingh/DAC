# 🟢 Matrix Green — Eclipse 2026 Theme
## Installation & Configuration Guide

```
╔══════════════════════════════════════════════════════════════╗
║  > MATRIX GREEN THEME v1.0.0                                 ║
║  > Eclipse E4 CSS Theme for Eclipse 2026+                    ║
║  > Black background · Green-on-black · Hacker terminal look  ║
╚══════════════════════════════════════════════════════════════╝
```

---

## 📁 File Structure

```
matrix-green-theme/
├── META-INF/
│   └── MANIFEST.MF                  ← OSGi bundle manifest
├── css/
│   └── matrix-green.css             ← E4 CSS theme (main file)
├── src/com/matrixgreen/theme/
│   └── ThemeSource.java             ← Preference initializer source
├── prefs/
│   ├── org.eclipse.ui.editors.prefs ← Editor colour prefs
│   ├── org.eclipse.jdt.ui.prefs     ← Java syntax colour prefs
│   └── org.eclipse.debug.ui.prefs   ← Console colour prefs
└── plugin.xml                       ← Plugin extension points
```

---

## 🚀 Method A — Drop-in Preferences (Fastest, No Plugin Required)

This method applies the colour scheme directly to your workspace
without building or installing a plugin.

### Step 1 — Locate your workspace settings folder

```
<your-workspace>/.metadata/.plugins/org.eclipse.core.runtime/.settings/
```

### Step 2 — Copy the three preference files

Copy all files from the `prefs/` folder of this archive into the
`.settings/` directory above:

| File | What it controls |
|------|-----------------|
| `org.eclipse.ui.editors.prefs`  | Editor background, foreground, selection, line highlight |
| `org.eclipse.jdt.ui.prefs`      | Java syntax colours (keywords, strings, comments, types…) |
| `org.eclipse.debug.ui.prefs`    | Console output / error / input stream colours |

> ⚠️ **Close Eclipse before copying.** Eclipse reads these files
> on startup; overwriting them while it is open may have no effect.

### Step 3 — Restart Eclipse

Launch Eclipse and the Matrix Green colour scheme is active.

---

## 🔌 Method B — Install as a Plugin (Full E4 CSS Theme)

This method registers Matrix Green as a proper theme switchable
from **Window › Preferences › General › Appearance**.

### Prerequisites

- Eclipse for RCP and RAP Developers, or any Eclipse package with
  the **Plug-in Development Environment (PDE)** installed.
- Java 17 or later.

### Step 1 — Import the project

1. **File › Import › General › Existing Projects into Workspace**
2. Select the root folder of this archive → **Finish**

### Step 2 — Build the plugin

1. Right-click the project → **Export › Plug-in Development ›
   Deployable plug-ins and fragments**
2. Destination: choose a folder (e.g. `~/matrix-green-export/`)
3. Click **Finish** — this produces a `.jar` in the `plugins/`
   subfolder of your destination.

### Step 3 — Install the JAR into Eclipse

**Option A — Copy into Eclipse `dropins/`:**
```
cp ~/matrix-green-export/plugins/com.matrixgreen.theme_1.0.0.jar \
   <eclipse-install>/dropins/
```
Then restart Eclipse with the `-clean` flag:
```bash
eclipse -clean
```

**Option B — Install via Update Site:**
1. **Help › Install New Software › Add › Local…**
2. Point to `~/matrix-green-export/` → install the feature.
3. Restart when prompted.

### Step 4 — Activate the theme

1. **Window › Preferences › General › Appearance**
2. Under **Theme**, select **Matrix Green**
3. Click **Apply and Close**
4. Restart Eclipse when prompted.

---

## 🎨 Method C — Quick Manual Colour Settings (No Files Needed)

Apply the most important colours directly through Eclipse's UI.

### Editor colours
**Window › Preferences › General › Editors › Text Editors**

| Setting | Value |
|---------|-------|
| Background colour | `#000000` |
| Foreground colour | `#00FF00` |
| Selection background | `#003300` |
| Selection foreground | `#39FF14` |
| Current line highlight | `#001A00` |
| Print margin colour | `#002800` |

### Java syntax colours
**Window › Preferences › Java › Editor › Syntax Coloring**

| Token | Colour | Style |
|-------|--------|-------|
| Keywords | `#39FF14` | **Bold** |
| Strings | `#7CFC00` | Normal |
| Single-line comment | `#228B22` | *Italic* |
| Multi-line comment | `#228B22` | *Italic* |
| Javadoc | `#00AA00` | *Italic* |
| Default text | `#00FF00` | Normal |
| Classes / Types | `#32CD32` | **Bold** |
| Methods | `#ADFF2F` | Normal |
| Annotations | `#00AA00` | Normal |
| Numbers | `#7CFC00` | Normal |

### Console colours
**Window › Preferences › Run/Debug › Console**

| Stream | Colour |
|--------|--------|
| Standard Out | `#00FF00` |
| Standard In  | `#39FF14` |
| Standard Error | `#FF4444` |
| Background | `#000000` |

### Line numbers
**Window › Preferences › General › Editors › Text Editors › Line numbers**
- Enable line numbers: ✅
- Colour (via annotations): `#00AA00`

---

## 🖥️ Making ALL Console Output Green

Eclipse uses per-stream colours for the console.  To ensure every
stream appears green on black, perform **all** of the following:

### 1. Console preferences (covers Run/Debug output)
Follow the Console colours section in Method C above.

### 2. Terminal (TM Terminal plugin)
**Window › Preferences › Terminal › Colors**
- Background: `#000000`
- Foreground: `#00FF00`
- Selection: `#003300`
- Cursor: `#39FF14`

### 3. ANSI Escape Code support
Install **ANSI Escape in Console** from the Eclipse Marketplace.
This renders ANSI color codes in the console — programs that emit
`\033[32m` text will display correctly in green.

### 4. System.out coloring via Log4j / SLF4J
Add this to your `log4j2.xml` / `logback.xml` for green output
in the Eclipse console:

```xml
<!-- log4j2 pattern with ANSI green -->
<PatternLayout
  pattern="%highlight{%d{HH:mm:ss} [%t] %-5level %logger{36} - %msg%n}{
    FATAL=red blink,
    ERROR=red,
    WARN=yellow bold,
    INFO=green,
    DEBUG=green,
    TRACE=green
  }"/>
```

### 5. Maven / Gradle console output
Add to your run configuration **VM arguments**:
```
-Djansi.passthrough=true
```
This passes ANSI colour sequences through to the Eclipse console.

---

## 🎛️ Colour Reference Card

| UI Element | Hex | RGB |
|-----------|-----|-----|
| Background (all) | `#000000` | 0, 0, 0 |
| Default text | `#00FF00` | 0, 255, 0 |
| Java keywords | `#39FF14` | 57, 255, 20 |
| Strings | `#7CFC00` | 124, 252, 0 |
| Comments | `#228B22` | 34, 139, 34 |
| Class names | `#32CD32` | 50, 205, 50 |
| Method names | `#ADFF2F` | 173, 255, 47 |
| Line numbers | `#00AA00` | 0, 170, 0 |
| Selected tab | `#006400` | 0, 100, 0 |
| Console stdout | `#00FF00` | 0, 255, 0 |
| Console stdin | `#39FF14` | 57, 255, 20 |
| Error text | `#FF4444` | 255, 68, 68 |
| Warning text | `#FFFF00` | 255, 255, 0 |
| Current line | `#001A00` | 0, 26, 0 |
| Selection bg | `#003300` | 0, 51, 0 |
| Tab hover | `#001A00` | 0, 26, 0 |
| Border / divider | `#003300` | 0, 51, 0 |

---

## 🔧 Recommended Companion Settings

For the full Matrix experience, also apply these settings:

### Font
**Window › Preferences › General › Appearance › Colors and Fonts**
- **Text Font**: `Fira Code` 12pt (ligatures), or `Courier New` 11pt
- **Console Font**: `Courier New` 10pt

### Bracket matching
Enable in **Window › Preferences › General › Editors › Text Editors**
- ✅ Highlight matching brackets  → colour `#39FF14`

### Minimap (if using CodeMining or similar)
- Background: `#000000`
- Viewport highlight: `#003300`

### Git staging / blame
**Window › Preferences › Team › Git › Label Decorations**
- Added: `#39FF14`
- Modified: `#ADFF2F`
- Conflicting: `#FF4444`

### Cursor blink rate
**Window › Preferences › General › Editors › Text Editors**
- Cursor blink rate: 500ms (for classic terminal feel)

---

## ❓ Troubleshooting

| Problem | Solution |
|---------|----------|
| Theme not appearing in Appearance prefs | Ensure plugin JAR is in `dropins/` and restart with `-clean` |
| Console background is still white | Copy `org.eclipse.debug.ui.prefs` to workspace `.settings/` and restart |
| Java keywords still coloured wrong | Preferences › Java › Editor › Syntax Coloring — confirm changes saved |
| Some views still have light background | The platform's native SWT widgets may override CSS; apply colours via Preferences › General › Appearance |
| Tabs don't turn dark green | E4 CSS theme must be active; switch theme in Appearance and restart |

---

*Matrix Green Theme v1.0.0 — "The code is everywhere."*
