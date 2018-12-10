package company;

import java.util.ArrayList;

import recruiter.Recruiter;

public class Company {
	
private int company_id ; 
private String companyName ; 
private String headQuarter ; 
private long founded ; 
private String industryType ; 
private int size ;
private ArrayList<Recruiter> recruiters ; 

// add review later 

public String getIndustryType() {
	return industryType;
}
public void setIndustryType(String industryType) {
	this.industryType = industryType;
}
public ArrayList<Recruiter> getRecruiters() {
	return recruiters;
}
public void setRecruiters(ArrayList<Recruiter> recruiters) {
	this.recruiters = recruiters;
}


public int getCompany_id() {
	return company_id;
}
public void setCompany_id(int company_id) {
	this.company_id = company_id;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getHeadQuarter() {
	return headQuarter;
}
public void setHeadQuarter(String headQuarter) {
	this.headQuarter = headQuarter;
}
public long getFounded() {
	return founded;
}
public void setFounded(long founded) {
	this.founded = founded;
}
public String getType() {
	return industryType;
}
public void setType(String type) {
	this.industryType = type;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
} 

}
