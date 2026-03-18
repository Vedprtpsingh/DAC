package bankAccountTransactionSystem;
public class BankApp {
	public static void main(String[] args) {
		BankAccount ba=new BankAccount(4987678, "Mr. Shan", 10);
		
		BankAccount.Transaction inner=ba.new Transaction();
		System.out.println(inner.Update(20000));
		System.out.println(inner.Deposit(1000));
		System.out.println(inner.Withdraw(100));
	}
}
