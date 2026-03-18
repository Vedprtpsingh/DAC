package hotelRoomBookingSystem;
public class HotelApp {
	public static void main(String[] args) {
		Room r=new Room(1001, "AC", 2000, 7);
		Room.Booking inner=r.new Booking();
		System.out.println(inner.totalBill(r.getPricePerNight(),r.getNumberOfDays()));

	}

}
