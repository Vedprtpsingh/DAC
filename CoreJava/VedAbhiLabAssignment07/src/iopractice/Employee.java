package iopractice;
import java.io.Serializable;
public class Employee implements Serializable {
	int id;
	String name;
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	void displayEmployee() {
		System.out.println("Employee id: "+id+", Employee Name: "+name);
	}
}
