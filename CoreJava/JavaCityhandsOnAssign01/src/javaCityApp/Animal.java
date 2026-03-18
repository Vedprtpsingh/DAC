package javaCityApp;
public class Animal {
	void makeSound() {
		System.out.println("Raar Raar");
	}
	void animalHealth() {
		
	}
}
class Dog extends Animal{
	void makeSound() {
		System.out.println("Bou Bou");
	}
	void animalHealth() {
		System.out.println("Dog is Healthy");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("Meow Meow");
	}
	void animalHealth() {
		System.out.println("Cat is Healthy");
	}
}
class VetCheck extends Animal{
	void checkHealth(Animal a){
		a.animalHealth();
	}
}