package movieTicketBookingSystem;

public class Movie {
	String movieName;
	int ticketPrice;
	int numberOfTickets;
	
	public Movie(String movieName, int ticketPrice, int numberOfTickets) {
		super();
		this.movieName = movieName;
		this.ticketPrice = ticketPrice;
		this.numberOfTickets = numberOfTickets;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	class TicketBooking{

		public double discount(int ticketPrice, int numberOfTickets) {
			// TODO Auto-generated method stub
			double total=ticketPrice*numberOfTickets;
			if(numberOfTickets>5) {
				total=total-100;
			}
			return total;
		}
		
	}
}
