package com.jobSeekerDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.generalDAO.JDBCUtil;

import jobs.Job;
import jobs.JobDAO;

public class JobSeekerAppliedJobs {
	
public static ArrayList<Job> getAppliedJobsList(int jobSeekerId) {
	ArrayList<Job> jobs = new ArrayList<>() ;
	
		 Connection conn = JDBCUtil.getConnection() ; 
			
		 //query , to get, all the 'jobId' that he has applied for 
			String getAppliedJobsQuery = "SELECT * FROM jobs_application WHERE  job_seeker_id=?" ; 
			ResultSet rs = null ; 
			
			try {
		        PreparedStatement pst =  conn.prepareStatement(getAppliedJobsQuery) ; 
		           pst.setInt(1,jobSeekerId);
		           rs = pst.executeQuery() ; 
		           
		        	   
		        	 while(rs.next()) {
		        		//System.out.println("job id " +rs.getInt("job_id") );
		        		 
		        		 // create a object that hold a single job information 
		        		 Job job = new Job() ; 
		        		 
		        		 // now select all the available values from the jobs table 
		        		 job = JobDAO.getJob(rs.getInt("job_id")) ;
		        		 
		        		// let us check we got everything  or not
		        		// System.out.println(job);		        		 
		        		 
		        		 jobs.add(job) ; 
		        	    //	 
		        	 }
		        	 return jobs ; 
		        	 
		           
		       } 
		       catch (SQLException ex) 
		       {
		    	  // System.out.println("Exception");
		       }
			return null;
	// return null ; 
}

}
