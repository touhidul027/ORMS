package com.generalDAO;

public class BasicUser {
	private String userType ; 
	private int userSerial ; 
	private String fullName ; 
	private String password ;
	private String email ; 
	
	@Override
	public String toString() {
		return "BasicUser [userType=" + userType + ", userSerial=" + userSerial + ", email=" + email + ", fullName="
				+ fullName + ", password=" + password + "]";
	}

	
	public BasicUser(int userSerial,String fullName,String email , String userType,String password) {
		 
		this.userType = userType;
		this.userSerial = userSerial;
		this.email = email;
		this.fullName = fullName;
		this.password = password;
	}

	public int getUserSerial() {
		return userSerial;
	}

	public void setUserSerial(int userSerial) {
		this.userSerial = userSerial;
	}

	 

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	
	 


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	 
	
	public BasicUser() {
		
	}
	
	 
}
