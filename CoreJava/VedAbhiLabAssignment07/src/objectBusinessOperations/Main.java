package objectBusinessOperations;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		StudentManagment sm=new StudentManagment();
		while(true) {
			System.out.println("1. Add Stuident\r\n" + 
					"2. Display Student\r\n" + 
					"3. Search Student\r\n" + 
					"4. Update Student\r\n" + 
					"5. Delete Student\r\n" + 
					"0. Exit");
			System.out.println("Enter Choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				sm.addStudent();
				break;
			case 2:
				sm.displayStudent();
				break;
			case 3:
				sm.searchStudent();
				break;
			case 4:
				sm.updateStudent();
				break;
			case 5:
				sm.deleteStudent();
				break;
			case 0:
				System.exit(0);
				break;
			default :
				System.out.println("Enter a valid Choice");
				
			}
		}
	}
}
