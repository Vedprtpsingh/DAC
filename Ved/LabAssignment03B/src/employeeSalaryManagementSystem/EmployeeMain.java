package employeeSalaryManagementSystem;
import java.util.Scanner;
public class EmployeeMain {
	public static void main(String[] args) {
		Employee[] e=new Employee[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<e.length;i++) {
			System.out.println("Enter ID, NAME, SALARY");
			e[i]=new Employee(sc.nextInt(), sc.next(),sc.nextInt());
		}
		for(Employee emp:e) {
			SalaryCalculator.calculator(emp);
		}
	}
}
