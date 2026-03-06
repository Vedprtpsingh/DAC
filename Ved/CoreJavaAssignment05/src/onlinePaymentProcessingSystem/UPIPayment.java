package onlinePaymentProcessingSystem;

public class UPIPayment extends PaymentGateway {

	public UPIPayment(double accountNumber, String accountHolderName) {
		super(accountNumber, accountHolderName);
		// TODO Auto-generated constructor stub
	}
	static void processPayment(double amount) {
		//accountdatils();
		System.out.println("Your Transation through UPI Payment");
		System.out.println("Amount is: "+amount);
		PaymentGateway.confirmationMessage(amount);
	}
}
