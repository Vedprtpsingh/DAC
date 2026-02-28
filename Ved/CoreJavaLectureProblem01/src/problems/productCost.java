package problems;

import java.util.Scanner;

public class productCost {
	public static void main(String[] args) {
		System.out.println("Enter the Number of products: ");
		Scanner s=new Scanner(System.in);
		int p=s.nextInt();
		int a=p/100;
		int ans=nSum(a)*100+(p%100)*(a+1);
		System.out.println("Total cost of the products is: "+ans);
	}

	private static int nSum(int a) {
		int sum=0;
		while(a!=0) {
			sum=sum+a;
			a=a-1;
		}
		return sum;
	}
}
