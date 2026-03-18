package objectBusinessOperations;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Student[] st=new Student[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter Student id: ");
			st[i].id=sc.nextInt();
			System.out.println("Enter Student name: ");
			st[i].name=sc.next();
			System.out.println("Enter Marks:");
			st[i].marks=sc.nextDouble();
		}

	}

}
