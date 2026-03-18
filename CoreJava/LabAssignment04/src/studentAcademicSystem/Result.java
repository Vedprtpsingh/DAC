package studentAcademicSystem;

public class Result extends Exam{

	public Result(int rollNo, String name, int marks1, int marks2) {
		super(rollNo, name, marks1, marks2);
	}
	int calculateTotal(Result r) {
		return (r.marks1+r.marks2);
	}
	int displayResult(Result r) {
		 int res=calculateTotal(r);
		 return res;
	}
}
