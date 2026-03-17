package hotelRoomBookingSystem;
public class Room {
	int roomNumber;
	String roomType;
	int pricePerNight, numberOfDays;
	public Room(int roomNumber, String roomType, int pricePerNight, int numberOfDays) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.pricePerNight = pricePerNight;
		this.numberOfDays = numberOfDays;
	}
	public int getPricePerNight() {
		return pricePerNight;
	}
	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	public int getNumberOfDays() {
		return numberOfDays;
	}
	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	class Booking{

		public float totalBill(int pricePerNight, int numberOfDays) {
			// TODO Auto-generated method stub
			double total=0;
			total=pricePerNight*numberOfDays;
			if(numberOfDays>5) {
				total=total-total*(0.2);
			}
			return (float) total;
		}
		
	}
	

}
