package com.jobSeekerDAO;

import java.util.Arrays;

public class JobSeekerInterests {
	String[] jobSeekerInterestsList ; 

	public JobSeekerInterests(String[] jobSeekerInterestsList) {
		super();
		this.jobSeekerInterestsList = jobSeekerInterestsList;
	}

	public JobSeekerInterests() {
		}

	@Override
	public String toString() {
		return "jobSeekerInterests [jobSeekerInterestsList=" + Arrays.toString(jobSeekerInterestsList) + "]";
	}

	public String[] getJobSeekerInterestsList() {
		return jobSeekerInterestsList;
	}

	public void setJobSeekerInterestsList(String[] jobSeekerInterestsList) {
		this.jobSeekerInterestsList = jobSeekerInterestsList;
	}

	 
}
