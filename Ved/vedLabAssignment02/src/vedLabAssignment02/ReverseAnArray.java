package vedLabAssignment02;

import java.util.Scanner;

public class ReverseAnArray {
	public static void main(String[] args) {
		System.out.println("Size of the Array: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] array=createArray(n);
		printArray(array);
		reverseArray(array);
		printArray(array);
	}

	public static int[] createArray(int n) {
		int[] array=new int[n];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of Array: ");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		return array;
		
	}

	public static void reverseArray(int[] array) {
		int i=0;
		int j=array.length-1;
		while(i<j) {
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			i++;
			j--;
		}
	}

	public static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}
