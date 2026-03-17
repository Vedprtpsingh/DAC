package bankAccountSystem;

public class CurrentAccount extends Account {
	int overdraftLimit;
	
	public CurrentAccount(int accountNumber, String customerName, int overdraftLimit) {
		super(accountNumber, customerName);
		this.overdraftLimit = overdraftLimit;
	}

	void displayOverdraftLimit() {
		System.out.println("Overdraft Limit: "+overdraftLimit);
	}

}
