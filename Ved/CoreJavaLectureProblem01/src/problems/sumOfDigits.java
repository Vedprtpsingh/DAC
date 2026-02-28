package problems;

import java.util.Scanner;

public class sumOfDigits {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num=s.nextInt();
		int sum=0;
		while(num!=0) {
			int a=num%10;
			sum=sum+a;
			num=num/10;
		}
		System.out.println("The sum of digit is "+sum);
	}
}
