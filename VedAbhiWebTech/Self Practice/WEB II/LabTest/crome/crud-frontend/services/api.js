import axios from "axios";

const BASE_URL = "http://localhost:1234/api/employees";

export const getAll = () => axios.get(BASE_URL);
export const findRec = (id) => axios.get(`${BASE_URL}/${id}`);
export const addRec = (rec) => axios.post(BASE_URL, rec);
export const updateRec = (id, rec) => axios.put(`${BASE_URL}/${id}`, rec);
export const deleteRec = (id) => axios.delete(`${BASE_URL}/${id}`);
