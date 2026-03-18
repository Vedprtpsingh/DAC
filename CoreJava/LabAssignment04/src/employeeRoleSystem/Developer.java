package employeeRoleSystem;

public class Developer extends Employee {
	String programmingLanguage;
	

	public Developer(int empId, String empName, String programmingLanguage) {
		super(empId, empName);
		this.programmingLanguage = programmingLanguage;
	}
	void showDeveloperDetails() {
		this.displayEmployee();
		System.out.println("Programming Language: "+programmingLanguage);
	}

}
