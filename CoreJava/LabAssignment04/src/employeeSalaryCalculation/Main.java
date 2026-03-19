package employeeSalaryCalculation;
public class Main {
	public static void main(String[] args) {
		Manager m=new Manager(1001, 10000,"Ravi", 1000);
		m.displayEmployeeDetails(m);
		System.out.println("Total Salary: "+m.calculateSalary(m.basicSalary,m.bonus ));
	}
}