package movieTicketBookingSystem;

public class MovieApp {

	public static void main(String[] args) {
		Movie m=new Movie("JK", 430, 7);
		Movie.TicketBooking inner=m.new TicketBooking();
		System.out.println(inner.discount(m.ticketPrice,m.numberOfTickets));
	}

}
