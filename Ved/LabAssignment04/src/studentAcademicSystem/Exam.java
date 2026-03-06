package studentAcademicSystem;

public class Exam extends Student{
	int marks1,marks2;

	public Exam(int rollNo, String name, int marks1, int marks2) {
		super(rollNo, name);
		this.marks1 = marks1;
		this.marks2 = marks2;
	}
	void displayMarks(Exam e) {
		System.out.println("Marks : "+e.marks1+" "+e.marks2);
	}
	
}
