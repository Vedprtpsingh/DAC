package hospitalPatientQueueSystem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatientManagement pm=new PatientManagement();
		Patient p1=new Patient(101, "Abhi", "Fever");
		pm.addPatienttoQueue(p1);
		Patient p2=new Patient(102, "Ved", "Cold");
		pm.addPatienttoQueue(p2);
		Patient p3=new Patient(103, "Shivam", "Don't No");
		pm.addPatienttoQueue(p3);
		
		pm.displayAllWaitingPatients();
		
		pm.servePatient();
		
		pm.displayAllWaitingPatients();
		
		pm.displayNextPatient();
		
	}

}
