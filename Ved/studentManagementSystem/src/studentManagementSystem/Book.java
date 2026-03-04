package studentManagementSystem;
public class Book {
	int bookno;
	String bookName;
	String bookLang;
	public int getBookno() {
		return bookno;
	}
	public void setBookno(int bookno) {
		this.bookno = bookno;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookLang() {
		return bookLang;
	}
	public void setBookLang(String bookLang) {
		this.bookLang = bookLang;
	}
	public Book(int bookno, String bookName, String bookLang) {
		super();
		this.bookno = bookno;
		this.bookName = bookName;
		this.bookLang = bookLang;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [bookno=" + bookno + ", bookName=" + bookName + ", bookLang=" + bookLang + "]";
	}
}
