package studentManagement;

public class Student {
	
//	student_id	INT
//	student_name	VARCHAR(50)
//	course	VARCHAR(50)
//	marks	INT
//	city	VARCHAR(50)
	
	int sid;
	String sname;
	String course;
	int marks;
	String city;
	public Student(int sid, String sname, String course, int marks, String city) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.course = course;
		this.marks = marks;
		this.city = city;
	}
	
}
