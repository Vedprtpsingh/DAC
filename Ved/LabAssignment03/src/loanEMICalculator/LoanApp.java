package loanEMICalculator;

public class LoanApp {

	public static void main(String[] args) {
		Loan l=new Loan(20000, 6.8, 3.4);
		Loan.EMICalculator inner=l.new EMICalculator();
		System.out.println(inner.emi(l.loanAmount,l.interestRate,l.loanTenure));
	}

}
