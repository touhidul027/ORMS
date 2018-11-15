package jobPostingDAO;

public class JobPostingCompanyInfo {

	String jobPostingCompanyAdress ; 
	String jobPostingCompanyEmail ; 
	String jobPostingCompanyCellPhoneNumber ; 
	String jobPostingCompanyWebsite ;
	
	public JobPostingCompanyInfo(String jobPostingCompanyEmail,String jobPostingCompanyCellPhoneNumber,String jobPostingCompanyAdress, 
			 String jobPostingCompanyWebsite) {
		 
		this.jobPostingCompanyAdress = jobPostingCompanyAdress;
		this.jobPostingCompanyEmail = jobPostingCompanyEmail;
		this.jobPostingCompanyCellPhoneNumber = jobPostingCompanyCellPhoneNumber;
		this.jobPostingCompanyWebsite = jobPostingCompanyWebsite;
	}
	public JobPostingCompanyInfo() {
	}
	
	@Override
	public String toString() {
		return "JobPostingCompanyInfo [jobPostingCompanyAdress=" + jobPostingCompanyAdress + ", jobPostingCompanyEmail="
				+ jobPostingCompanyEmail + ", jobPostingCompanyCellPhoneNumber=" + jobPostingCompanyCellPhoneNumber
				+ ", jobPostingCompanyWebsite=" + jobPostingCompanyWebsite + "]";
	}
	public String getJobPostingCompanyAdress() {
		return jobPostingCompanyAdress;
	}
	public void setJobPostingCompanyAdress(String jobPostingCompanyAdress) {
		this.jobPostingCompanyAdress = jobPostingCompanyAdress;
	}
	public String getJobPostingCompanyEmail() {
		return jobPostingCompanyEmail;
	}
	public void setJobPostingCompanyEmail(String jobPostingCompanyEmail) {
		this.jobPostingCompanyEmail = jobPostingCompanyEmail;
	}
	public String getJobPostingCompanyCellPhoneNumber() {
		return jobPostingCompanyCellPhoneNumber;
	}
	public void setJobPostingCompanyCellPhoneNumber(String jobPostingCompanyCellPhoneNumber) {
		this.jobPostingCompanyCellPhoneNumber = jobPostingCompanyCellPhoneNumber;
	}
	public String getJobPostingCompanyWebsite() {
		return jobPostingCompanyWebsite;
	}
	public void setJobPostingCompanyWebsite(String jobPostingCompanyWebsite) {
		this.jobPostingCompanyWebsite = jobPostingCompanyWebsite;
	} 
	
	 

}
