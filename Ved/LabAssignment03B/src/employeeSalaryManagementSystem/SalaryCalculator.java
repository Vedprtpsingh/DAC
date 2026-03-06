package employeeSalaryManagementSystem;
public class SalaryCalculator {
	public SalaryCalculator(int empId, String empName, int basicSalary) {
		
	}
	public static void calculator(Employee emp) {
		System.out.println("Basic: "+ emp.getBasicSalary());
		double hra=emp.getBasicSalary()*0.2;
		System.out.println("HRA: "+hra);
		double da=emp.getBasicSalary()*0.1;
		System.out.println("DA: "+da);
		System.out.println("Total: "+(hra+da+emp.getBasicSalary()));
	}
}
