package browserHistoryManagement;

public class Main {
	public static void main(String[] args) {
		BrowserHistoryManagement bhm=new BrowserHistoryManagement();
		bhm.visitPage();
		bhm.visitPage();
		bhm.visitPage();
		bhm.visitPage();
		System.out.println("All Browsering history");
		bhm.DisplayBrowserHistory();
		
		
		
		bhm.goBack();
		System.out.println("Afet go back All Browsering history");
		bhm.DisplayBrowserHistory();
		
		System.out.println("Current Page");
		bhm.DisplayCurrentPage();
	}
	
}
