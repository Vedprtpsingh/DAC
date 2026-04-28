import { useEffect, useState } from "react";
import { addRec, updateRec } from "../services/api";

const INITIAL_FORM = { name: "", address: "", salary: "" };

export default function EditEmpForm({ editRec, onSave, onCancel }) {
  const [form, setForm] = useState(INITIAL_FORM);
  const [loading, setLoading] = useState(false);

  useEffect(() => {
    if (editRec) {
      setForm({
        name: editRec.name,
        address: editRec.address,
        salary: editRec.salary,
      });
    } else {
      setForm(INITIAL_FORM);
    }
  }, [editRec]);

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    setLoading(true);
    try {
      if (editRec) {
        await updateRec(editRec._id, form);
      } else {
        await addRec(form);
      }
      setForm(INITIAL_FORM);
      onSave?.();
    } catch (err) {
      console.error("Failed to save employee:", err);
    } finally {
      setLoading(false);
    }
  };

  return (
    <form className="card p-3 mb-3" onSubmit={handleSubmit}>
      <h2>Edit Employee</h2>
      <input
        required
        name="name"
        value={form.name}
        onChange={handleChange}
        placeholder="Name"
        className="form-control mb-2"
      />
      <input
        name="address"
        value={form.address}
        onChange={handleChange}
        placeholder="Address"
        className="form-control mb-2"
      />
      <input
        required
        name="salary"
        type="number"
        min="0"
        value={form.salary}
        onChange={handleChange}
        placeholder="Salary"
        className="form-control mb-2"
      />
      <div className="d-flex gap-2">
        <button className="btn btn-success" disabled={loading}>
          {loading ? "Saving…" : "Update"}
        </button>
        {editRec && (
          <button
            type="button"
            className="btn btn-secondary"
            onClick={onCancel}
          >
            Cancel
          </button>
        )}
      </div>
    </form>
  );
}
