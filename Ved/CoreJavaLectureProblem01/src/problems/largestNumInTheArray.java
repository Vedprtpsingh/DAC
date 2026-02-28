package problems;

import java.util.Scanner;

public class largestNumInTheArray {
	public static void main(String[] args) {
		System.out.println("Enter the total Number of Elements in the Array: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] array=new int[n];
		int i=0;
		int largest=Integer.MIN_VALUE;;
		while(n>0) {
			array[i]=s.nextInt();
			if(array[i]>largest) {
				largest=array[i];
			}
			i++;
			n--;
		}
		System.out.println("The Largest Number is "+largest);
	}
}
