package vedLabAssignment02;

import java.util.Scanner;

public class UpdateArrayAElement { 

	public static void main(String[] args) {
		System.out.println("Size of the Array: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] array=ReverseAnArray.createArray(n);
		System.out.println("Enter the index: ");
		int i=sc.nextInt();
		System.out.println("Enter the ELement: ");
		int ele=sc.nextInt();
		System.out.println("Array before updating");
		ReverseAnArray.printArray(array);
		updateArray(i,ele,array);
		System.out.println("Array after updating");
		ReverseAnArray.printArray(array);
	}

	public static void updateArray(int i, int ele, int[] array) {
			array[i]=ele;
}
}
