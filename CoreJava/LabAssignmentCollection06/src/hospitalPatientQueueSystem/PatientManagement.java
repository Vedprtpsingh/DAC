package hospitalPatientQueueSystem;

import java.util.ArrayDeque;
import java.util.Queue;

public class PatientManagement {
	//Patient p=new Patient();
	Queue<Patient> q = new ArrayDeque<>();
	void addPatienttoQueue(Patient p){
		q.add(p);
	}
	
	void servePatient() {
		System.out.println(q.poll().patientName);
	}
	
	void displayNextPatient() {
		System.out.println(q.peek().patientName);
		}
	
	void displayAllWaitingPatients() {
		for(Patient p:q) {
			System.out.println(p.patientId+" "+p.patientName+" "+p.disease);
		}
		
	}
	
	
}
