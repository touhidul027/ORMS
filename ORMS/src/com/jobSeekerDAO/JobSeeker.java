package com.jobSeekerDAO;

import java.util.*;

public class JobSeeker {
	private int id ;  
	private	String fullName ; 
	private String userType="jobSeeker"; 
	
	private	String objective ; 
	private	String email ; 
	private	String address;
	private	String password ; 
	private	String gender ; 
	private	String nid ; 
	
	// 1-M
	private	ArrayList<String> cellPhoneNumber ; // done
	private	ArrayList<JobSeekerExperience> experience ; // done 
	private	ArrayList<JobSeekerEducation> education ; // done 
	private	ArrayList<String> activities; // done 
	private	ArrayList<String> interests ; // done 
	
	//M-M
	
	
	private	ArrayList<String> certification ; // no need of db now
	
	 	
	private	ArrayList<String> skills; // done
	private	ArrayList<String> jobTypes ; 	// not available now 
	
	 
	
	@Override
	public String toString() {
		return "JobSeeker [id=" + id + ", fullName=" + fullName + ", userType=" + userType + ", objective=" + objective
				+ ", email=" + email + ", adress=" + address + ", password=" + password + ", gender=" + gender + ", nid="
				+ nid + ", cellPhoneNumber=" + cellPhoneNumber + ", experience=" + experience + ", activities="
				+ activities + ", education=" + education + ", certification=" + certification + ", interests="
				+ interests + ", skills=" + skills + ", jobTypes=" + jobTypes + "]";
	}

	public JobSeeker(int id,String fullName, String email, String password) {
		super();
		this.id = id ; 
		this.fullName = fullName;
		this.email = email;
		this.password = password;
	}
	
	 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public JobSeeker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return address;
	}

	public void setAdress(String adress) {
		this.address = adress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public ArrayList<String> getCellPhoneNumber() {
		return cellPhoneNumber;
	}

	public void setCellPhoneNumber(ArrayList<String> cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}

	public ArrayList<JobSeekerExperience> getExperience() {
		return experience;
	}

	public void setExperience(ArrayList<JobSeekerExperience> experience2) {
		this.experience = experience2;
	}

	public ArrayList<String> getActivities() {
		return activities;
	}

	public void setActivities(ArrayList<String> activities) {
		this.activities = activities;
	}

	public ArrayList<JobSeekerEducation> getEducation() {
		return education;
	}

	public void setEducation(ArrayList<JobSeekerEducation> education) {
		this.education = education;
	}

	public ArrayList<String> getCertification() {
		return certification;
	}

	public void setCertification(ArrayList<String> certification) {
		this.certification = certification;
	}

	public ArrayList<String> getInterests() {
		return interests;
	}

	public void setInterests(ArrayList<String> interests) {
		this.interests = interests;
	}

	public ArrayList<String> getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
	}

	public ArrayList<String> getJobTypes() {
		return jobTypes;
	}

	public void setJobTypes(ArrayList<String> jobTypes) {
		this.jobTypes = jobTypes;
	}
}
