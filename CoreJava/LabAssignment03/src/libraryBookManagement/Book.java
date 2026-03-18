package libraryBookManagement;

public class Book {
	int bookId;
	String title;
	String author;
	float price;
	public Book(int bookId, String title, String author, float price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	class Library{

		public float discount(float f) {
			double total=f;
			if(total>=1000) {
				total=total-total*(0.15);
			}
			return (float) total;
		}
		
	}
}
