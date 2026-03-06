package onlineShoppingSystem;
class Product{
	int productId;
	String productName;
	int price;
	public Product(int productId, String productName, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
}
class Electronics extends Product{
	int waranty;
	public Electronics(int productId, String productName, int price, int waranty) {
		super(productId, productName, price);
		this.waranty = waranty;
	}
	void displayWarantyPeriod() {
		System.out.println("Display Waranty: "+waranty);
	}
}
class Clothing extends Product{
	int[] size= {28,30,32,34};
	public Clothing(int productId, String productName, int price) {
		super(productId, productName, price);
		this.size=size;
		// TODO Auto-generated constructor stub
	}
		
	void displaySizeOptions() {
		System.out.println("Display size options: ");
		for(int i=0;i<size.length;i++) {
			System.out.println("size: "+(i+1)+" :"+size[i]);
		}
	}

	
	
	
	
}
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electronics e=new Electronics(434, "Fan", 1200, 2);
		e.displayWarantyPeriod();
		
		Clothing c=new Clothing(2222,"Shirt", 800);
		c.displaySizeOptions();
	}

}
