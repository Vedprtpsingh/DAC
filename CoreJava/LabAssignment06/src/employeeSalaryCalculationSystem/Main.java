package employeeSalaryCalculationSystem;
abstract class Employee{
	int empId;
	String name;
	
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	abstract void calculateSalary();
	void displayEmployee() {
		System.out.print("Employee Name: "+name+", Employee ID: "+empId);
	}

}
class FullTimeEmployee extends Employee{
	int basic,hra,allowance;

	public FullTimeEmployee(int empId, String name, int basic, int hra, int allowance) {
		super(empId, name);
		this.basic = basic;
		this.hra = hra;
		this.allowance = allowance;
	}

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		int salary=basic+hra+allowance;
		System.out.println(", Salary: "+salary);
	}
	

	
}
class ContractEmployee extends Employee{
	int hoursWorked , ratePerHour;

	public ContractEmployee(int empId, String name, int hoursWorked, int ratePerHour) {
		super(empId, name);
		this.hoursWorked = hoursWorked;
		this.ratePerHour = ratePerHour;
	}

	@Override
	void calculateSalary() {
		// TODO Auto-generated method stub
		int salary=hoursWorked*ratePerHour;
		System.out.println(", Salary: "+salary);
		
	}
	

	
}

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new FullTimeEmployee(77, "Ved", 77, 8, 9899);
		e.displayEmployee();
		e.calculateSalary();
		
		e=new ContractEmployee(7880, "Abhi", 23, 700);
		e.displayEmployee();
		e.calculateSalary();
	}
}
