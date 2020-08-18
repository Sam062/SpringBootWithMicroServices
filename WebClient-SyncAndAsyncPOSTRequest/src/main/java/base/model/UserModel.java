package base.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


public class UserModel {
	private String fname;
	private String lname;
	private String gender;

	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date dob; // INPUT FORM- "1997-10-01"
	private String state;
	public UserModel(String fname, String lname, String gender, Date dob, String state) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.dob = dob;
		this.state = state;
	}
	public UserModel() {
		super();
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
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
		return "UserModel [fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", dob=" + dob + ", state="
				+ state + "]";
	}


	//	public Date getDob() {
	//		return dob;
	//	}
	//	public void setDob(String dob) throws ParseException {
	//		SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd"); 
	//		Date date=f.parse(dob);  
	//		this.dob = date;
	//	}
}
