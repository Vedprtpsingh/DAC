const express=require("express")
const mongoose=require("mongoose")
const cors=require("cors")


const app=express();

app.use(cors());

app.use(express.json());

mongoose.connect("mongodb://localhost:27017/mydb")
.then(()=>console.log("db connected"))
.catch(()=>console.log("db not connected"))


const Student=mongoose.model("student",{
    name:String,
    RN:String,
    address:String,
    MN:String
})


app.post("/add",async(req,res)=>{
    const s=new Student(req.body);
    await s.save();
    res.json(s);
})


app.get("/getAll",async(req,res)=>{
    const getStudents=await Student.find();
    res.json(getStudents);
})


app.delete("/:id",async(req,res)=>{
    const i=req.params.id;
    const s=await Student.findByIdAndDelete(i);
    res.json({"message":"Record deleted successfully"});
})

app.put("/:id",async(req,res)=>{
    const i=req.params.id;
    const s=await Student.findByIdAndUpdate(i,req.body,{new:true});
    res.json(s);
})


app.listen(3000,()=>console.log("Server is running"))