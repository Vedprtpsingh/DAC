package onlineShoppingCartSystem;

public class ShoppingApp {

	public static void main(String[] args) {
		Product p=new Product(101,"TV", 2000, 10);
		Product.Cart inner=p.new Cart();
		System.out.println(inner.discountTotal(p.getProductprice(), p.getQuantity()));
	}

}
