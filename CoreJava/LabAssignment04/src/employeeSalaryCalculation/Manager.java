package employeeSalaryCalculation;

public class Manager extends Employee {
	public int bonus;
	public Manager(int empId, int basicSalary, String name,int bonus) {
		super(empId, basicSalary, name);
		this.bonus=bonus;
	}
	int calculateSalary(int bs, int bonus) {
		return bs+bonus;
	}
}
