package com.jobSeekerDAO;

public class JobSeekerSummary {
String jobSeekerSummary ;

public JobSeekerSummary() {
	
}
public String getJobSeekerSummary() {
	return jobSeekerSummary;
}

public void setJobSeekerSummary(String jobSeekerSummary) {
	this.jobSeekerSummary = jobSeekerSummary;
}

public JobSeekerSummary(String jobSeekerSummary) {
	super();
	this.jobSeekerSummary = jobSeekerSummary;
}

@Override
public String toString() {
	return "JobSeekerSummary [jobSeekerSummary=" + jobSeekerSummary + "]";
} 
}
