import axios from 'axios';

const URL = 'http://localhost:3000';

export const getAll = () => axios.get(`${URL}/getAll`);

export const addRec = (body) => axios.post(`${URL}/add`,body);



export const delRec=(id)=>axios.delete(`${URL}/${id}`);

export const updateRec=(id,body)=>axios.put(`${URL}/${id}`, body);