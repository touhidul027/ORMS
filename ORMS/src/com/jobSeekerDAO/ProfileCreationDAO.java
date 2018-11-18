package com.jobSeekerDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.generalDAO.BasicUser;
import com.generalDAO.JDBCUtil;

public class ProfileCreationDAO {
	
	
	public static void createJobSeekerProfile(JobSeeker jobSeeker) {
		insertPersonalInfo( jobSeeker) ; 
		insertCellPhoneNumbers(jobSeeker.getCellPhoneNumber(),jobSeeker.getId()) ; 
		insertExperiences(jobSeeker) ; 
		insertEuducationInfo(jobSeeker) ; 
		insertActivities(jobSeeker) ;
		insertInterests(jobSeeker) ; 
		insertJobSkills(jobSeeker) ; 
	}
	 
	
	private static boolean insertPersonalInfo(JobSeeker jobSeeker) {		
		Connection conn=  JDBCUtil.getConnection() ; 		 
 		String insertQuuery = "INSERT INTO job_seeker(id,address,objective,gender,nid) VALUES(?,?,?,?,?)" ;
	        
		    try { 
	          PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
	          pst.setInt(1, jobSeeker.getId());
	          pst.setString(2, jobSeeker.getAdress());
	          pst.setString(3, jobSeeker.getObjective());
	          pst.setString(4, jobSeeker.getGender());
	          pst.setString(5, jobSeeker.getNid());
	          
	           pst.executeUpdate() ; 	     	           
	       } 
	       catch (SQLException ex) 
	        {
	    	//   System.out.println("Inserting Personal Info cause exception,mate.");
	    	//   System.out.println(ex.toString());
	        }
	        return false ; 
	}
	
	private static boolean insertCellPhoneNumbers(ArrayList<String> cellPhones,int user_id) {
		Connection conn=  JDBCUtil.getConnection() ; 

		if(cellPhones!=null && cellPhones.isEmpty()!=true) {
		    String insertQuuery = "INSERT INTO cell_phone(user_id, cell_phone_number) VALUES(?,?)" ;
	        try {
	          PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
	          
	          for(String cell : cellPhones) {
	        	  pst.setInt(1, user_id );
	        	  pst.setString(2, cell);
	        	  pst.executeUpdate(); 
	          }        
	           return true ; 	     	           
	       } 
	       catch (SQLException ex) 
	        {
 	        }
		 }
	        return false ; 
	}
	
	private static void insertExperiences(JobSeeker jobSeeker) {
		// TODO Auto-generated method stub
		ArrayList<JobSeekerExperience> experiences  = jobSeeker.getExperience() ; 
		
		Connection conn=  JDBCUtil.getConnection() ; 
		 
		 if( experiences!=null && experiences.isEmpty()!=true ) {

			String insertQuuery = "	INSERT INTO experiences(id, organization_name, designation, duration, project_name) VALUES(?,?,?,?,?)";   
					
	        try {
	        	for(JobSeekerExperience experience : experiences) {
		          PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
		          pst.setInt(1, jobSeeker.getId());
		          pst.setString(2,experience.getJobSeekerOrganizationName());
		          pst.setString(3, experience.getJobSeekerDesignation() );
		          pst.setString(4, experience.getJobSeekerEmploymentDuration());
		          pst.setString(5, experience.getJobSeekerProjectName());
		          
		          pst.executeUpdate() ; 	     
	        	}
	       } 
	       catch (SQLException ex) 
	        {
	    	    
	        }
		 }
 	}
	
	private static boolean insertEuducationInfo(JobSeeker jobSeeker){
		Connection conn=  JDBCUtil.getConnection() ; 
		 
		ArrayList<JobSeekerEducation> educations = jobSeeker.getEducation() ; 
		
		  
		    String insertQuuery = "INSERT INTO education(user_id,education_level, institution, duration, department) VALUES(?,?,?,?,?)" ;
	        try {
	        	
	        	for(JobSeekerEducation education : educations) {
		          PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
	 	          pst.setInt(1, jobSeeker.getId());
		          pst.setString( 2,education.getJobSeekerEducationLevel());
		          pst.setString( 3,  education.getJobSeekerEducationalInstituition());
		          pst.setString( 4,  education.getJobSeekerDuration());
		          pst.setString( 5,  education.getJobSeekerEducationalDepartment());
		           pst.executeUpdate(); 	    
	        	}
	        	
	       } 
	       catch (SQLException ex) 
	        {
	    	    
	        }
	        return false ; 
	}
	
	private static boolean insertActivities( JobSeeker jobSeeker ){
		Connection conn=  JDBCUtil.getConnection() ; 
		 
		 ArrayList<String> activities = jobSeeker.getActivities() ; 
		 
 		    if(activities != null && activities.isEmpty()!=true) {
		    	String insertQuuery = "INSERT INTO activities(user_id, activity_name) VALUES(?,?)" ;
		        try {
		        	
		          PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
		          
	 	          for(String activity : activities) {
	 	        	  pst.setInt(1, jobSeeker.getId());
	 	        	  pst.setString(2, activity);
	 	        	  pst.executeUpdate(); 
	 	          }	 	          	 	       	     		           
		       } 
		       catch (SQLException ex) 
		        {
		        }
		    }
	        return false ; 
	}
	
	private static boolean insertInterests( JobSeeker jobSeeker){
		Connection conn=  JDBCUtil.getConnection() ; 
		
		ArrayList<String> interests = jobSeeker.getInterests() ; 
		
		 
 		   if(interests !=null) {
		 	String insertQuuery = "INSERT INTO interests(user_id, interest_name) VALUES(?,?)" ;
	        try {
	          PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
	          
 	          for(String interest : interests) {
 	        	  pst.setInt(1, jobSeeker.getId());
 	        	  pst.setString(2, interest);
 	        	  pst.executeUpdate(); 
 	          } 	          
 	           return true ; 	     	           
	       } 
	       catch (SQLException ex) 
	        {	    	
	        }
		   }
	        return false ; 
	}
	
	private static boolean insertJobSkills(JobSeeker jobSeeker){
		Connection conn=  JDBCUtil.getConnection() ; 
		ArrayList<String> skills = jobSeeker.getSkills() ; 
		 
		 if(skills!=null) {
		    String insertQuuery = "INSERT INTO job_skills(skill_name) VALUES(?)" ;
	        try {
	          PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
	          
 	          for(String skill : skills) {
	        		  if(getSkillId(skill)==0) {
 	        			   pst.setString(1, skill); 
 	        			   pst.executeUpdate(); 
	        		  }
	        		  // skill already present in db 
	        		  int skillId = getSkillId(skill) ; 
	        		  String query =  "INSERT INTO job_posting_job_skills_join_table (job_id, skill_id) VALUES(?,?)" ; 	
		        	  PreparedStatement pstInner = conn.prepareStatement(query) ; 
			          pstInner.setInt(1,  jobSeeker.getId());
			          pstInner.setInt(2, skillId );
	 	        	  pstInner.executeUpdate() ; 
 	          }        
 	           return true ; 	     	           
	       } 
	       catch (SQLException ex) 
	        {
	    	   System.out.println("u r getting it .");
	    	   System.out.println(ex.toString());
	        }
		 }
	       return false ; 
	}
	
	private static int getSkillId(String skill) {
		int skillId = 0 ; 
			try {	
			Connection conn=  JDBCUtil.getConnection() ; 
			String query="SELECT * FROM job_skills WHERE skill_name=?" ; 
	      	PreparedStatement pst =  conn.prepareStatement(query) ; 
	      	pst.setString(1, skill);
	        ResultSet rs = pst.executeQuery() ; 
	    	 
	          if(rs.next()){
	        	  skillId = rs.getInt("skill_id") ;       		
	           }else {
	    		  System.out.println("No id mate");
	    	  }
	   	  
			}catch(Exception p) {
				System.out.println(p.toString());
			}
	  return skillId;		 
}
	
	
}
