package onlinePaymentProcessingSystem;

public class PaymentGateway {
	static double accountNumber; static String accountHolderName;
	
	public PaymentGateway(double accountNumber, String accountHolderName) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
	}
	static void accountdatils() {
		System.out.println("ANumber: "+accountNumber+", AHolderName: "+accountHolderName+" ");
	}
	static void confirmationMessage(double amount){
		System.out.println("You payment "+amount+" is confirm: ");
	}
	
}
