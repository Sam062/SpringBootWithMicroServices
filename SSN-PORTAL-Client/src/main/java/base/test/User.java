package base.test;

public class User {
	private String fname;
	private String lname;
	private String gender;
	
	private String dob; // INPUT FORM- "1997-10-01"
	private String state;
	public User() {
		super();
	}
	
	public User(String fname, String lname, String gender, String dob, String state) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.dob = dob;
		this.state = state;
	}

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", dob=" + dob + ", state=" + state
				+ "]";
	}
	
	

}
