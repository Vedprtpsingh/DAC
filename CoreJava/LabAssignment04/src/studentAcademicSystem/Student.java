package studentAcademicSystem;

public class Student {
	int rollNo;
	String name;
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	void displayStudent(Student s) {
		System.out.println("Roll no:"+s.rollNo+"\r\nName:"+s.name);
	}
	
	
}
