package studentManagementSystemArrayListwithObject;

import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
		Student s1=new Student("DAC888", "ABHI", "DAC", 100);
		al.add(s1);
		Student s2=new Student("ADAC888", "AaBHI", "dDAC", 10);
		al.add(s2);
		
		Student s3=new Student("ADAC888", "ABHI", "dDAC", 1000);
		al.add(s3);
		Student.displayStudents(al);
		
		System.out.println("Search STUDENT");
		Student.searchStudent("DAC888", al);
		
		System.out.println("Update STU");
		
		Student.updateStudent("DAC888", "VED", al);
		Student.searchStudent("DAC888", al);
		
		//Student.deleteStudent("DAC888", al);
		
		System.out.println("Afer Delete List");
		Student.displayStudents(al);
		System.out.println("Sort Student by marks");
		Student.sortStudents(al);
		Student.displayStudents(al);
	}
}
