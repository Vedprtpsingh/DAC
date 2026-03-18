package employeeRoleSystem;

public class Employee {
	int empId;
	String empName;
	
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	void displayEmployee() {
		System.out.println("Employee ID: " +empId+ "\r\nName: " + empName);
	}

}
