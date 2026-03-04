package studentResultProcessingSystem;

public class StudentMain {
	public static void main(String[] args) {
		Student s=new Student(21, "krish", 30);
		Student.result inner=s.new result();
		System.out.println(inner.Grade(s.marks));
	}
}
