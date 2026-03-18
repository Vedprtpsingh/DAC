package employeeSalaryManagementSystem;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee e=new Employee(1001,"Ved",1300);
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Ename: ");
//		e.setEmpName(sc.next());
//		System.out.println("Enter EID: ");
//		e.setEmpId(sc.nextInt());
//		System.out.println("Enter ESalary: ");
//		e.setBasicSalary(sc.nextInt());
//		System.out.println("Basic Salary "+e.basicSalary);
//		
		Employee.SalaryCalculator inner=e.new SalaryCalculator();
		inner.Calculator();
	}
}
