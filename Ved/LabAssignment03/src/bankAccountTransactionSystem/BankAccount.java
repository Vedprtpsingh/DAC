package bankAccountTransactionSystem;

public class BankAccount {
	double accountNumber;
	String accountHolderName;
	int balance;
	public BankAccount(double accountNumber, String accountHolderName, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	class Transaction{

		//Deposit 
		public int Deposit(int i) {
			// TODO Auto-generated method stub
			setBalance(i+getBalance());
			return getBalance() ;
			
		}
		public int Withdraw(int i) {
			setBalance(getBalance()-i);
			return getBalance();
		}
		public int Update(int i) {
			setBalance(i);
			return getBalance();
		}
	}
	
}
