import { useEffect, useState } from "react";

import { updateRec } from "../services/api";

const INITIAL_DATA = { name: "", RN: "", address: "", MN: ""};

function EditRecord({editRec, setEditRec}){
    const [form, setForm] = useState(INITIAL_DATA);

    useEffect(()=>{
        if(editRec){
            setForm({
                name: editRec.name, 
                RN: editRec.RN, 
                address: editRec.address, 
                MN: editRec.MN
            });
        }else{
            setForm(INITIAL_DATA)
        }
    },[])

    const handleChange = (e) => {
        setForm({ ...form, [e.target.name]: e.target.value});
    }

    const handleSubmit = async() => {
        try{
            const res = await updateRec(editRec._id,form);
            setForm(INITIAL_DATA);
        }catch{
            console.log("Error updating record.")
        }
    }

    const handleClear = (e) => {
        e.preventDefault();
        setEditRec(null);
        setForm(INITIAL_DATA)
    }

    return(
        <>
            <div className="card">
                <form onSubmit={handleSubmit}>
                    <input required className="form-control" onChange={handleChange} name="name" value = {form.name} placeholder="Enter Name" />
                    
                    <input required className="form-control" onChange={handleChange} name="RN" value = {form.RN} placeholder="Enter Roll Number" />
                    
                    <input required className="form-control" onChange={handleChange} name="address" value = {form.address} placeholder="Enter Address" />
                    
                    <input required className="form-control" onChange={handleChange} name="MN" value = {form.MN} placeholder="Enter Mobile Number" type="number"/>

                    <button className="btn btn-primary">Update</button>
                    <button className="btn btn-secondary" onClick={handleClear}>Cancel</button>
                </form>
            </div>
        </>
    )
}

export default EditRecord;