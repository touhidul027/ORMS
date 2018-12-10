package com.jobSeekerDAO;

import java.text.SimpleDateFormat;
import java.util.Locale;

import jobs.Job;

public class SavedJob {
	private Job job ; 
	private long time ; 
	private String note ;
	
	public SavedJob(Job job, long time, String note) {
		super();
		this.job = job;
		this.time = time;
		this.note = note;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	} 
	public String getFormatedTime() {		
		return new SimpleDateFormat("dd:MM:yyyy HH:mm", Locale.ENGLISH).format(getTime());		
	}
	
}
