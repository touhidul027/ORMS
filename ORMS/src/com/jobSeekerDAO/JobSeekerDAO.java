package com.jobSeekerDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.generalDAO.BasicUser;
import com.generalDAO.JDBCUtil;

import jobs.Job;
import jobs.JobDAO;

public class JobSeekerDAO {
	
 public static ArrayList<SavedJob> getSavedJobs(int jobSeekerId) {
	 ArrayList<SavedJob> savedJobs = new ArrayList<SavedJob>() ; 
	 
	 Connection conn = JDBCUtil.getConnection() ; 
		
		String signInQuery = "SELECT * FROM save_jobs WHERE job_seeker_id=?" ; 
		ResultSet rs = null ; 
		try {
	        PreparedStatement pst =  conn.prepareStatement(signInQuery) ; 
	           pst.setInt(1, jobSeekerId );
 	           rs = pst.executeQuery() ; 
	           while(rs.next()) {
	        	   Job job = JobDAO.getJob( rs.getInt("job_id")) ; 
	        	   long time = rs.getLong("time"); 
	        	   String note =  rs.getString("note"); 
	        	   savedJobs.add( new SavedJob(job, time, note)) ; 
 	           }
 }catch(Exception e ) {
	 
 }
// System.out.println(savedJobs);
return  savedJobs ; 
 }	 
 
 // company id list that had been followed 
 public static ArrayList<Integer> getFollowedCompany(int followerId) {
     ArrayList<Integer> followedCompanies = new ArrayList<>() ; 
	 
	 Connection conn = JDBCUtil.getConnection() ; 
 	 String signInQuery = "SELECT company_id FROM company_followers WHERE follower_id=?" ; 
	 ResultSet rs = null ; 
	 try {
	     PreparedStatement pst =  conn.prepareStatement(signInQuery) ; 
	     pst.setInt(1,followerId);
	     rs=pst.executeQuery() ; 
	     
	     while(rs.next()) {
	    	 followedCompanies.add( rs.getInt("company_id") ) ; 	    	 
	     }
	     
	      
	 }catch(Exception e) {
		 
	 }
	 return followedCompanies ; 
 }// end method 
 
}
