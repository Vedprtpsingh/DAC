package test;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import employee.Employee;

public class Main {
	public static void main(String[] args) {
		Employee e1=new Employee(111,18,"VED");
		Employee e2=new Employee(12,10,"VEED");
		Employee e3=new Employee(13,18,"VEPD");
		Employee e4=new Employee(14,19,"VEDLL");
		
		HashMap<Integer,Employee> hm=new HashMap<>();
		hm.put(e1.getId(),e1);
		hm.put(e2.getId(),e2);
		hm.put(e3.getId(),e3);
		hm.put(e4.getId(),e4);
		for(Entry<Integer,Employee> emp:hm.entrySet()) {
			System.out.println(emp.getKey());
			System.out.println(emp.getValue().getAge()+emp.getValue().getName());
		}
	}
}
