package com.jobSeekerDAO;

import java.util.*;

public class JobSeeker {
	private int id ;  
	private	String fullName ; 
	private String userType="jobSeeker"; 
	
	private	String objective ; 
	private	String email ; 
	private	String adress;
	private	String password ; 
	private	String gender ; 
	private	String nid ; 
	
	// 1-M
	private	ArrayList<String> cellPhoneNumber ; 
	private	ArrayList<String> experience[] ; 
	
	//M-M
	private	ArrayList<String> activities[] ; 
	private	ArrayList<String> education[] ; 
	private	ArrayList<String> certification[] ; 
	private	ArrayList<String> interests[] ; 
	private	ArrayList<String> skills[] ; 
	private	ArrayList<String> jobTypes[] ; 	
	
	@Override
	public String toString() {
		return "JobSeeker [id=" + id + ", fullName=" + fullName + ", objective=" + objective + ", email=" + email
				+ ", adress=" + adress + ", password=" + password + ", gender=" + gender + ", nid=" + nid
				+ ", cellPhoneNumber=" + cellPhoneNumber + ", experience=" + Arrays.toString(experience)
				+ ", activities=" + Arrays.toString(activities) + ", education=" + Arrays.toString(education)
				+ ", certification=" + Arrays.toString(certification) + ", interests=" + Arrays.toString(interests)
				+ ", skills=" + Arrays.toString(skills) + ", jobTypes=" + Arrays.toString(jobTypes) + "]";
	}
	
	public JobSeeker(String fullName, String email, String password) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.password = password;
	}
	
	public JobSeeker(int id, String fullName, String objective, String email, String adress, String password,
			String gender, String nid, ArrayList<String> cellPhoneNumber, ArrayList<String>[] experience,
			ArrayList<String>[] activities, ArrayList<String>[] education, ArrayList<String>[] certification,
			ArrayList<String>[] interests, ArrayList<String>[] skills, ArrayList<String>[] jobTypes) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.objective = objective;
		this.email = email;
		this.adress = adress;
		this.password = password;
		this.gender = gender;
		this.nid = nid;
		this.cellPhoneNumber = cellPhoneNumber;
		this.experience = experience;
		this.activities = activities;
		this.education = education;
		this.certification = certification;
		this.interests = interests;
		this.skills = skills;
		this.jobTypes = jobTypes;
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
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
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

	public ArrayList<String>[] getExperience() {
		return experience;
	}

	public void setExperience(ArrayList<String>[] experience) {
		this.experience = experience;
	}

	public ArrayList<String>[] getActivities() {
		return activities;
	}

	public void setActivities(ArrayList<String>[] activities) {
		this.activities = activities;
	}

	public ArrayList<String>[] getEducation() {
		return education;
	}

	public void setEducation(ArrayList<String>[] education) {
		this.education = education;
	}

	public ArrayList<String>[] getCertification() {
		return certification;
	}

	public void setCertification(ArrayList<String>[] certification) {
		this.certification = certification;
	}

	public ArrayList<String>[] getInterests() {
		return interests;
	}

	public void setInterests(ArrayList<String>[] interests) {
		this.interests = interests;
	}

	public ArrayList<String>[] getSkills() {
		return skills;
	}

	public void setSkills(ArrayList<String>[] skills) {
		this.skills = skills;
	}

	public ArrayList<String>[] getJobTypes() {
		return jobTypes;
	}

	public void setJobTypes(ArrayList<String>[] jobTypes) {
		this.jobTypes = jobTypes;
	}
}
