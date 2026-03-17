package bankAccountSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount sv=new SavingsAccount(12345, "Abhi", 5);
		CurrentAccount ca=new CurrentAccount(67890, "Ved", 5000);
		
		sv.displayAccountInfo();
		sv.calculateInterest();
		System.out.println("\r\nAnd\r\n");
		ca.displayAccountInfo();
		ca.displayOverdraftLimit();

	}

}
