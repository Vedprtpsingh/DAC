package model;
public class Employee {
	int eid;
	String ename;
	int esal;
	String eaddress;
	Double emn;
	String email;
	public Employee(int eid, String ename, int esal, String eaddress, Double emn, String email) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.eaddress = eaddress;
		this.emn = emn;
		this.email = email;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", eaddress=" + eaddress + ", emn="
				+ emn + ", email=" + email + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public Double getEmn() {
		return emn;
	}
	public void setEmn(Double emn) {
		this.emn = emn;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
