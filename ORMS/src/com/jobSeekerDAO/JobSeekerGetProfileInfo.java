package com.jobSeekerDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.generalDAO.BasicUser;
import com.generalDAO.JDBCUtil;

public class JobSeekerGetProfileInfo {
	
	// get the id from when this method is called 
	public static JobSeeker getJobSeeker(JobSeeker jobSeeker)
	{	
		int userId = jobSeeker.getId() ; 
		jobSeeker = getPersonalInfo(jobSeeker) ; // personal info
		jobSeeker.setCellPhoneNumber(getCellPhones(userId) ); // cell phone 
		jobSeeker.setActivities(activities(userId));
		jobSeeker.setInterests(interests(userId));
		jobSeeker.setEducation( getEducation(userId) );
		jobSeeker.setExperience(getExperiences(userId));
		jobSeeker.setSkills(getAllSkills(userId));
		return jobSeeker ; 
	}
	
	private static JobSeeker getPersonalInfo(JobSeeker jobSeeker) {
		Connection conn = JDBCUtil.getConnection() ; 
			String signInQuery = "SELECT * FROM job_seeker WHERE id=?" ; 
		ResultSet rs = null ; 
			try {
	        PreparedStatement pst =  conn.prepareStatement(signInQuery) ; 		           
		           pst.setInt(1 , jobSeeker.getId() );
	           rs = pst.executeQuery() ;
	           
	           if(rs.next()) {
	        	   
		           String address = rs.getString("address") ; 	        	   
	        	   String objective = rs.getString("objective") ; 
	        	   String gender = rs.getString("gender") ; 
	        	   String nid = rs.getString("nid") ; 
	        	   
	        	   jobSeeker.setAdress(address);
	        	   jobSeeker.setObjective(objective);
	        	   jobSeeker.setGender(gender);
	        	   jobSeeker.setNid(nid);
	        	   
	        	   return jobSeeker ; 
	           }
	       } 
	       catch (SQLException ex) 
	       {	    	   
	       }		
		return jobSeeker;
	}
	
	private static  ArrayList<String> getCellPhones(int userId) {		
		Connection conn = JDBCUtil.getConnection() ; 
		String signInQuery = "SELECT * FROM  cell_phone WHERE user_id=?" ; 
		ArrayList<String> cellPhoneNumber = new ArrayList<>() ; 
		ResultSet rs = null ; 
		try {
	        PreparedStatement pst =  conn.prepareStatement(signInQuery) ; 		           
		           pst.setInt(1 , userId);
	               rs = pst.executeQuery() ;
	           
	           
	           while( rs.next() ) {
	        	   cellPhoneNumber.add( rs.getString("cell_phone_number")) ; 
	           }
	           return cellPhoneNumber ; 
	       } 
	       catch (SQLException ex) 
	       {
		   }		
		
		return cellPhoneNumber;		
	}
	
	private static ArrayList<String> activities(int userId){
		Connection conn = JDBCUtil.getConnection() ; 
		String signInQuery = "SELECT * FROM  activities WHERE user_id=?" ; 
		
		ArrayList<String> activities = new ArrayList<>() ; 
		
		ResultSet rs = null ; 
		try {
	        PreparedStatement pst =  conn.prepareStatement(signInQuery) ; 		           
		           pst.setInt(1 , userId);
	               rs = pst.executeQuery() ;
	           
	           
	           while( rs.next() ) {
	        	   activities.add( rs.getString("activity_name")) ; 
	           }
	           return activities ; 
	       } 
	       catch (SQLException ex) 
	       {
		   }		
		
		return activities;				 
	}
	
	private static ArrayList<String> interests(int userId){
		Connection conn = JDBCUtil.getConnection() ; 
		String selectQuery = "SELECT * FROM  interests WHERE user_id=?" ; 
		
		ArrayList<String> interests = new ArrayList<>() ; 
		
		ResultSet rs = null ; 
		try {
	        PreparedStatement pst =  conn.prepareStatement(selectQuery) ; 		           
		           pst.setInt(1 , userId);
	               rs = pst.executeQuery() ;
	           while( rs.next() ) {
	        	   interests.add( rs.getString("interest_name")) ; 
	           }
	           return interests ; 
	       } 
	       catch (SQLException ex) 
	       {
		   }				
		return interests;				 
	}
	
	private static ArrayList<JobSeekerEducation> getEducation(int userId) {
		Connection conn = JDBCUtil.getConnection() ; 
		String selectQuery = "SELECT * FROM  education WHERE user_id=?" ; 
		
		ArrayList<JobSeekerEducation> educations = new ArrayList<>() ; 
		
		ResultSet rs = null ; 
		try {
	        PreparedStatement pst =  conn.prepareStatement(selectQuery) ; 		           
		           pst.setInt(1 , userId);
	               rs = pst.executeQuery() ;
	           while( rs.next() ) {	        	   	        	    
	        	    String jobSeekerEducationLevel = rs.getString("education_level"); 
	        		String jobSeekerEducationalInstituition = rs.getString("institution") ;
	        		String jobSeekerEducationalDuration = rs.getString("duration"); 
	        		String jobSeekerEducationalDepartment = rs.getString("department"); 
	        		JobSeekerEducation jobSeekerEducation=  new JobSeekerEducation(jobSeekerEducationLevel,jobSeekerEducationalInstituition,jobSeekerEducationalDepartment,jobSeekerEducationalDuration) ; 
	        		educations.add(jobSeekerEducation) ; 
	           }
	           
	       } 
	       catch (SQLException ex) 
	       {
		   }				
		return educations;	
	}
	
	private static ArrayList<JobSeekerExperience>  getExperiences(int userId) {
		Connection conn = JDBCUtil.getConnection() ; 
		String selectQuery = "SELECT * FROM  experiences WHERE id=?" ; 
		
		ArrayList<JobSeekerExperience> experiences = new ArrayList<>() ; 
		 
		ResultSet rs = null ; 
		try {
	        PreparedStatement pst =  conn.prepareStatement(selectQuery) ; 		        	        
		           pst.setInt(1 , userId);
	               rs = pst.executeQuery() ;
	             
	           while( rs.next() ) {	        	   	        	    
	        	  String jobSeekerOrganizationName= rs.getString("organization_name"); 
	        	  String jobSeekerDesignation= rs.getString("designation"); 
	        	  String jobSeekerEmploymentDuration= rs.getString("duration"); 
	        	  String jobSeekerProjectName= rs.getString("project_name"); 
	        	  
	        	  JobSeekerExperience experience = new JobSeekerExperience(jobSeekerOrganizationName, jobSeekerDesignation, jobSeekerEmploymentDuration, jobSeekerProjectName) ; 
	        	  experiences.add(experience) ; 
	           }	           
	       } 
	       catch (Exception ex) 
	       {
		   }				
		return experiences;	
	}
	
	private static ArrayList<String> getAllSkills(int userId) {
	Connection conn = JDBCUtil.getConnection() ; 	
		String signInQuery = "SELECT * FROM job_skills WHERE skill_id IN(SELECT skill_id FROM job_posting_job_skills_join_table WHERE job_id=?)" ; 
		ResultSet rs = null ; 
		ArrayList<String> skillNames = new ArrayList<>() ; 
		
		int i=0 ; 
	        PreparedStatement pst;
			try {
				pst = conn.prepareStatement(signInQuery);
				pst.setInt(1, userId);
		        rs = pst.executeQuery() ; 
		     
		        while(rs.next()) {
		        	skillNames.add(rs.getString("skill_name")) ; 
		        }
		        
				return skillNames ; 	 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				//System.out.println("Exception mate");
				e.printStackTrace();
			}
			return skillNames;        	   
	}
}
