package vehicleAndCar;
public class Car extends Vehicle {
	int price;
	int displayCarPrice(){
		return price;
	}
	public Car(String vehicleNumber, String brand,int price) {
		super(vehicleNumber,brand);
		this.price = price;
	}
	
}
