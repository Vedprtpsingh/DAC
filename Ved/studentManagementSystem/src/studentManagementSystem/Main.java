package studentManagementSystem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Student> studentList=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		Student st=new Student();
		System.out.println("Select Your Choise: ");
		int c=sc.nextInt();
		switch(choiseSelect(c)){
		case 1:
			// add student
			studentList.add(addStudent());
			break;
		case 2:
			studentList.remove(deleteStudentData());
		}
	}
	public static Student deleteStudentData( ) {
		Student st=new Student();
		// TODO Auto-generated method stub
		return null;
	}

	public static int choiseSelect(int c) {
		System.out.println("1. Add student");
		System.out.println("2. Add student data");
		System.out.println("3. delete student");
		System.out.println("0. Exit");
		return c;
	}

	public static Student addStudent() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Student st=new Student();
		System.out.println("Enter the Student Name: ");
		st.setName(sc.next());
		System.out.println("Enter the Student Number: ");
		st.setStudentNumber(sc.nextInt());
		System.out.println("Enter the Student address: ");
		st.setAddress(sc.next());
		System.out.println("Enter the Student Mobile Number: ");
		st.setMobileNo(sc.nextDouble());
		System.out.println("Enter the Student Course: ");
		st.setCourse(sc.next());
		System.out.println("Student is hosteler true/false: ");
		st.setHostel(sc.nextBoolean());
		System.out.println(st);
		return st;
	}
}
