package libraryBookManagement;

public class LibraryApp {
	public static void main(String[] args) {
		Book b=new Book(1001, "Play With Java", "Abhi", 2000);
		Book.Library inner=b.new Library();
		System.out.println(inner.discount(b.getPrice()));
		
	}
	
}
