package bankAccountSystem;

public class Account {
	int accountNumber;
	String customerName;
	
	public Account(int accountNumber, String customerName) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
	}
	void displayAccountInfo() {
		System.out.println("Account Number: "+ accountNumber + "\r\nCustomer Name:"+customerName);
	}

}
