package main;

import java.util.Scanner;

import dao.EmployeeDAO;
import model.Employee;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		while (true) {
			choiseSelect();
			int c = sc.nextInt();
			switch (c) {
			case 0:
				System.exit(0);
				break;
			case 1:
				// add student
				EmployeeDAO.addEmployee();
				break;
			case 2:
				EmployeeDAO.deleteEmployeeData();
				break;
			case 3:
				System.out.println(EmployeeDAO.employeeList);
				break;
			case 4:
				System.out.println("Select One: ");
				employeeSearchChoiseSelect();
				int escs = sc.nextInt();
				switch (escs) {
				case 1:
					EmployeeDAO.employeeSearchByName();
					break;
				case 2:
					EmployeeDAO.employeeSearchByID();
					break;
				case 3:
					EmployeeDAO.employeeSearchByMail();
					break;
				case 4:
					EmployeeDAO.employeeSearchByMN();
					break;
				default:
					System.out.println("Employee Unavalible");
				}
				break;
			default:
				System.out.println("Invalid Datils");

			}
		}
	}

	private static void employeeSearchChoiseSelect() {
		// TODO Auto-generated method stub
		
		System.out.println("		1. Search By Employee Name:\r\n" + "		2. Search By Employee ID:\r\n"
				+ "		3. Search By Employee Mail:\r\n" + "		4. Search By Employee Mobile Number:");

	}

	private static void choiseSelect() {
		System.out.println("		Select Your Choise: \r\n" + "		1. Add Employee\r\n"
				+ "		2. Remove Employee\r\n" + "		3. Show All Employee\r\n" + "		4. Search Employee\r\n" + "		0. Exit");

	}
}
