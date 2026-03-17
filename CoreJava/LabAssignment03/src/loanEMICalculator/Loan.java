package loanEMICalculator;

public class Loan {
	public class EMICalculator {

		public double emi(int loanAmount, double interestRate, double loanTenure) {
			return (loanAmount*interestRate*loanTenure)/100;
		}
	}
	int loanAmount;
	double interestRate;
	double loanTenure;
	public Loan(int loanAmount, double d, double e) {
		super();
		this.loanAmount = loanAmount;
		this.interestRate = d;
		this.loanTenure = e;
	}
	public int getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(double loanTenure) {
		this.loanTenure = loanTenure;
	}

}
