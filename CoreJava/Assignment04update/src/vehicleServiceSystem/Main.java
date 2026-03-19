package vehicleServiceSystem;
class Vehicle{
	String vehicleNumber, brand;
	public Vehicle(String vehicleNumber, String brand) {
		this.vehicleNumber = vehicleNumber;
		this.brand = brand;
	}
}
class Car extends Vehicle{
	public Car(String vehicleNumber, String brand) {
		super(vehicleNumber, brand);
	}
	void calculateServiceCost() {
		System.out.println("Service Cost of Car");
	}
}
class Bike extends Vehicle{
	public Bike(String vehicleNumber, String brand) {
		super(vehicleNumber, brand);
	}
	void calculateServiceCost() {
		System.out.println("Service Cost of Bike");
	}
}
public class Main {
	public static void main(String[] args) {
		Car c=new Car("12MN453", "ABC");
		c.calculateServiceCost();
		
		Bike b=new Bike("BBMN453", "ABCD");
		b.calculateServiceCost();
	}
}
