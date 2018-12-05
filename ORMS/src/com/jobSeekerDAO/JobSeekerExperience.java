package com.jobSeekerDAO;

public class JobSeekerExperience {
 private String jobSeekerOrganizationName ; 
 private String jobSeekerDesignation ; 
 private String jobSeekerEmploymentDuration ; 
 private String jobSeekerProjectName ; 

 public String getJobSeekerOrganizationName() {
	return jobSeekerOrganizationName;
}
public void setJobSeekerOrganizationName(String jobSeekerOrganizationName) {
	this.jobSeekerOrganizationName = jobSeekerOrganizationName;
}
public String getJobSeekerDesignation() {
	return jobSeekerDesignation;
}
public void setJobSeekerDesignation(String jobSeekerDesignation) {
	this.jobSeekerDesignation = jobSeekerDesignation;
}
public String getJobSeekerEmploymentDuration() {
	return jobSeekerEmploymentDuration;
}
public void setJobSeekerEmploymentDuration(String jobSeekerEmploymentDuration) {
	this.jobSeekerEmploymentDuration = jobSeekerEmploymentDuration;
}
public String getJobSeekerProjectName() {
	return jobSeekerProjectName;
}
public void setJobSeekerProjectName(String jobSeekerProjectName) {
	this.jobSeekerProjectName = jobSeekerProjectName;
}
public JobSeekerExperience(String jobSeekerOrganizationName, String jobSeekerDesignation,
		String jobSeekerEmploymentDuration, String jobSeekerProjectName) {
	super();
	this.jobSeekerOrganizationName = jobSeekerOrganizationName;
	this.jobSeekerDesignation = jobSeekerDesignation;
	this.jobSeekerEmploymentDuration = jobSeekerEmploymentDuration;
	this.jobSeekerProjectName = jobSeekerProjectName;
}

 @Override
public String toString() {
	return jobSeekerEmploymentDuration+" years as " +jobSeekerDesignation + " at " +jobSeekerOrganizationName; 
}
}
