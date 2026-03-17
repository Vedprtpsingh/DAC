package vehicleAndCar;

public class Vehicle {
	String vehicleNumber, brand;
	
	public Vehicle(String vehicleNumber, String brand) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.brand = brand;
	}
	void showVehicleInfo(Vehicle v) {
		System.out.println("Car Number: "+vehicleNumber+", Brand: "+brand);
		
	}
}
