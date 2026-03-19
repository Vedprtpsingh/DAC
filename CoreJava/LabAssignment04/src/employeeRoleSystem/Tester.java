package employeeRoleSystem;

public class Tester extends Employee {
	String testingTool;

	public Tester(int empId, String empName, String testingTool) {
		super(empId, empName);
		this.testingTool = testingTool;
	}


	void showTesterDetails() {
		this.displayEmployee();
		System.out.println("Testing Tool: "+testingTool);
	}

}
