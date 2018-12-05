package com.jobSeekerDAO;

public class JobSeekerEducation {
	private String jobSeekerEducationLevel ; 
	private String jobSeekerEducationalInstituition ; 
	private String jobSeekerEducationalDuration ; 
	private String jobSeekerEducationalDepartment ;
	
	@Override
	public String toString() {
		return  jobSeekerEducationLevel +" from " + jobSeekerEducationalInstituition; 
	}
	public String getJobSeekerEducationLevel() {
		return jobSeekerEducationLevel;
	}
	public void setJobSeekerEducationLevel(String jobSeekerEducationLevel) {
		this.jobSeekerEducationLevel = jobSeekerEducationLevel;
	}
	public String getJobSeekerEducationalInstituition() {
		return jobSeekerEducationalInstituition;
	}
	public void setJobSeekerEducationalInstituition(String jobSeekerEducationalInstituition) {
		this.jobSeekerEducationalInstituition = jobSeekerEducationalInstituition;
	}
	public String getJobSeekerDuration() {
		return jobSeekerEducationalDuration;
	}
	public void setJobSeekerDuration(String jobSeekerDuration) {
		this.jobSeekerEducationalDuration = jobSeekerDuration;
	}
	
	 
	
	public String getJobSeekerEducationalDepartment() {
		return jobSeekerEducationalDepartment;
	}
	public void setJobSeekerEducationalDepartment(String jobSeekerEducationalDepartment) {
		this.jobSeekerEducationalDepartment = jobSeekerEducationalDepartment;
	}
	public JobSeekerEducation(String jobSeekerEducationLevel, String jobSeekerEducationalInstituition,
			 String jobSeekerEducationalDepartment,String jobSeekerEducationDuration) {
		super();
		this.jobSeekerEducationLevel = jobSeekerEducationLevel;
		this.jobSeekerEducationalInstituition = jobSeekerEducationalInstituition;
		this.jobSeekerEducationalDuration = jobSeekerEducationDuration;
		this.jobSeekerEducationalDepartment = jobSeekerEducationalDepartment;
	}
	public JobSeekerEducation() {
	}
	
}
	

