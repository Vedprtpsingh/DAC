package onlineShoppingCartSystem;


public class Product {
	int productid;
	String productname;
	int productprice;
	int quantity;
	public Product(int productid, String productname, int productprice, int quantity) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productprice = productprice;
		this.quantity = quantity;
	}
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	class Cart{
		public float discountTotal(int price,int quantity) {
			double total=price*quantity;
			if(total>=5000) {
				total=total-total*(0.1);
			}
			return (float) total;
		}
	}
}
