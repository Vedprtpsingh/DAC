package libraryManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Services {
	String q;
	JDBCConnection conn=new JDBCConnection();
	public static void DisplayAllBooks(String q) {
		
	}

	public static void insertBook() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String q="INSERT INTO books (book_id, title, author, category, price) VALUES(?,?,?,?,?)";
		System.out.println("<-----Enter The Book Datils----->");
		int id=sc.nextInt();
		System.out.println("Book ID   : ");
		String t=sc.next();
		System.out.println("Book Title: ");
		String a=sc.next();
		System.out.println("Author    : ");
		String c=sc.next();
		System.out.println("Category  : ");
		int p=sc.nextInt();
		System.out.println("Price     : ");
		
		
		
		
	}

	public static void updateBook() {
		// TODO Auto-generated method stub
		
	}

	public static void deleteBook() {
		// TODO Auto-generated method stub
		
	}

	public static void displayBookDetailsBasedOnCategory() {
		// TODO Auto-generated method stub
		
	}

	public static void displayAllBooks() {
		// TODO Auto-generated method stub
		
	}

}
