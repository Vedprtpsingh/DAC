package browserHistoryManagement;

import java.util.Scanner;
import java.util.Stack;

public class BrowserHistoryManagement {
	public BrowserHistoryManagement() {
	}

	BrowserHistoryNavigation bhn=new BrowserHistoryNavigation();
	Scanner sc=new Scanner(System.in);
	void visitPage() {
		bhn.url.push(sc.next());
	}

	void goBack() {
		bhn.url.pop();
	}

	void DisplayCurrentPage() {
		System.out.println(bhn.url.peek());
		
	}

	void DisplayBrowserHistory() {
		Stack<String> db= (Stack<String>) bhn.url.clone();
		while(!db.empty()) {
			System.out.println(db.pop());
		}
	}
	
	
}
