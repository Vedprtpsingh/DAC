package problems;

import java.util.Scanner;

public class reverseOfNumber {
	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int revnum=0;
		while(num!=0) {
			int a=num%10;
			revnum=revnum*10+a;
			num=num/10;
		}
		System.out.println("The Reverse Number is "+revnum);
	}
}
