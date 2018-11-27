package recruiter;

public class ApplicantNotification {
	private String jobSeekerName ; 
	private String title ; // job title 
	private long applyTime ; // when the jobSeeker has applied for the job
	private String companyName ; 
	
	
	private int jobId ; 
	private int jobSeekerId ;
	
	public ApplicantNotification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJobSeekerName() {
		return jobSeekerName;
	}
	public void setJobSeekerName(String jobSeekerName) {
		this.jobSeekerName = jobSeekerName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(long applyTime) {
		this.applyTime = applyTime;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public int getJobSeekerId() {
		return jobSeekerId;
	}
	public void setJobSeekerId(int jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}
	@Override
	public String toString() {
		return  jobSeekerName + " applied for the position of " + title + " at " + companyName + "at test PM";
	} 
	
}
