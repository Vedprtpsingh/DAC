package studentManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");			

		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","cdacacts");
	
	    Statement smt=con.createStatement();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Select One Option\r\n" + 
					"1. Insert Student Record\r\n" + 
					"2. Update Student Record\r\n" + 
					"3. Delete Student Record\r\n" + 
					"4. Display All Student Records\r\n" + 
					"5. Search Student by ID\r\n" + 
					"6. Display Students Based on Condition\r\n" + 
					"0. Exit\r\n");
			int n=sc.nextInt();
			
			
			switch(n) {
			case 1:
				Services.insertStudentRecord(smt);
				break;
			case 2:
				Services.updateStudentRecord(smt);
				break;
			case 3:
				Services.deleteStudentRecord(smt);
				break;
			case 4:
				Services.displayAllStudentRecords(smt);
				break;
			case 5:
				Services.searchStudentbyID(smt);
				break;
			case 6:
				Services.displayStudentsBasedonCondition(smt);
				break;
			case 0:
				System.out.println("Thank YOU!");
				System.exit(0);
				break;
			default:
				System.out.println("Enter a Valid Number: ");
				break;
			}
		}
	}
}
