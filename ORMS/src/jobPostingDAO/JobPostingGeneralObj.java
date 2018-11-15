package jobPostingDAO;

import java.util.Arrays;

public class JobPostingGeneralObj {
	private int jobId ; 
    private String jobPostingJobTitle ; 
    private String jobPostingJobLocation ;
    private String jobPostingJobDescription;
    private String[] jobPosterKeySkillsSelection  ;
    private	String jobPostingCompanyName ; 
	private String jobPostingEmployeeEducationLevel ; 
	private String jobPostingEmployeeExperience ; 
	private String[] jobPostingJobType ;
	private	String jobPostingSalary ;   
	private	String jobPostingSalaryReview ;  
	private	String[] jobPostingFacilities ;
	private	String jobPostingAdditionalRequirementsinput ;
	private String jobPostingCompanyAdress ; 
	private String jobPostingCompanyEmail ; 
	private	String jobPostingCompanyCellPhoneNumber ; 
	private	String jobPostingCompanyWebsite ;
	
	    public JobPostingGeneralObj() {
		super();
		// TODO Auto-generated constructor stub
	}
		public JobPostingGeneralObj(int jobId, String jobPostingJobTitle, String jobPostingJobLocation,
			String jobPostingJobDescription, String[] jobPosterKeySkillsSelection, String jobPostingCompanyName,
			String jobPostingEmployeeEducationLevel, String jobPostingEmployeeExperience, String[] jobPostingJobType,
			String jobPostingSalary, String jobPostingSalaryReview, String[] jobPostingFacilities,
			String jobPostingAdditionalRequirementsinput, String jobPostingCompanyAdress, String jobPostingCompanyEmail,
			String jobPostingCompanyCellPhoneNumber, String jobPostingCompanyWebsite) {
		super();
		this.jobId = jobId;
		this.jobPostingJobTitle = jobPostingJobTitle;
		this.jobPostingJobLocation = jobPostingJobLocation;
		this.jobPostingJobDescription = jobPostingJobDescription;
		this.jobPosterKeySkillsSelection = jobPosterKeySkillsSelection;
		this.jobPostingCompanyName = jobPostingCompanyName;
		this.jobPostingEmployeeEducationLevel = jobPostingEmployeeEducationLevel;
		this.jobPostingEmployeeExperience = jobPostingEmployeeExperience;
		this.jobPostingJobType = jobPostingJobType;
		this.jobPostingSalary = jobPostingSalary;
		this.jobPostingSalaryReview = jobPostingSalaryReview;
		this.jobPostingFacilities = jobPostingFacilities;
		this.jobPostingAdditionalRequirementsinput = jobPostingAdditionalRequirementsinput;
		this.jobPostingCompanyAdress = jobPostingCompanyAdress;
		this.jobPostingCompanyEmail = jobPostingCompanyEmail;
		this.jobPostingCompanyCellPhoneNumber = jobPostingCompanyCellPhoneNumber;
		this.jobPostingCompanyWebsite = jobPostingCompanyWebsite;
	}
		@Override
	public String toString() {
		return "JobPostingGeneralObj [jobId=" + jobId + ", jobPostingJobTitle=" + jobPostingJobTitle
				+ ", jobPostingJobLocation=" + jobPostingJobLocation + ", jobPostingJobDescription="
				+ jobPostingJobDescription + "\n, jobPosterKeySkillsSelection="
				+ Arrays.toString(jobPosterKeySkillsSelection) + ", jobPostingCompanyName=" + jobPostingCompanyName
				+ "\n, jobPostingEmployeeEducationLevel=" + jobPostingEmployeeEducationLevel
				+ ", jobPostingEmployeeExperience=" + jobPostingEmployeeExperience + "\n, jobPostingJobType="
				+ Arrays.toString(jobPostingJobType) + ", jobPostingSalary=" + jobPostingSalary
				+ "\n, jobPostingSalaryReview=" + jobPostingSalaryReview + ", \njobPostingFacilities="
				+ Arrays.toString(jobPostingFacilities) + ", jobPostingAdditionalRequirementsinput="
				+ jobPostingAdditionalRequirementsinput + ", jobPostingCompanyAdress=" + jobPostingCompanyAdress
				+ "\n, jobPostingCompanyEmail=" + jobPostingCompanyEmail + ", jobPostingCompanyCellPhoneNumber="
				+ jobPostingCompanyCellPhoneNumber + ", jobPostingCompanyWebsite=" + jobPostingCompanyWebsite + "]";
	}
		public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobPostingJobTitle() {
		return jobPostingJobTitle;
	}
	public void setJobPostingJobTitle(String jobPostingJobTitle) {
		this.jobPostingJobTitle = jobPostingJobTitle;
	}
	public String getJobPostingJobLocation() {
		return jobPostingJobLocation;
	}
	public void setJobPostingJobLocation(String jobPostingJobLocation) {
		this.jobPostingJobLocation = jobPostingJobLocation;
	}
	public String getJobPostingJobDescription() {
		return jobPostingJobDescription;
	}
	public void setJobPostingJobDescription(String jobPostingJobDescription) {
		this.jobPostingJobDescription = jobPostingJobDescription;
	}
	public String[] getJobPosterKeySkillsSelection() {
		return jobPosterKeySkillsSelection;
	}
	public void setJobPosterKeySkillsSelection(String[] jobPosterKeySkillsSelection) {
		this.jobPosterKeySkillsSelection = jobPosterKeySkillsSelection;
	}
	public String getJobPostingCompanyName() {
		return jobPostingCompanyName;
	}
	public void setJobPostingCompanyName(String jobPostingCompanyName) {
		this.jobPostingCompanyName = jobPostingCompanyName;
	}
	public String getJobPostingEmployeeEducationLevel() {
		return jobPostingEmployeeEducationLevel;
	}
	public void setJobPostingEmployeeEducationLevel(String jobPostingEmployeeEducationLevel) {
		this.jobPostingEmployeeEducationLevel = jobPostingEmployeeEducationLevel;
	}
	public String getJobPostingEmployeeExperience() {
		return jobPostingEmployeeExperience;
	}
	public void setJobPostingEmployeeExperience(String jobPostingEmployeeExperience) {
		this.jobPostingEmployeeExperience = jobPostingEmployeeExperience;
	}
	public String[] getJobPostingJobType() {
		return jobPostingJobType;
	}
	public void setJobPostingJobType(String[] jobPostingJobType) {
		this.jobPostingJobType = jobPostingJobType;
	}
	public String getJobPostingSalary() {
		return jobPostingSalary;
	}
	public void setJobPostingSalary(String jobPostingSalary) {
		this.jobPostingSalary = jobPostingSalary;
	}
	public String getJobPostingSalaryReview() {
		return jobPostingSalaryReview;
	}
	public void setJobPostingSalaryReview(String jobPostingSalaryReview) {
		this.jobPostingSalaryReview = jobPostingSalaryReview;
	}
	public String[] getJobPostingFacilities() {
		return jobPostingFacilities;
	}
	public void setJobPostingFacilities(String[] jobPostingFacilities) {
		this.jobPostingFacilities = jobPostingFacilities;
	}
	public String getJobPostingAdditionalRequirementsinput() {
		return jobPostingAdditionalRequirementsinput;
	}
	public void setJobPostingAdditionalRequirementsinput(String jobPostingAdditionalRequirementsinput) {
		this.jobPostingAdditionalRequirementsinput = jobPostingAdditionalRequirementsinput;
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
