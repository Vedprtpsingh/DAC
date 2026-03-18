package bankAccountSystem;
public class SavingsAccount extends Account {
	int interestRate;
	public SavingsAccount(int accountNumber, String customerName, int interestRate) {
		super(accountNumber, customerName);
		this.interestRate = interestRate;
	}
	void calculateInterest() {
		System.out.println("Interest Rate: "+interestRate+"%");
	}
}
