package employeeRecordManagement;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManagement {
	HashMap<Integer,Employee> hm=new HashMap<>();
	
	void addEmployee(int empId, Employee e1) {
		hm.put(empId, e1);
	}
	void displayAllEmployees(){
		for(Map.Entry<Integer,Employee> m:hm.entrySet()) {
			System.out.println("Emp ID: "+m.getKey()+", Emp Name: "+m.getValue().empName+", Emp Dep: "+m.getValue().department+", Emp Sal: "+m.getValue().salary);
		}
	}
	void searchEmployee(int id){
		if(hm.containsKey(id)) {
			System.out.println("Employee Avalible");
		}else {			
			System.out.println("Employee Not Found");
		}
		
	}
	void updateEmployee(int id) {
	}
	void deleteEmployee(int id) {
		if(hm.containsKey(id)) {
			hm.remove(id);
			System.out.println("Employee Remove Successfuly!");
		}
	}
	void displayAllKeys() {
		for(int k:hm.keySet()) {
			System.out.print(k+" ");
		}
		System.out.println();
		
	}
	void displayAllValues() {
		for(Employee e:hm.values()) {
			System.out.println(e.empId+" "+e.empName+" "+e.department+" "+e.salary);
		}
	}

}
