package insurancePremiumCalculator;

public class PolicyHolder {
	int policyNumber, age, sumAssured;
	String name;
	
	public PolicyHolder(int policyNumber, int age, int sumAssured, String name) {
		super();
		this.policyNumber = policyNumber;
		this.age = age;
		this.sumAssured = sumAssured;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSumAssured() {
		return sumAssured;
	}

	public void setSumAssured(int sumAssured) {
		this.sumAssured = sumAssured;
	}

	class PremiumCalculator{

		public float premium(int age, int sumAssured) {
			double total=0;
			if(age<30) {
				total=sumAssured*(0.02);
			}else if(age<50) {
				total=sumAssured*(0.03);
			}else {
				total=sumAssured*(0.05);				
			}
			return (float) total;
		}
		
	}

}
