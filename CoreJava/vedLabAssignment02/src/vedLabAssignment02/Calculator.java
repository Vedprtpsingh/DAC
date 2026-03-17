package vedLabAssignment02;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		options();
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Option Number: ");
			int opt=sc.nextInt();
			switch(opt) {
			case 1:
				System.out.println(addition(sc.nextInt(),sc.nextInt()));
				break;
			case 2:
				System.out.println(subtraction(sc.nextInt(),sc.nextInt()));
				break;
			case 3:
				System.out.println(multiplication(sc.nextInt(),sc.nextInt()));
				break;
			case 4:
				System.out.println(division(sc.nextInt(),sc.nextInt()));
				break;
			case 0:
				System.exit(0);
				break;
			default :
				System.out.println("Invalid Input");
				break;
			}
			options();
		}
	}
	private static double division(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	private static int  multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	private static int subtraction(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	public static int addition(int a,int b) {
		return a+b;
		
	}

	public static void options() {
		System.out.println("Select one option and Two numbers:\r\n" + 
				"1.	Addition\r\n" + 
				"2.	Subtraction\r\n" + 
				"3.	Multiplication\r\n" + 
				"4.	Division\r\n" + 
				"0.	Exit\r\n" + 
				"");
	}
}
