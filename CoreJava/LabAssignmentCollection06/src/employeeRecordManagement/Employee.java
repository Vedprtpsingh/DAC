package employeeRecordManagement;

public class Employee {
	int empId;
	String empName,department;
	int salary;
	public Employee(int empId, String empName, String department, int salary) {
		this.empId = empId;
		this.empName = empName;
		this.department = department;
		this.salary = salary;
	}
}
