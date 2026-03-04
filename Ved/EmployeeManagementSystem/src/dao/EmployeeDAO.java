package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Employee;

public class EmployeeDAO {
	static List<Employee> employeeList=new ArrayList<Employee>();
	public static Employee addEmployee() {
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		e.setEname(sc.next());
		System.out.println("Enter Employee ID: ");
		e.setEid(sc.nextInt());
		System.out.println("Enter Employee Salary: ");
		e.setEsal(sc.nextInt());
		System.out.println("Enter Employee Address: ");
		e.setEaddress(sc.next());
		System.out.println("Enter Employee Mail: ");
		e.setEmail(sc.next());
		System.out.println("Enter Employee Mobile Number: ");
		e.setEmn(sc.nextDouble());
		employeeList.add(e);
		System.out.println(e);
		return e;
	}

	public static Object deleteEmployeeData() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void employeeSearchByName() {
		// TODO Auto-generated method stub
		
	}

	public static void employeeSearchByID() {
		// TODO Auto-generated method stub
		
	}

	public static void employeeSearchByMail() {
		// TODO Auto-generated method stub
		
	}

	public static void employeeSearchByMN() {
		// TODO Auto-generated method stub
		
	}
	
}
