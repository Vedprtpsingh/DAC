import { useState, useEffect } from "react";
import EmpList from "../components/EmpList";
import AddEmpForm from "../components/AddEmpForm";
import EditEmpForm from "../components/EditEmpForm";
import { getAll, deleteRec } from "../services/api";

function App() {
  const [empList, setEmpList] = useState([]);
  const [editRec, setEditRec] = useState(null);

  const fetchEmpList = async () => {
    try {
      const res = await getAll();
      setEmpList(res.data);
    } catch (err) {
      console.error("Failed to fetch employees:", err);
    }
  };

  useEffect(() => {
    fetchEmpList();
  }, []);

  const handleDelete = async (id) => {
    try {
      await deleteRec(id);
      fetchEmpList();
    } catch (err) {
      console.error("Failed to delete employee:", err);
    }
  };

  const handleSave = () => {
    setEditRec(null);
    fetchEmpList();
  };

  return (
    <div className="container py-4">
      <h1 className="mb-4">Employee Manager</h1>

      {editRec ? (
        <EditEmpForm
          editRec={editRec}
          onSave={handleSave}
          onCancel={() => setEditRec(null)}
        />
      ) : (
        <AddEmpForm onAdd={fetchEmpList} />
      )}

      <EmpList data={empList} onUpdate={setEditRec} onDelete={handleDelete} />
    </div>
  );
}

export default App;
