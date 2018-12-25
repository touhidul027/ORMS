package company;

import java.util.ArrayList;

import recruiter.Recruiter;

public class Company {
	
private int company_id ; 
private String companyName ; 
private String headQuarter ; 
private String founded ; 
private String industryType ; 
private int size ;
private String company_address ; 
private String email ; 
private String website ; 
private String cellPhoneNumber ; 
private String publicInfo ; 
private Recruiter recruiter ; 

//add review later 
private ArrayList<Review> reviews ; 


public Company() {
	super();
	// TODO Auto-generated constructor stub
}



public Company(int company_id, String companyName, String headQuarter, String founded, String industryType, int size,
		String company_address, String email, String website, String cellPhoneNumber, String publicInfo) {
	super();
	this.company_id = company_id;
	this.companyName = companyName;
	this.headQuarter = headQuarter;
	this.founded = founded;
	this.industryType = industryType;
	this.size = size;
	this.company_address = company_address;
	this.email = email;
	this.website = website;
	this.cellPhoneNumber = cellPhoneNumber;
	this.publicInfo = publicInfo;
}



public String getPublicInfo() {
	return publicInfo;
}
public void setPublicInfo(String publicInfo) {
	this.publicInfo = publicInfo;
}
public Recruiter getRecruiter() {
	return recruiter;
}
public void setRecruiter(Recruiter recruiter) {
	this.recruiter = recruiter;
}
public void setCellPhoneNumber(String cellPhoneNumber) {
	this.cellPhoneNumber = cellPhoneNumber;
}

public String getCompany_address() {
	return company_address;
}
public void setCompany_address(String company_address) {
	this.company_address = company_address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getWebsite() {
	return website;
}
public void setWebsite(String website) {
	this.website = website;
}
public String getCellPhoneNumber() {
	return cellPhoneNumber;
}
public void setCell_phone_number(String cell_phone_number) {
	this.cellPhoneNumber = cell_phone_number;
}

public ArrayList<Review> getReviews() {
	return reviews;
}
public void setReviews(ArrayList<Review> reviews) {
	this.reviews = reviews;
}
public String getIndustryType() {
	return industryType;
}
public void setIndustryType(String industryType) {
	this.industryType = industryType;
}
public Recruiter getRecruiters() {
	return recruiter;
}
public void setRecruiters(Recruiter recruiters) {
	this.recruiter = recruiter;
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
public String getFounded() {
	return founded;
}
public void setFounded(String founded) {
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
