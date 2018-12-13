package admin;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class ManageJob {
private int companyId ; 

private String companyName ; 
private int jobId ; 
private String title ; 
private long publishTime ; 


private int price ; 
private int paid ; 
private int isAllowedStatus ;

 
public String getCompanyName() {
	return companyName;
}
public long getPublishTime() {
	return publishTime;
}
public void setPublishTime(long publishTime) {
	this.publishTime = publishTime;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public int getCompanyId() {
	return companyId;
}
public void setCompanyId(int companyId) {
	this.companyId = companyId;
}
public int getJobId() {
	return jobId;
}
public void setJobId(int jobId) {
	this.jobId = jobId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getPaid() {
	return paid;
}
public void setPaid(int paid) {
	this.paid = paid;
}
public int getIsAllowedStatus() {
	return isAllowedStatus;
}
public void setIsAllowedStatus(int isAllowedStatus) {
	this.isAllowedStatus = isAllowedStatus;
} 

public String getFormatedTime() {		
	return new SimpleDateFormat("dd:MM:yyyy HH:mm", Locale.ENGLISH).format(getPublishTime());		
}

}
