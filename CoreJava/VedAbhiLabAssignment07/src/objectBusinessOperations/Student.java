package objectBusinessOperations;

import java.io.Serializable;

public class Student implements Serializable {
	static int id;
	String name;
	double marks;
	public Student(String name, double marks) {
		super();
		this.name = name;
		this.marks = marks;
		id++;
	}
	@Override
	public String toString() {
		return "Student id="+id+", name=" + name + ", marks=" + marks ;
	}
	
	
}
