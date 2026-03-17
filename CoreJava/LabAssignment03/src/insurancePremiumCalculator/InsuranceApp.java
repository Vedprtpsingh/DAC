package insurancePremiumCalculator;

public class InsuranceApp {

	public static void main(String[] args) {
		PolicyHolder ph=new PolicyHolder(1001, 20, 200000, "Dev");
		PolicyHolder.PremiumCalculator inner=ph.new PremiumCalculator();
		System.out.println(inner.premium(ph.getAge(),ph.getSumAssured()));
	}

}
