package jobPostingDAO;

import java.util.ArrayList;

public class AllJobPostingGeneralObj {
	private ArrayList<JobPostingGeneralObj> allJobPostingGeneralObj = new ArrayList<>() ;

	public AllJobPostingGeneralObj() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AllJobPostingGeneralObj [allJobPostingGeneralObj=" + allJobPostingGeneralObj + "]";
	}

	public AllJobPostingGeneralObj(ArrayList<JobPostingGeneralObj> allJobPostingGeneralObj) {
		super();
		this.allJobPostingGeneralObj = allJobPostingGeneralObj;
	}

	public ArrayList<JobPostingGeneralObj> getAllJobPostingGeneralObj() {
		return allJobPostingGeneralObj;
	}

	public void setAllJobPostingGeneralObj(ArrayList<JobPostingGeneralObj> allJobPostingGeneralObj) {
		this.allJobPostingGeneralObj = allJobPostingGeneralObj;
	}         
}
