package jobPostingDAO;

import java.util.Arrays;

public class JobPostingEmployeeInfo {
	private String jobPostingEmployeeEducationLevel ; 
	private String jobPostingEmployeeExperience ; 
	private String[] jobPostingJobType ;
	
	public JobPostingEmployeeInfo(String jobPostingEmployeeEducationLevel, String jobPostingEmployeeExperience,
			String[] jobPostingJobType) {
		super();
		this.jobPostingEmployeeEducationLevel = jobPostingEmployeeEducationLevel;
		this.jobPostingEmployeeExperience = jobPostingEmployeeExperience;
		this.jobPostingJobType = jobPostingJobType;
	}
	public JobPostingEmployeeInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getJobPostingEmployeeEducationLevel() {
		return jobPostingEmployeeEducationLevel;
	}
	public void setJobPostingEmployeeEducationLevel(String jobPostingEmployeeEducationLevel) {
		this.jobPostingEmployeeEducationLevel = jobPostingEmployeeEducationLevel;
	}
	@Override
	public String toString() {
		return "JobPostingEmployeeInfo [jobPostingEmployeeEducationLevel=" + jobPostingEmployeeEducationLevel
				+ ", jobPostingEmployeeExperience=" + jobPostingEmployeeExperience + ", jobPostingJobType="
				+ Arrays.toString(jobPostingJobType) + "]";
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
	
	
}
