package onlinePaymentProcessingSystem;
public class Main {
	public static void main(String[] args) {
		PaymentGateway pg=new PaymentGateway(5445, "Ved");
		pg.accountdatils();
		NetBankingPayment.processPayment(1000);
		UPIPayment.processPayment(399);
		CreditCardPayment.processPayment(80000);
	}

}
