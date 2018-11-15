package com.jobSeekerDAO;

import java.io.Serializable;

public class JobSeekerPersonalInfo implements Serializable{
	
	private String jobSeekerGender ; 
	 
	public JobSeekerPersonalInfo() {
		
	} 
	
	public JobSeekerPersonalInfo(String jobSeekerGender, String jobSeekerCellPhoneNumber, String jobSeekerNidNumber,
			String jobSeekerAddress) {
		super();
		this.jobSeekerGender = jobSeekerGender;
		this.jobSeekerCellPhoneNumber = jobSeekerCellPhoneNumber;
		this.jobSeekerNidNumber = jobSeekerNidNumber;
		this.jobSeekerAddress = jobSeekerAddress;
	}
	@Override
	public String toString() {
		return "JobSeekerPersonalInfo [jobSeekerGender=" + jobSeekerGender + ", jobSeekerCellPhoneNumber="
				+ jobSeekerCellPhoneNumber + ", jobSeekerNidNumber=" + jobSeekerNidNumber + ", jobSeekerAddress="
				+ jobSeekerAddress + "]";
	}
	public String getJobSeekerGender() {
		return jobSeekerGender;
	}
	public void setJobSeekerGender(String jobSeekerGender) {
		this.jobSeekerGender = jobSeekerGender;
	}
	public String getJobSeekerCellPhoneNumber() {
		return jobSeekerCellPhoneNumber;
	}
	public void setJobSeekerCellPhoneNumber(String jobSeekerCellPhoneNumber) {
		this.jobSeekerCellPhoneNumber = jobSeekerCellPhoneNumber;
	}
	public String getJobSeekerNidNumber() {
		return jobSeekerNidNumber;
	}
	public void setJobSeekerNidNumber(String jobSeekerNidNumber) {
		this.jobSeekerNidNumber = jobSeekerNidNumber;
	}
	public String getJobSeekerAddress() {
		return jobSeekerAddress;
	}
	public void setJobSeekerAddress(String jobSeekerAddress) {
		this.jobSeekerAddress = jobSeekerAddress;
	}
	private String jobSeekerCellPhoneNumber ; 
	private String jobSeekerNidNumber ; 
	private String jobSeekerAddress ;	 
	
}
