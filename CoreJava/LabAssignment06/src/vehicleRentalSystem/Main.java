package vehicleRentalSystem;
interface Rental{
	void rentVehicle(int days);
	float calculateRent(int days);
	void displayDetails();

}
class Car implements Rental{
	
	public Car(String vehicleId, String vehicleName, float rentPerDay) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.rentPerDay = rentPerDay;
	}

	String vehicleId;
	String vehicleName;
	float rentPerDay;

	

	@Override
	public void rentVehicle(int days) {
		// TODO Auto-generated method stub
		System.out.print(", Rent: "+calculateRent(days));

	}

	@Override
	public float calculateRent(int days) {
		float rent=days*rentPerDay;
		if(days>5) {
			rent=rent -(float) (rent*(0.1));
		}
		// TODO Auto-generated method stub
		return rent;
	}

	@Override
	public void displayDetails() {
		System.out.print("Car ID: "+vehicleId+", Vehicle Name: "+vehicleName+", Rent Per Day: "+rentPerDay);
	}
	
	
}
class Bike implements Rental{
	String vehicleId;
	String vehicleName;
	float rentPerDay;

	public Bike(String vehicleId, String vehicleName, float rentPerDay) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleName = vehicleName;
		this.rentPerDay = rentPerDay;
	}

	@Override
	public void rentVehicle(int days) {
		// TODO Auto-generated method stub
		System.out.print(", Rent: "+calculateRent(days));
	}

	@Override
	public float calculateRent(int days) {
		// TODO Auto-generated method stub
		float rent=days*rentPerDay;
		if(days>3) {
			rent=rent -(float) (rent*(0.05));
		}
		return rent;
		
	}

	@Override
	public void displayDetails() {
		System.out.print("Bike ID: "+vehicleId+", Vehicle Name: "+vehicleName+", Rent Per Day: "+rentPerDay);
	}
	
}

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rental r=new Car("car3737h", "Thar", 3000);
		r.displayDetails();
		r.rentVehicle(13);
		System.out.println();
		
		r=new Bike("BB90787", "G70", 700);
		r.displayDetails();
		r.rentVehicle(13);
	}

}
