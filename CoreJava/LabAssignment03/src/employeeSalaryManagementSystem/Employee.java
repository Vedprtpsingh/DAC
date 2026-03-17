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



	public class SalaryCalculator{

		public void Calculator() {	
			System.out.println("Basic: "+getBasicSalary());
			double hra=getBasicSalary()*0.2;
			System.out.println("HRA: "+hra);
			double da=getBasicSalary()*0.1;
			System.out.println("DA: "+da);
			System.out.println("Total: "+(hra+da+getBasicSalary()));
		}
	}
}
