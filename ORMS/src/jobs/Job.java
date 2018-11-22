package jobs;

import java.util.ArrayList;
import java.util.Arrays;

public class Job {
	private int jobId ; 
    
	private String title ; 
    
	private String location ;
    private String description;
    private ArrayList<String> skills  ;
    private	String companyName ; 
	private String educationLevel ; 
	private String experience ; 
	private ArrayList<String> jobType ;
	private	String salary ;   
	private	String salaryReview ;  
	private	ArrayList<String> facilities ;
	
	private	String additionalRequirement ;
	private String companyAddress ; 
	private String companyEmail ; 
	private	String companyCellPhoneNumber ; 
	private	String website ;
	
	
	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", title=" + title + ", location=" + location + ", description=" + description
				+ ", skills=" + skills + ", companyName=" + companyName + ", educationLevel=" + educationLevel
				+ ", experience=" + experience + ", jobType=" + jobType + ", salary=" + salary + ", salaryReview="
				+ salaryReview + ", facilities=" + facilities + ", additionalRequirement=" + additionalRequirement
				+ ", companyAddress=" + companyAddress + ", companyEmail=" + companyEmail + ", companyCellPhoneNumber="
				+ companyCellPhoneNumber + ", website=" + website + "]";
	}
	
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	public String shortDescription() {
		if(description.length()>60){
		 return description.substring(0, 60) ; 
		}
		return description ; 
	}
	    public Job() {
		super();
		// TODO Auto-generated constructor stub
	 
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
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public ArrayList<String> getSkills() {
			return skills;
		}
		public void setSkills(ArrayList<String> skills) {
			this.skills = skills;
		}
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getEducationLevel() {
			return educationLevel;
		}
		public void setEducationLevel(String educationLevel) {
			this.educationLevel = educationLevel;
		}
		public ArrayList<String> getJobType() {
			return jobType;
		}
		public void setJobType(ArrayList<String> jobType) {
			this.jobType = jobType;
		}
		public String getSalary() {
			return salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		public String getSalaryReview() {
			return salaryReview;
		}
		public void setSalaryReview(String salaryReview) {
			this.salaryReview = salaryReview;
		}
		public ArrayList<String> getFacilities() {
			return facilities;
		}
		public void setFacilities(ArrayList<String> facilities) {
			this.facilities = facilities;
		}
		public String getAdditionalRequirement() {
			return additionalRequirement;
		}
		public void setAdditionalRequirement(String additionalRequirement) {
			this.additionalRequirement = additionalRequirement;
		}
		public String getCompanyAddress() {
			return companyAddress;
		}
		public void setCompanyAddress(String companyAddress) {
			this.companyAddress = companyAddress;
		}
		public String getCompanyEmail() {
			return companyEmail;
		}
		public void setCompanyEmail(String companyEmail) {
			this.companyEmail = companyEmail;
		}
		public String getCompanyCellPhoneNumber() {
			return companyCellPhoneNumber;
		}
		public void setCompanyCellPhoneNumber(String companyCellPhoneNumber) {
			this.companyCellPhoneNumber = companyCellPhoneNumber;
		}
		 
		 
		
}