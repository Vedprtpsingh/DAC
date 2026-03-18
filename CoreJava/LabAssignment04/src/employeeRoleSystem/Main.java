package employeeRoleSystem;

public class Main {

	public static void main(String[] args) {
		Developer d=new Developer(201,"Sham", "Java");
		d.showDeveloperDetails();
		System.out.println("Änd");
		Tester t=new Tester(301, "Sneha", "Selenium");
		t.showTesterDetails();
	}
}
