package libraryManagementSystem;
class LibraryItem{
	int itemId;
	String title;
	public LibraryItem(int itemId, String title) {
		super();
		this.itemId = itemId;
		this.title = title;
	}
	
}
class Book extends LibraryItem{
	String author;
	public Book(int itemId, String title,String author) {
		super(itemId, title);
		// TODO Auto-generated constructor stub
		this.author=author;
	}
	void displayAuthor() {
		System.out.println("Book author=" + author + ", itemId=" + itemId + ", title=" + title +"]");
	}
}
class Magazine extends LibraryItem{
	int issuenumber;
	public Magazine(int itemId, String title,int issuenumber) {
		super(itemId, title);
		this.issuenumber=issuenumber;
	}

	void displayIssueNumber() {
		System.out.println("Magazine issuenumber=" + issuenumber + ", itemId=" + itemId + ", title=" + title );
	}
}
public class Main {

	public static void main(String[] args) {
		Book b=new Book(455, "Java", "Mr. Shan");
		b.displayAuthor();
		
		Magazine m=new Magazine(143,"How to treat with girls", 11);
		m.displayIssueNumber();
	}

}
