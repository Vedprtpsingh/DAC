package javaCityApp;

public class Citizen {
	private String name;
	private int age;
	private double voterID;
	private String password;
	private static int citizenCount=0;
	
	public Citizen(String name, int age, double voterID, String password) {
		super();
		this.name = name;
		this.age = age;
		this.voterID = voterID;
		citizenCount++;
		this.password = password;
	}
	public void changePassword(String oldPass,String newPass) {
		if(oldPass==this.password) {
			password=newPass;
			System.out.println("Password Change Successfuly");
		}
		System.out.println("Password not Match");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0) {
			System.out.println("Error age can not be negative");
		}else {			
			System.out.println("Age Have Been Updated");
			this.age = age;
		}
	}
	public void showCitizen() {
		System.out.println("Citizen Name: "+name+", Citizen age: "+age+", Citizen VoterID: "+voterID+", Unique Citizen VoterID: "+citizenCount);
	}
}
