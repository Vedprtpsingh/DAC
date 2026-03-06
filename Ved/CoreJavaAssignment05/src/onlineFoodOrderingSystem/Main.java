package onlineFoodOrderingSystem;
class FoodOrder{
	int orderId;String customerName;
	double foodPrice;
	public FoodOrder(int orderId, String customerName,int foodPrice) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.foodPrice = foodPrice;
	}
	void calculateBill(double price) {
	}
	void customerDatils() {
		System.out.print("Customer Order ID: "+orderId+", Customer Name: "+customerName+", Food Price: "+foodPrice);
	}
}

class DineInOrder extends FoodOrder{
	double tablePrice;
	public DineInOrder(int orderId, String customerName, int foodPrice,double tablePrice) {
		super(orderId, customerName, foodPrice);
		this.tablePrice=tablePrice;
	}


	void calculateBill() {
		double price=tablePrice+foodPrice;
		System.out.println(", Total Bill: "+price);
	}
}
class TakeAwayOrder extends FoodOrder{
	double packageCharge;
	public TakeAwayOrder(int orderId, String customerName, int foodPrice,double packageCharge) {
		super(orderId, customerName, foodPrice);
		this.packageCharge=packageCharge;
		// TODO Auto-generated constructor stub
	}
	void calculateBill() {
		double price=packageCharge+foodPrice;
		System.out.println(", Total Bill: "+price);
	}
}
class HomeDeliveryOrder extends FoodOrder{

    double homeDeliveryCharge;
	public HomeDeliveryOrder(int orderId, String customerName, int foodPrice,double homeDeliveryCharge) {
		super(orderId, customerName, foodPrice);
		this.homeDeliveryCharge=homeDeliveryCharge;
	}

	void calculateBill() {
		double price = homeDeliveryCharge+foodPrice;
		System.out.println(", Total Bill: "+price);
	}
}
public class Main {
	public static void main(String[] args) {
//		FoodOrder fo=new FoodOrder(54455, "Ved", 399);
//		fo.customerDatils();
		
		DineInOrder di=new DineInOrder(101, "Preet", 1300, 500);
		di.customerDatils();
		di.calculateBill();
		
		TakeAwayOrder to=new TakeAwayOrder(102, "Ved", 1300, 40);
		to.customerDatils();
		to.calculateBill();

		HomeDeliveryOrder hd=new HomeDeliveryOrder(103, "Abhi", 1300, 99);
		hd.customerDatils();
		hd.calculateBill();
		
	}
}
