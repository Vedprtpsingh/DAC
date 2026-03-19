package employeeRecordManagement;

public class Main {

	public static void main(String[] args) {
		EmployeeManagement em=new EmployeeManagement();
		Employee e1=new Employee(1001, "Ved", "DEV",30000);
		em.addEmployee(e1.empId,e1);
		Employee e2=new Employee(1002, "Ved", "DEV",3000);
		em.addEmployee(e2.empId,e2);
		
		Employee e3=new Employee(1003, "Abhi", "ABC",4000);
		em.addEmployee(e3.empId,e3);
		em.displayAllEmployees();
		
		
		
		em.searchEmployee(1001);
		
		
		em.deleteEmployee(1002);
		em.displayAllEmployees();
		
		
		em.displayAllValues();
		
		em.displayAllKeys();
		
		
		em.displayAllValues();
	}
}
