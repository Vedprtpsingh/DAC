package onlineShoppingDiscountSystem;
interface Discount {
	void calculateDiscount(double price);
}
class FestivalDiscount implements Discount{

	@Override
	public void calculateDiscount(double price) {
		// TODO Auto-generated method stub
		System.out.println("20% Festival Discount and Final Price is: "+(price-price*0.2));
		
	}
	
}
class SeasonalDiscount implements Discount{

	@Override
	public void calculateDiscount(double price) {
		// TODO Auto-generated method stub
		System.out.println("10% Seasonal Discount and Final Price is: "+(price-price*0.1));
		
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Discount d=new SeasonalDiscount();
		d.calculateDiscount(1000);
		d=new FestivalDiscount();
		d.calculateDiscount(1000);
	}

}
