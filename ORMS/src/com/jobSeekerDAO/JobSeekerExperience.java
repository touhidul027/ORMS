package com.jobSeekerDAO;

public class JobSeekerExperience {
 private String jobSeekerOrganizationName ; 
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
private String jobSeekerDesignation ; 
 private String jobSeekerEmploymentDuration ; 
 @Override
public String toString() {
	return "JobSeekerExperience [jobSeekerOrganizationName=" + jobSeekerOrganizationName + ", jobSeekerDesignation="
			+ jobSeekerDesignation + ", jobSeekerEmploymentDuration=" + jobSeekerEmploymentDuration
			+ ", jobSeekerProjectName=" + jobSeekerProjectName + "]";
}
private String jobSeekerProjectName ; 
}
