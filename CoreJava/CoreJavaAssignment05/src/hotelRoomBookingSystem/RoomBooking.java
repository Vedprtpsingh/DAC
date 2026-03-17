package hotelRoomBookingSystem;

public class  RoomBooking{
	int days,costPerday,foodCharges;

	public RoomBooking() {
		super();
	}
	public RoomBooking(int days, int costPerday, int foodCharges) {
		super();
		this.days = days;
		this.costPerday = costPerday;
		this.foodCharges = foodCharges;
	}
	void calculateCost(int numberofdays) {
		System.out.println("Cost for Number of days: "+(numberofdays*1000));
	}
	void calculateCost(int days,int cost) {
		System.out.println("Cost for Number of days: "+(days*cost));
			}
	void calculateCost(int days ,int cost,int foodcharges) {
		System.out.println("Cost for Number of days: "+((days*cost)+foodcharges));
	}
	public static void main(String[] args) {
		RoomBooking r=new RoomBooking();
		r.costPerday=1000;
		r.calculateCost(r.days, r.costPerday,r.foodCharges);
		RoomBooking r2=new RoomBooking(2, 1500, 4000);
		r.calculateCost(r2.days, r2.costPerday, r2.foodCharges);
		
	}
}
