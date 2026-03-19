package onlinePaymentProcessingSystem;

public class CreditCardPayment extends PaymentGateway {

	public CreditCardPayment(double accountNumber, String accountHolderName) {
		super(accountNumber, accountHolderName);
		// TODO Auto-generated constructor stub
	}
	static void processPayment(double amount) {
		//accountdatils();
		System.out.println("Your Transation through Credit Card Payment");
		System.out.println("Amount is: "+amount);
		PaymentGateway.confirmationMessage(amount);
	}
}
