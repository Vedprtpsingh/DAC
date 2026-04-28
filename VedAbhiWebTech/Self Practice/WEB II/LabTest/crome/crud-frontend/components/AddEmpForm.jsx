import { useState } from "react";
import { addRec } from "../services/api";

const INITIAL_FORM = { name: "", address: "", salary: "" };

export default function AddEmpForm({ onAdd }) {
  const [form, setForm] = useState(INITIAL_FORM);
  const [loading, setLoading] = useState(false);

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    setLoading(true);
    try {
      await addRec(form);
      setForm(INITIAL_FORM);
      onAdd?.();
    } catch (err) {
      console.error("Failed to add employee:", err);
    } finally {
      setLoading(false);
    }
  };

  return (
    <form className="card p-3 mb-3" onSubmit={handleSubmit}>
      <h2>Add Employee</h2>
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
      <button className="btn btn-success" disabled={loading}>
        {loading ? "Adding…" : "Add Employee"}
      </button>
    </form>
  );
}
