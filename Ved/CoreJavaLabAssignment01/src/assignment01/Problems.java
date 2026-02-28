package assignment01;

import java.util.Scanner;

public class Problems {
	// --------------P1--------------
	public static double areaOfRectangle(double length, double width) {

		return length * width;
	}

	// --------------P2--------------
	public static double clesiusToFarnheit(double celsius) {

		return (celsius * (9 / 5)) + 32;
	}

	// --------------P3--------------
	public static int avgOfThreeSub(int sub1, int sub2, int sub3) {
		return (sub1 + sub2 + sub3) / 3;
	}

	public static int totalOfThreeSub(int sub1, int sub2, int sub3) {
		return (sub1 + sub2 + sub3);
	}

	// --------------P4--------------
	public static void intSwap(int a, int b) {
		System.out.print("Before swap a = " + a + " b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(" || After swap a = " + a + " b = " + b);
	}

	// --------------P5--------------
	public static double finalPrice(double productPrice, double discount) {
		double ans = productPrice - (productPrice * discount) / 100;
		return ans;
	}

	// --------------P6--------------
	public static String passOrFail(int marks) {
		if (marks >= 40) {
			return "pass";
		}
		return "fail";
	}

	// --------------P7--------------
	public static String evenOrOdd(int num) {
		if (num % 2 == 0) {
			return "even";
		}
		return "odd";
	}

	// --------------P8--------------
	public static int largestNumber(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		}
		return num2;
	}

	// --------------P9--------------
	public static double productValuesi(double principle, double rate, int time) {
		return (principle * rate * time) / 100;
	}

	public static String productValue(double principle, double rate, int time) {
		if (productValuesi(principle, rate, time) < 1000) {
			return "Price is Low";
		}
		return "Price is High";
	}

	// --------------P10--------------
	public static String age(int age) {
		if (age < 15) {
			return "Child";
		} else if (age < 18) {
			return "Teen";
		}
		return "Adult";
	}

	// --------------P11--------------
	private static double finalSalary(double salary,double perfbonus,double comprobonus,double festbonus,double incenbonus) {
		return salary*(100+perfbonus+comprobonus+festbonus+incenbonus)/100;
	}

	// --------------P12--------------
	private static String charUpperOrLowerCase(char ch) {
		if(ch>='a' & ch<='z') {
			return "Lower Case";
		}else if(ch>='A' & ch<='Z') {
			return "Upper Case";
		}
		return "Invalid Character";
	}

	// --------------P13--------------
	private static String numberPossitiveOrNegative(int a) {
		// TODO Auto-generated method stub
		if(a>0) {
			return "Possitive";
		}else if(a<0) {
			return "Negative";
		}
		return "Zero";
	}
	// --------------P14--------------
	private static double totalElectricty(int a, double perunitrate) {
		// TODO Auto-generated method stub
		return a*perunitrate;
	}
	// --------------P15--------------
	private static String voteEligiblty(int age) {
		// TODO Auto-generated method stub
		if(age>=18) {
			return "eligible";
		}
		return "not eligible";
	}

	public static void problems() {
		System.out.println("Enter the Number of Problem Or 0 for Exit: ");
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
		switch (p) {
		case 1:
			System.out.println("Problem 1. Declare length and width as double variables and calculate the area of a rectangle using arithmetic operators.");
			System.out.println("Enter the Length: ");
			double l = s.nextDouble();
			System.out.println("Enter the Width: ");
			double w = s.nextDouble();
			System.out.println("Area Of Rectangle is = " + areaOfRectangle(l, w));
			break;
		case 2:
			System.out.println("Problem 2. Declare temperature in Celsius (double) and convert it to Fahrenheit using the formula ( F = (C × 9/5) + 32 ).");
			System.out.println("Enter the celsius: ");
			double f = s.nextDouble();
			System.out.println("celsius to farenheit is = " + clesiusToFarnheit(f));
			break;
		case 3:
			System.out.println("Problem 3. Declare three subject marks (int) and calculate the total and average using arithmetic operators.");
			System.out.println("Enter the Marks");
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			System.out.println("Total of Subjects is = " + totalOfThreeSub(a, b, c));
			System.out.println("Avg of Subjects is = " + avgOfThreeSub(a, b, c));
			break;
		case 4:
			System.out.println("Problem 4. Declare two integer variables and swap their values without using a third variable (use arithmetic operators only).");
			System.out.println("Enter the Num 1 :");
			a = s.nextInt();
			System.out.println("Enter the Num 1 :");
			b = s.nextInt();
			intSwap(a, b);
			break;
		case 5:
			System.out.println("Problem 5. Declare product price and discount percentage (double) and calculate the final price after applying the discount.");
			System.out.println("Enter the productPrice :");
			double x = s.nextDouble();
			System.out.println("Enter the discount :");
			double y = s.nextDouble();
			System.out.println("Final Price Of Product is = " + finalPrice(x, y));
			break;
		case 6:
			System.out.println("Problem 6. Declare student name (String) and marks (int); print “Pass” if marks ≥ 40, otherwise print “Fail”.");
			System.out.println("Enter the Marks :");
			a = s.nextInt();
			System.out.println("Final Result Of Student is = " + passOrFail(a));
			break;
		case 7:
			System.out.println("Problem 7. Declare an integer and check whether it is even or odd using modulus operator and if-else statement.");
			System.out.println("Enter the Number :");
			a = s.nextInt();
			System.out.println("Number is = " + evenOrOdd(a));
			break;
		case 8:
			System.out.println("Problem 8. Declare two integers and print the largest number using relational operators and if-else statement.");
			System.out.println("Enter the First Number :");
			a = s.nextInt();
			System.out.println("Enter the Second Number :");
			b = s.nextInt();
			System.out.println(" Largest number is = " + largestNumber(a, b));
			break;
		case 9:
			System.out.println("Problem 9. Declare principal (double), rate (double), and time (int); calculate simple interest and display whether it is high or low based on value.");
			System.out.println("Enter the principle :");
			x = s.nextDouble();
			System.out.println("Enter the Rate :");
			y = s.nextDouble();
			System.out.println("Enter the Time :");
			a = s.nextInt();
			System.out.println("Simple Intrest = " + productValuesi(x, y, a));
			break;
		case 10:
			System.out.println("Problem 10. Declare age (int) and display whether the person is Child, Teenager, or Adult using if-else-if ladder.");
			System.out.println("Enter Your Age :");
			a = s.nextInt();
			System.out.println("You are a = " + age(a));
			break;
		case 11:
			System.out.println("Problem 11. Declare basic salary (double) and calculate final salary after adding bonus based on given condition");
			System.out.println("Enter the salary :");
			double salary = s.nextDouble();
			System.out.println("Enter Bonus in Persent :");
			System.out.println("Performance Bonus: ");
			double perfbonus=s.nextDouble();
			System.out.println("Company Profit Bonus: ");
			double comprobonus=s.nextDouble();
			System.out.println("Festival Bonus: ");
			double festbonus=s.nextDouble();
			System.out.println("Incentive Bonus: ");
			double incenbonus=s.nextDouble();
			System.out.println("Final salary is: " + finalSalary(salary,perfbonus,comprobonus,festbonus,incenbonus));
			break;
		case 12:
			System.out.println("Problem 12. Declare a character variable and check whether it is uppercase or lowercase using relational operators.");
			System.out.println("Enter the Character: ");
			char ch = s.next().charAt(0);
			System.out.println("The charecter is belongs to " + charUpperOrLowerCase(ch));
			break;
		case 13:
			System.out.println("Problem 13. Declare an integer and check whether the number is positive, negative, or zero.");
			System.out.println("Enter the number: ");
			a = s.nextInt();
			System.out.println("The Number is " + numberPossitiveOrNegative(a));
			break;
		case 14:
			System.out.println("Problem 14. Declare number of electricity units (int) and calculate total bill amount based on given rate conditions.");
			System.out.println("Enter total electricity units: ");
			a = s.nextInt();
			System.out.println("Enter the Per Unit Rate :");
			double perunitrate = s.nextDouble();
			System.out.println("Your Total Electricity Bill is: " + totalElectricty(a, perunitrate));
			break;
		case 15:
			System.out.println(
					"Problem 15. Declare age (int) and check whether a person is eligible to vote using if-else statement.");
			System.out.println("Enter Your Age: ");
			int age = s.nextInt();
			System.out.println("You are " + voteEligiblty(age) + " for Vote.");

			break;
		case 0:
			System.out.println("---------------Thank You--------------");
			break;
		default:
			System.out.println("Wrong Input");
			break;
		}
		if (p != 0) {
			problems();
		}
	}

	public static void main(String[] args) {
		problems();

	}
}