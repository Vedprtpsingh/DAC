package studentManagementSystem;

public class Student {
	int studentNumber;
	String name;
	String address;
	double mobileNo;
	String course;
	boolean hostel;
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(double mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public boolean isHostel() {
		return hostel;
	}
	public void setHostel(boolean hostel) {
		this.hostel = hostel;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentNumber, String name, String address, double mobileNo, String course, boolean hostel) {
		super();
		this.studentNumber = studentNumber;
		this.name = name;
		this.address = address;
		this.mobileNo = mobileNo;
		this.course = course;
		this.hostel = hostel;
	}
	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + ", name=" + name + ", address=" + address + ", mobileNo="
				+ mobileNo + ", course=" + course + ", hostel=" + hostel + "]";
	}
	
}
