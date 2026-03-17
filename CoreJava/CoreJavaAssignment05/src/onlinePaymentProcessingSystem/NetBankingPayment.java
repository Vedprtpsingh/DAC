package onlinePaymentProcessingSystem;
public class NetBankingPayment extends PaymentGateway {

	public NetBankingPayment(double accountNumber, String accountHolderName) {
		super(accountNumber, accountHolderName);
		// TODO Auto-generated constructor stub
	}
	static void processPayment(double amount) {
		//accountdatils();
		System.out.println("Your Transation through Net Banking Payment");
		System.out.println("Amount is: "+amount);
		PaymentGateway.confirmationMessage(amount);
	}
}
