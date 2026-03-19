package studentManagementSystemArrayListwithObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Student {
	String studentId;
	String studentName,course;
	int marks;
	public Student(String studentId, String studentName, String course, int marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.course = course;
		this.marks = marks;
	}
	
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	void addStudent(Student stu,ArrayList<Student> al){
		al.add(stu);
	}
	static void displayStudents(ArrayList<Student> al){
		for(Student s:al) {
			System.out.println("Student Name: "+s.studentName+", Student ID: "+s.studentId+", Student Course: "+s.course+", Student Marks: "+s.marks);
		}
	}
	static void searchStudent(String sid,ArrayList<Student> al){
		for(Student s:al) {
			if(s.studentId==sid) {
				System.out.println("Student Name: "+s.studentName+", Student ID: "+s.studentId+", Student Course: "+s.course+", Student Marks: "+s.marks);
				
			}
		}
	}
	static void updateStudent(String sid,String sname,ArrayList<Student> al){
		for(Student s:al) {
			if(s.studentId==sid) {
				s.studentName=sname;
			}
		}
	}
	static void deleteStudent(String sid,ArrayList<Student> al){
		for(Student s:al) {
			if(s.studentId==sid) {
				al.remove(s);
			}
		}
	}
	static void sortStudents(ArrayList<Student> al) {
		SortByMarks sm=new SortByMarks();
		Collections.sort(al, sm);
		
	}
}
