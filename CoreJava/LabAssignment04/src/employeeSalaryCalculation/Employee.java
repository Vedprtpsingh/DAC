package employeeSalaryCalculation;
public class Employee {
	int empId, basicSalary;
	String name;
	public Employee(int empId, int basicSalary, String name) {
		super();
		this.empId = empId;
		this.basicSalary = basicSalary;
		this.name = name;
	}
	void displayEmployeeDetails(Employee e) {
		System.out.println("Emp Nane: "+e.name+", Emp ID: "+e.empId + ", Emp Basic Salary: "+e.basicSalary);
	}
}
