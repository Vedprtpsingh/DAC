package employeeSalaryManagementSystem;
public class Employee {
	int empId;
	String empName;
	int basicSalary;
	public Employee(int empId, String empName, int basicSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
	}
	public int getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}
}