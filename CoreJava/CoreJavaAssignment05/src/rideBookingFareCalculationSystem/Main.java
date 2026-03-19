package rideBookingFareCalculationSystem;

class Ride {
    int rideId;
    String passengerName;
    double distance;

    public Ride(int rideId, String passengerName, double distance) {
        this.rideId = rideId;
        this.passengerName = passengerName;
        this.distance = distance;
    }

    void rideDetails() {
        System.out.print("Ride ID: " + rideId + ", Passenger Name: " + passengerName + ", Total Distance: " + distance);
    }

    double calculateFare(double distance) {
        return 0;
    }
}

class BikeRide extends Ride {
    String driverName;
    int bikeRidePricePerKM;

    public BikeRide(int rideId, String passengerName, double distance, String driverName, int bikeRidePricePerKM) {
        super(rideId, passengerName, distance);
        this.driverName = driverName;
        this.bikeRidePricePerKM = bikeRidePricePerKM;
    }

    @Override
    double calculateFare(double distance) {
        return distance * bikeRidePricePerKM;
    }

    @Override
    public String toString() {
        return ", DriverName: " + driverName + ", BikeRidePrice: " + calculateFare(distance);
    }
}

class CabRide extends Ride {
    String driverName;
    int carRidePricePerKM;

    public CabRide(int rideId, String passengerName, double distance, String driverName, int carRidePricePerKM) {
        super(rideId, passengerName, distance);
        this.driverName = driverName;
        this.carRidePricePerKM = carRidePricePerKM;
    }

    @Override
    double calculateFare(double distance) {
        return distance * carRidePricePerKM;
    }

    @Override
    public String toString() {
        return ", DriverName: " + driverName + ", CabRidePrice: " + calculateFare(distance);
    }
}

class AutoRide extends Ride {
    String driverName;
    int autoRidePricePerKM;

    public AutoRide(int rideId, String passengerName, double distance, String driverName, int autoRidePricePerKM) {
        super(rideId, passengerName, distance);
        this.driverName = driverName;
        this.autoRidePricePerKM = autoRidePricePerKM;
    }

    @Override
    double calculateFare(double distance) {
        return distance * autoRidePricePerKM;
    }

    @Override
    public String toString() {
        return ", DriverName: " + driverName + ", AutoRidePrice: " + calculateFare(distance);
    }
}

public class Main {
    public static void main(String[] args) {
        BikeRide b = new BikeRide(878, "Pratap", 13, "Manash", 19);
        b.rideDetails();
        System.out.println(b.toString());

        CabRide c = new CabRide(879, "Ved", 15, "Ramesh", 25);
        c.rideDetails();
        System.out.println(c.toString());

        AutoRide a = new AutoRide(880, "Singh", 10, "Suresh", 12);
        a.rideDetails();
        System.out.println(a.toString());
    }
}
