package studentAcademicSystem;

public class Main {

	public static void main(String[] args) {
		Result r=new Result(1001, "Abhi", 40, 53);
		r.displayStudent(r);
		r.displayMarks(r);
		System.out.println("Total Marks: "+r.displayResult(r));
	}

}
