package jobPostingDAO;

public class JobPostingAdditionalRequirements {
	String jobPostingAdditionalRequirementsinput ;

	public String getJobPostingAdditionalRequirementsinput() {
		return jobPostingAdditionalRequirementsinput;
	}

	public void setJobPostingAdditionalRequirementsinput(String jobPostingAdditionalRequirementsinput) {
		this.jobPostingAdditionalRequirementsinput = jobPostingAdditionalRequirementsinput;
	}

	public JobPostingAdditionalRequirements(String jobPostingAdditionalRequirementsinput) {
		super();
		this.jobPostingAdditionalRequirementsinput = jobPostingAdditionalRequirementsinput;
	}

	public JobPostingAdditionalRequirements() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "JobPostingAdditionalRequirements [jobPostingAdditionalRequirementsinput="
				+ jobPostingAdditionalRequirementsinput + "]";
	}
	
}
