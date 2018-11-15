package com.jobSeekerDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.generalDAO.BasicUser;
import com.generalDAO.JDBCUtil;

public class JobSeekerProfileConfirmationDAO {	
	
	public static boolean insertPersonalInfo(JobSeekerPersonalInfo jobSeekerPersonalInfoObj,BasicUser basicUser){
		Connection conn=  JDBCUtil.getConnection() ; 
		 
		 if(conn==null) {
			 System.out.println("SignUpDAO,conn null");
			 return false ; 
		 }
		 
		    String insertQuuery = "INSERT INTO job_seeker_personal_info(serial, adress, gender, cell_phone_number, nid) VALUES(?,?,?,?,?)" ;
	        try {
	          PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
 	          pst.setInt(1, basicUser.getUserSerial());
	          pst.setString(2, jobSeekerPersonalInfoObj.getJobSeekerAddress());
	          pst.setString(3, jobSeekerPersonalInfoObj.getJobSeekerGender());
	          pst.setString(4, jobSeekerPersonalInfoObj.getJobSeekerCellPhoneNumber());
	          pst.setString(5, jobSeekerPersonalInfoObj.getJobSeekerNidNumber());
	           return pst.executeUpdate()!=0 ; 	     
	           
	       } 
	       catch (SQLException ex) 
	        {
	    	   System.out.println("Inserting Personal Info cause exception,mate.");
	    	   System.out.println(ex.toString());
	        }
	        return false ; 
	}
	
	
	public static boolean insertExperienceInfo(JobSeekerExperience jobSeekerExperienceObj,BasicUser basicUser){
		Connection conn=  JDBCUtil.getConnection() ; 
		 
		 if(conn==null) {
			 System.out.println("insertExperienceInfo,conn null");
			 return false ; 
		 }
		 
		    String insertQuuery = "INSERT INTO job_seeker_experience(serial, organization_name, designation, employment_duration, project_name) VALUES(?,?,?,?,?)" ;
	        try {
	          PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
 	          pst.setInt(1, basicUser.getUserSerial());
	          pst.setString(2, jobSeekerExperienceObj.getJobSeekerOrganizationName() );
	          pst.setString(3, jobSeekerExperienceObj.getJobSeekerDesignation() );
	          pst.setString(4, jobSeekerExperienceObj.getJobSeekerEmploymentDuration() );
	          pst.setString(5, jobSeekerExperienceObj.getJobSeekerProjectName());
	          
	           return pst.executeUpdate()!=0 ; 	     
	           
	       } 
	       catch (SQLException ex) 
	        {
	    	   System.out.println("Inserting Experience Info cause exception,mate.");
	    	   System.out.println(ex.toString());
	        }
	        return false ; 
	}
	
	public static boolean insertEuducationInfo(JobSeekerEducation jobSeekerEducationObj,BasicUser basicUser){
		Connection conn=  JDBCUtil.getConnection() ; 
		 
		 if(conn==null) {
			 System.out.println("insertEuducationInfo,conn null");
			 return false ; 
		 }
		 
		    String insertQuuery = "INSERT INTO job_seeker_education(serial,education_level, instituition_name, department, duration) VALUES(?,?,?,?,?)" ;
	        try {
	          PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
 	          pst.setInt(1, basicUser.getUserSerial());
	          pst.setString( 2,jobSeekerEducationObj.getJobSeekerEducationLevel()  );
	          pst.setString( 3,  jobSeekerEducationObj.getJobSeekerEducationalInstituition());
	          pst.setString( 4,  jobSeekerEducationObj.getJobSeekerEducationalDepartment());
	          pst.setString( 5,  jobSeekerEducationObj.getJobSeekerDuration());
	           return pst.executeUpdate()!=0 ; 	                
	       } 
	       catch (SQLException ex) 
	        {
	    	   System.out.println("insert EuducationInfo cause exception,mate.");
	    	   System.out.println(ex.toString());
	        }
	        return false ; 
	}
	
	public static boolean insertSkills(JobSeekerSkills jobSeekerSkills,BasicUser basicUser){
		Connection conn=  JDBCUtil.getConnection() ; 
		 
		 if(conn==null) {
			 System.out.println("insertEuducationInfo,conn null");
			 return false ; 
		 }
		 
		 String[] jobSeekerSkillsArray = jobSeekerSkills.getJobSeekerSkillsList() ;
		 if(jobSeekerSkillsArray!=null) {
		    String insertQuuery = "INSERT INTO job_seeker_skills(serial, skill_name) VALUES(?,?)" ;
	        try {
	          PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
	          
 	          for(String skill : jobSeekerSkillsArray) {
 	        	  pst.setInt(1, basicUser.getUserSerial() );
 	        	  pst.setString(2, skill);
 	        	  pst.executeUpdate(); 
 	          }        
 	           return true ; 	     	           
	       } 
	       catch (SQLException ex) 
	        {
	    	   System.out.println("insert skill cause exception,mate.");
	    	   System.out.println(ex.toString());
	        }
		 }
	        return false ; 
	}
	
	public static boolean insertActivities( JobSeekerActivity jobSeekerActivityObj  ,BasicUser basicUser){
		Connection conn=  JDBCUtil.getConnection() ; 
		 
		 if(conn==null) {
			 System.out.println("insert Activity Info,conn null");
			 return false ; 
		 }
		 
		 String[] jobSeekerActivitiesArray = jobSeekerActivityObj.getJobSeekerActivityLists() ;  
		    if(jobSeekerActivitiesArray != null) {
		    	String insertQuuery = "INSERT INTO job_seeker_activities(serial, activity_name) VALUES(?,?)" ;
		        try {
		          PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
		          
	 	          for(String activity : jobSeekerActivitiesArray) {
	 	        	  pst.setInt(1, basicUser.getUserSerial() );
	 	        	  pst.setString(2, activity);
	 	        	  pst.executeUpdate(); 
	 	          }
	 	          
	 	           return true ; 	     
		           
		       } 
		       catch (SQLException ex) 
		        {
		    	   System.out.println("insert activity cause exception,mate.");
		    	   System.out.println(ex.toString());
		        }
		    }
	        return false ; 
	}
	
	public static boolean insertInterests( JobSeekerInterests jobSeekerInterestsObj  ,BasicUser basicUser){
		Connection conn=  JDBCUtil.getConnection() ; 
		 
		 if(conn==null) {
			 System.out.println("insert Interests Info,conn null");
			 return false ; 
		 }
		 
		 	String[] jobSeekerInterestsArray = jobSeekerInterestsObj.getJobSeekerInterestsList() ;  
		   if(jobSeekerInterestsArray !=null) {
		 	String insertQuuery = "INSERT INTO job_seeker_interests(serial, interest_name) VALUES(?,?)" ;
	        try {
	          PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
	          
 	          for(String interest : jobSeekerInterestsArray) {
 	        	  pst.setInt(1, basicUser.getUserSerial() );
 	        	  pst.setString(2, interest);
 	        	  pst.executeUpdate(); 
 	          } 	          
 	           return true ; 	     	           
	       } 
	       catch (SQLException ex) 
	        {
	    	   System.out.println("insert interest cause exception,mate.");
	    	   System.out.println(ex.toString());
	        }
		   }
	        return false ; 
	}
	
	public static boolean insertSummary( JobSeekerSummary jobSeekerSummaryObj  ,BasicUser basicUser){
		Connection conn=  JDBCUtil.getConnection() ; 
		 
		 if(conn==null) {
			 System.out.println("insert job seeker summary Info,conn null");
			 return false ; 
		 }
		 
 		 String insertQuuery = "INSERT INTO job_seeker_summary(serial, summary) VALUES(?,?)" ;
		     try {
		        PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 	           	           
	 	         pst.setInt(1, basicUser.getUserSerial() );
	 	         pst.setString(2, jobSeekerSummaryObj.getJobSeekerSummary()); 	          
	 	          
	 	         return pst.executeUpdate()!=0 ; 	                
	       } 
	       catch (SQLException ex) 
	       {
	    	   System.out.println("insert summary cause exception,mate.");
	    	   System.out.println(ex.toString());
	       }
	       return false ; 
	}
	
}
