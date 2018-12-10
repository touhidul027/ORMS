package com.generalDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jobPostingDAO.JobPostingGeneralObj;
import jobs.Job;
import jobs.JobDAO;

public class SearchJobs {
	public static ArrayList<Job> searchs(String jobTitle,String location) {	
		
		ArrayList<Job> jobs = new ArrayList<>() ;
		 
		 // select all the job id 
		
			 Connection conn = JDBCUtil.getConnection() ; 	
			 
				String signInQuery = "SELECT * FROM jobs WHERE LOWER(CONCAT(company_name,title)) LIKE ? OR LOWER(CONCAT(location,adress)) LIKE ?" ; 
				ResultSet rs = null ; 
	 			try {
			        PreparedStatement pst =  conn.prepareStatement(signInQuery) ; 
			           pst.setString(1,"%" + jobTitle+ "%");
			           pst.setString(2,"%" + location+ "%");

			           rs = pst.executeQuery() ; 
		        		// System.out.println("hi");

			        	   
			        	 while(rs.next()) {
			        		//System.out.println("job id " +rs.getInt("job_id") );
			        		 // create a object that hold a single job information 
			        		 Job job = new Job() ; 
			        		 
			        		 // now select all the available values from the job posting table 
			        		 job =  JobDAO. getJob(rs.getInt("job_id"));  
			        		 
			        		// let us check we got everything  or not
			        		// System.out.println(job);
			        		 
			        		 
			        		 jobs.add(job) ; 
			        		 
			        	 }
			        	// System.out.println(jobs);
			        	 
			        	 return jobs ; 
			        	 
	 		           
			       } 
			       catch (SQLException ex) 
			       {
			    	   System.out.println(ex);
			       }
		return null ; 
	}
}

