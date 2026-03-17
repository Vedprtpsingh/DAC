package vehicleAndCar;

public class Main {

	public static void main(String[] args) {
		Car c=new Car("KA01AB1234","Toyota",150000);
		c.showVehicleInfo(c);
		System.out.println("Car Price: "+c.displayCarPrice());
	}

}
