package rideBookingFareCalculationSystem;
class Ride{
	int rideId;String passengerName;

	public Ride(int rideId, String passengerName) {
		this.rideId = rideId;
		this.passengerName = passengerName;
	}
	
	@Override
	public String toString() {
		return "Ride [rideId=" + rideId + ", passengerName=" + passengerName + "]";
	}

	void calculateFare(double distance) {
		System.out.println("Fare of the ride is: "+(distance*18));
	}
}
class BikeRide extends Ride{
	String driverName;
	int bikeRidePrice;
	public BikeRide(int rideId, String passengerName, String driverName, int bikeRidePrice) {
		super(rideId, passengerName);
		this.driverName = driverName;
		this.bikeRidePrice = bikeRidePrice;
	}
	@Override
	public String toString() {
		return "BikeRide [driverName=" + driverName + ", bikeRidePrice=" + bikeRidePrice + ", rideId=" + rideId
				+ ", passengerName=" + passengerName + "]";
	}

	
}
class CabRide extends Ride{
	String driverName;
	int carRidePrice;
	public CabRide(int rideId, String passengerName, String driverName, int carRidePrice) {
		super(rideId, passengerName);
		this.driverName = driverName;
		this.carRidePrice = carRidePrice;
	}
	@Override
	public String toString() {
		return "CabRide [driverName=" + driverName + ", carRidePrice=" + carRidePrice + ", rideId=" + rideId
				+ ", passengerName=" + passengerName + "]";
	}
	
	
}
class AutoRide extends Ride{
	String driverName;
	int autoRidePrice;
	public AutoRide(int rideId, String passengerName, String driverName, int autoRidePrice) {
		super(rideId, passengerName);
		this.driverName = driverName;
		this.autoRidePrice = autoRidePrice;
	}
	@Override
	public String toString() {
		return "AutoRide [driverName=" + driverName + ", autoRidePrice=" + autoRidePrice + ", rideId=" + rideId
				+ ", passengerName=" + passengerName + "]";
	}

	
}

public class Main {

	public static void main(String[] args) {
		BikeRide br=new BikeRide(101, "Ved", "Mr.Shan", 10);
		System.out.println(br.toString());
		CabRide cr=new CabRide(102, "Abhi", "natan", 2);
		System.out.println(cr.toString());
		AutoRide ar=new AutoRide(103, "Shivam", "askfklan", 10);
		System.out.println(ar.toString());
	}

}
