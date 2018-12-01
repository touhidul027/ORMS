package com.jobSeekerDAO;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import jobs.Job;
import recruiter.Recruiter;

public class RecruiterNotification {
	private int applicationId ; 
	private String interviewTimePlace ;
	private Job job ;
	private String recruiterName ;
	private String recruiterEmail ; 		
	private int hasSeenStatus ; 
	private long confirmTime ; 
	
	
	public long getConfirmTime() {
		return confirmTime;
	}
	public void setConfirmTime(long confirmTime) {
		this.confirmTime = confirmTime;
	}
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public int getHasSeenStatus() {
		return hasSeenStatus;
	}
	public void setHasSeenStatus(int hasSeenStatus) {
		this.hasSeenStatus = hasSeenStatus;
	}
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
	
	public String getTime() {		
		return new SimpleDateFormat("dd:MM:yyyy HH:mm", Locale.ENGLISH).format(getConfirmTime());		
	}
	
	}
