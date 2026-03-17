package ex;

public class Myexception extends Exception {
	void ageLimit(int age) {
		if(age<18) {
			System.out.println("Your Age Not According to out critery");
		}
	}
}
