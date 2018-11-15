package jobPostingDAO;

import java.util.Arrays;

public class JobPostingAboutJob {
	String jobPostingJobTitle ; 
	String jobPostingJobLocation ;
	String jobPostingJobDescription;
	String[] jobPosterKeySkillsSelection  ;
	String jobPostingCompanyName ; 
	
	 

	 

	public JobPostingAboutJob(String jobPostingJobTitle, String jobPostingCompanyName,String jobPostingJobLocation, String jobPostingJobDescription,
			String[] jobPosterKeySkillsSelection) {
		super();
		this.jobPostingJobTitle = jobPostingJobTitle;
		this.jobPostingJobLocation = jobPostingJobLocation;
		this.jobPostingJobDescription = jobPostingJobDescription;
		this.jobPosterKeySkillsSelection = jobPosterKeySkillsSelection;
		this.jobPostingCompanyName = jobPostingCompanyName;
	}

	@Override
	public String toString() {
		return "JobPostingAboutJob [jobPostingJobTitle=" + jobPostingJobTitle + ", jobPostingJobLocation="
				+ jobPostingJobLocation + ", jobPostingJobDescription=" + jobPostingJobDescription
				+ ", jobPosterKeySkillsSelection=" + Arrays.toString(jobPosterKeySkillsSelection) + "]";
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

	public JobPostingAboutJob() {
		super();
 	}

	public String getJobPostingCompanyName() {
		return jobPostingCompanyName;
	}

	public void setJobPostingCompanyName(String jobPostingCompanyName) {
		this.jobPostingCompanyName = jobPostingCompanyName;
	}

 
}
