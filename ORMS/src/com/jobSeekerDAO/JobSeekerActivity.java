package com.jobSeekerDAO;

import java.io.Serializable;
import java.util.Arrays;

public class JobSeekerActivity implements Serializable{
	private String[] jobSeekerActivityLists ;

	public JobSeekerActivity(String[] jobSeekerActivityLists) {		
		this.jobSeekerActivityLists = jobSeekerActivityLists;
	}
	public JobSeekerActivity( ) {
		 
	}
	
	@Override
	public String toString() {
		return "jobSeekerActivity [jobSeekerActivityLists=" + Arrays.toString(jobSeekerActivityLists) + "]";
	}

	public String[] getJobSeekerActivityLists() {
		return jobSeekerActivityLists;
	}

	public void setJobSeekerActivityLists(String[] jobSeekerActivityLists) {
		this.jobSeekerActivityLists = jobSeekerActivityLists;
	} 
	 
}
