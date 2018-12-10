package recruiter;

import java.util.ArrayList;

import jobs.Job;

public class Recruiter {
	private int id ;
	private String fullName ; 
	private String email ; 
	private String password ; 
	private String userType ; 
	
	private ArrayList<Job> jobs ; 
	
	// newly added 11/26/2018 ,Recruiter receive informations 
	private ArrayList<ApplicantNotification> applicantNotifications ; 
	
	//invited applicants list 
	private ArrayList<InvitedApplicant> invitedApplicants;
	
	// company id 
	private int companyId ; 
	
	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public ArrayList<ApplicantNotification> getApplicantNotifications() {
		return applicantNotifications;
	}

	public ArrayList<InvitedApplicant> getInvitedApplicants() {
		return invitedApplicants;
	}
	public Recruiter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setInvitedApplicants(ArrayList<InvitedApplicant> invitedApplicants) {
		this.invitedApplicants = invitedApplicants;
	}

	public void setApplicantNotifications(ArrayList<ApplicantNotification> applicantNotifications) {
		this.applicantNotifications = applicantNotifications;
	}

	public Recruiter(int id, String fullName, String email, String password, String userType) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.userType = userType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public ArrayList<Job> getJobs() {
		return jobs;
	}

	public void setJobs(ArrayList<Job> jobs) {
		this.jobs = jobs;
	}

	@Override
	public String toString() {
		return "Recruiter [id=" + id + ", fullName=" + fullName + ", email=" + email + ", password=" + password
				+ ", userType=" + userType + "]";
	}
	
}
