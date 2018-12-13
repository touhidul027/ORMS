package admin;

public class Admin {
	private String userType ; 
	private int userSerial ; 
	private String fullName ; 
	private String password ;
	private String email ;
	
	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public int getUserSerial() {
		return userSerial;
	}

	public void setUserSerial(int userSerial) {
		this.userSerial = userSerial;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Admin( int userSerial, String fullName, String email, String password,String userType) {
 		this.userType = userType;
		this.userSerial = userSerial;
		this.fullName = fullName;
		this.password = password;
		this.email = email;
	} 
	 
}
