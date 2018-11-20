package com.generalDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jobPostingDAO.AllJobPostingGeneralObjDAO;
import jobPostingDAO.JobPostingGeneralObj;

public class SearchJobs {
	public static ArrayList<JobPostingGeneralObj> searchs(String jobTitle,String location) {	
		
		ArrayList<JobPostingGeneralObj> allJobPostingGeneralObj = new ArrayList<>() ;
		 
		 // select all the job id 
		
			 Connection conn = JDBCUtil.getConnection() ; 
		//	 job_id`, `company_name`, `job_title`, `job_location`, `job_description`, `education_level`, 
		//	 `experience`, `salary`, `salary_review`, `additional_requirements`, `company_email`, 
		//	 `company_cell_phone_number`, `adress`, `company_website`	
			 
				String signInQuery = "SELECT * FROM job_posting WHERE CONCAT(company_name,job_title) LIKE ? OR CONCAT(job_location,adress) LIKE ?" ; 
				ResultSet rs = null ; 
	 			try {
			        PreparedStatement pst =  conn.prepareStatement(signInQuery) ; 
			           pst.setString(1,"%" + jobTitle+ "%");
			           pst.setString(2,"%" + location+ "%");

			           rs = pst.executeQuery() ; 
			           
			        	   
			        	 while(rs.next()) {
			        		//System.out.println("job id " +rs.getInt("job_id") );
			        		 // create a object that hold a single job information 
			        		 JobPostingGeneralObj jobPostingGeneralObj = new JobPostingGeneralObj() ; 
			        		 
			        		 // now select all the available values from the job posting table 
			        		 jobPostingGeneralObj =  AllJobPostingGeneralObjDAO.getAJobPostingGeneralObj(rs.getInt("job_id"));  
			        		 
			        		// let us check we got everything  or not
			        		// System.out.println(jobPostingGeneralObj);
			        		 
			        		 
			        		 allJobPostingGeneralObj.add(jobPostingGeneralObj) ; 
			        		 
			        	 }
			        	// System.out.println(allJobPostingGeneralObj);
			        	 
			        	 return allJobPostingGeneralObj ; 
			        	 
	 		           
			       } 
			       catch (SQLException ex) 
			       {
			    	   System.out.println(ex);
			       }
	 	
		 
		
		return null ; 
	}
}

