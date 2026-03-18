package javaCityApp;
public class Vehicles {
	int speed,feul;
	public Vehicles(int speed, int feul) {
		this.speed = speed;
		this.feul = feul;
	}
	public void move() {
		System.out.println("Vehicle is moving");
	}
	public void soundHorn() {
		System.out.println(" Ring Ring");

	}
}
class Bicycle extends Vehicles{
	public Bicycle(int speed, int feul) {
		super(speed, feul);
	}
	public void move() {
		System.out.println("Pedaling at ["+speed+"] km/h");
	}
}
class Car extends Vehicles{
	public Car(int speed, int feul) {
		super(speed, feul);
	}
	public void move() {
		System.out.println("Driving at ["+speed+"] km/h");

	}
	public void soundHorn() {
		System.out.println(" Beep Beep");

	}
}
