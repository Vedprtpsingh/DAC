
import 'bootstrap/dist/css/bootstrap.min.css'
import { useState } from 'react';
import { delRec, getAll } from '../services/api';
import { useEffect } from 'react';
import AddRecord from '../components/AddRecord';
import EditRecord from '../components/EditRecord';


function App() {
  const [list, setList]=useState([]);
  const [editRec, setEditRec] = useState(null);

  const fetchRecords = async() => {
    const res = await getAll();
    setList(res.data);
  }

  useEffect(()=>{
    fetchRecords();
  },[]);

  const deleteRecord = async(rec) => {
    if(!confirm("Are you sure, you want to delete this?")){
      return;
    }
    const res = await delRec(rec._id)
    
    fetchRecords();
  }

  const onSelectRecord = (rec) => {
    setEditRec(rec);
  }

  return (
    <>
      <div className='container'>
        <h1>Management</h1>
        {editRec ? <EditRecord editRec={editRec} setEditRec={setEditRec} /> : <AddRecord />}
        
        <table className='table'>
          <thead>
            <tr>
              <th>Name</th>
              <th>Roll</th>
              <th>Address</th>
              <th>Mobile</th>
              <th></th>
            </tr>
          </thead>
          <tbody>
            {list.map((r,i) => (
              <tr key={i}>
                <td>{r.name}</td>
                <td>{r.RN}</td>
                <td>{r.address}</td>
                <td>{r.MN}</td>
                <td>
                  <button className='btn btn-danger' onClick={() => deleteRecord(r)}>Delete</button>
                  <button className='btn btn-warning' onClick={() => onSelectRecord(r)}>Edit</button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </>
  )
}

export default App
