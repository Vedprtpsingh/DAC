package javaCityApp;

public class Animal {
	void makeSound() {
		System.out.println("Raar Raar");
	}
}

class Dog extends Animal{
	void makeSound() {
		System.out.println("Bou Bou");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("Meow Meow");
	}
}
