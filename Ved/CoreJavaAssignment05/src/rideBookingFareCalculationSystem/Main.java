package rideBookingFareCalculationSystem;
class Ride{
	int rideId;String passengerName;
	double distance;
	
	public Ride(int rideId, String passengerName, double distance) {
		super();
		this.rideId = rideId;
		this.passengerName = passengerName;
		this.distance=distance;
	}
	void  rideDetails() {
		System.out.println("Ride ID: "+rideId+", Passenger Name: "+passengerName+", Total Distance: "+distance);
	}
	double calculateFare(double distance) {
		return 0;
	}
}
class BikeRide extends Ride{
	String driverName;
	int bikeRidePricePerKM;
	public BikeRide(int rideId, String passengerName, double distance, String driverName, int bikeRidePricePerKM) {
		super(rideId, passengerName, distance);
		this.driverName = driverName;
		this.bikeRidePricePerKM = bikeRidePricePerKM;
	}
	@Override
	double calculateFare(double distance) {
		return distance*bikeRidePricePerKM;
	}
	
}
class CabRide extends Ride{
	String driverName;
	int carRidePricePerKM;
	public CabRide(int rideId, String passengerName, double distance, String driverName, int carRidePricePerKM) {
		super(rideId, passengerName, distance);
		this.driverName = driverName;
		this.carRidePricePerKM = carRidePricePerKM;
	}


	@Override
	public String toString() {
		return "CabRide [driverName=" + driverName + ", carRidePrice=" + carRidePrice + ", rideId=" + rideId
				+ ", passengerName=" + passengerName + "]";
	}


	@Override
	double calculateFare(double distance) {
		// TODO Auto-generated method stub
		return distance*carRidePricePerKM;
	}
	
	
	
}
class AutoRide extends Ride{
	String driverName;
	int autoRidePricePerKM;
	public AutoRide(int rideId, String passengerName, double distance, String driverName, int autoRidePricePerKM) {
		super(rideId, passengerName, distance);
		this.driverName = driverName;
		this.autoRidePricePerKM = autoRidePricePerKM;
	}
	@Override
	public String toString() {
		return "AutoRide [driverName=" + driverName + ", autoRidePrice=" + autoRidePrice + ", rideId=" + rideId
				+ ", passengerName=" + passengerName + "]";
	}
	@Override
	double calculateFare(double distance) {
		// TODO Auto-generated method stub
		return distance*autoRidePricePerKM;
	}

	
}

public class Main {

	public static void main(String[] args) {
		
	}

}
