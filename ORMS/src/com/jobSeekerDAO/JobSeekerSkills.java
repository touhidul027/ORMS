package com.jobSeekerDAO;

import java.util.Arrays;

public class JobSeekerSkills {
	private String[] jobSeekerSkillsList  ;

	public JobSeekerSkills() {
		
	}
	
	@Override
	public String toString() {
		return "JobSeekerSkills [jobSeekerSkillsList=" + Arrays.toString(jobSeekerSkillsList) + "]";
	}

	public String[] getJobSeekerSkillsList() {
		return jobSeekerSkillsList;
	}

	public void setJobSeekerSkillsList(String[] jobSeekerSkillsList) {
		this.jobSeekerSkillsList = jobSeekerSkillsList;
	}

	public JobSeekerSkills(String[] jobSeekerSkillsList) {
		this.jobSeekerSkillsList = jobSeekerSkillsList;
	} 
}
