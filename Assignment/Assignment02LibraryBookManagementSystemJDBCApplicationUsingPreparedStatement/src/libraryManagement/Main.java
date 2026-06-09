package libraryManagement;

import java.sql.PreparedStatement;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Select One Option \r\n" + 
					"1. Insert Book\r\n" +
					"2. Update Book Price\r\n" + 
					"3. Delete Book\r\n" + 
					"4. Display Book Details Based on Category\r\n"+
					"0. Exit");
		int n=sc.nextInt();
			switch(n) {
			case 1:
				Services.insertBook();
				
				break;
			case 2:
				Services.updateBook();
				break;
			case 3:
				Services.deleteBook();
				break;
			case 4:
				Services.displayBookDetailsBasedOnCategory();
				break;
			case 5:
				Services.displayAllBooks();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Enter A Valid Number ");
			}
				
		}
	}
}
