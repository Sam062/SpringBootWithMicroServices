package base.model;

import lombok.Data;

@Data
public class User {
	private String uname;
	private String pwd;
	private String email;
	private String phno;
	private String gender;
	private String course;
	private String[] timing;

}
