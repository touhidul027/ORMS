package jobPostingDAO;

import java.util.Arrays;

public class JobPostingBenefits {
	String jobPostingSalary ;   
	String jobPostingSalaryReview ;  
	String[] jobPostingFacilities ;
	
	public JobPostingBenefits() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobPostingBenefits(String jobPostingSalary, String jobPostingSalaryReview, String[] jobPostingFacilities) {
		super();
		this.jobPostingSalary = jobPostingSalary;
		this.jobPostingSalaryReview = jobPostingSalaryReview;
		this.jobPostingFacilities = jobPostingFacilities;
	}
	@Override
	public String toString() {
		return "JobPostingBenefits [jobPostingSalary=" + jobPostingSalary + ", jobPostingSalaryReview="
				+ jobPostingSalaryReview + ", jobPostingFacilities=" + Arrays.toString(jobPostingFacilities) + "]";
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
	
	
}
