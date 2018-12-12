package com.jobSeekerDAO;

public class FollowedCompanyNotification {
private int companyId ; 
private String companyName ; 
private int jobId ; 
private String jobTitle ; 
public String getJobTitle() {
	return jobTitle;
}
public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}
private int hasSeenStatus ; 
private long publishTime ;

 
public int getCompanyId() {
	return companyId;
}
public void setCompanyId(int companyId) {
	this.companyId = companyId;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public int getJobId() {
	return jobId;
}
public void setJobId(int jobId) {
	this.jobId = jobId;
}
public int getHasSeenStatus() {
	return hasSeenStatus;
}
public void setHasSeenStatus(int hasSeenStatus) {
	this.hasSeenStatus = hasSeenStatus;
}
public long getPublishTime() {
	return publishTime;
}
public void setPublishTime(long publishTime) {
	this.publishTime = publishTime;
} 

}
