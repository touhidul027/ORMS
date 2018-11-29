package com.jobSeekerDAO;

import jobs.Job;
import recruiter.Recruiter;

public class RecruiterNotification {
	private String interviewTimePlace ;
	private Job job ;
	private String recruiterName ;
	private String recruiterEmail ; 		
	
	public String getRecruiterName() {
		return recruiterName;
	}
	public void setRecruiterName(String recruiterName) {
		this.recruiterName = recruiterName;
	}
	public String getRecruiterEmail() {
		return recruiterEmail;
	}
	public void setRecruiterEmail(String recruiterEmail) {
		this.recruiterEmail = recruiterEmail;
	}
	
	
	public String getInterviewTimePlace() {
		return interviewTimePlace;
	}
	public void setInterviewTimePlace(String interviewTimePlace) {
		this.interviewTimePlace = interviewTimePlace;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	
	@Override
	public String toString() {
		return "Interview offer from <i>"+ job.getCompanyName() +"</i>"; 
	}
	
}
