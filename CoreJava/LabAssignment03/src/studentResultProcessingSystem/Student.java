package studentResultProcessingSystem;

public class Student {
	int rollNo;
	String name;
	int marks;
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	class result{
		public char Grade(int m) {
		if(m>=80) {			
			return 'A';
		}
		else if(m>=60) {
			return 'B';
		}
		else if(m>=40) {
			return 'C';
		}
		return 'F';
		}
		
	}
	

}
