package jobs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.generalDAO.JDBCUtil;

import jobPostingDAO.JobPosterJoinJobPostingDAO;


public class JobPostingDAO2 {
	
	// only the jobs table will be changed instead of 'job_posting'
	// 1-M , M-M relations table will remaining same 
	// need edited soon 
	
	public static Job postJob(Job job) {
		job = insertAboutJob(job) ; 
        insertJobSkills(job.getJobId(),job.getSkills()) ; 
		insertJobjobTypes(job.getJobId(), job.getJobType()) ; 
		insertJobBenefits(job.getJobId(), job.getFacilities()) ; 
		// System.out.println("Done");
	
		return job ; 
	}
	
	public static Job insertAboutJob(Job job) {
		Connection conn=  JDBCUtil.getConnection() ; 
		int jobId;									
											
	String insertQuuery = "INSERT INTO jobs(company_name,title,location,description,education_level,experience,salary,salary_review,additional_requirements,company_email,company_cell_phone_number,adress,website) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)" ;
	       
		   try {			   
		           PreparedStatement pst =  conn.prepareStatement(insertQuuery,PreparedStatement.RETURN_GENERATED_KEYS) ; 
			           pst.setString(1, job.getCompanyName());
			           pst.setString(2, job.getTitle());
			           pst.setString(3, job.getLocation());
			           pst.setString(4, job.getDescription());
			           pst.setString( 5,job.getEducationLevel());
			           pst.setString(6, job.getExperience() );
			           pst.setString(7,job.getSalary()  );
			           pst.setString(8, job.getSalaryReview() );
			           pst.setString(9, job.getAdditionalRequirement());
			           pst.setString(10,job.getCompanyEmail()  );
			           pst.setString( 11,job.getCompanyCellPhoneNumber()  );
			           pst.setString( 12,job.getCompanyAddress()  );
			           pst.setString( 13,job.getWebsite()  );
			           
			           pst.executeUpdate(); 
		           
		           ResultSet rs = pst.getGeneratedKeys();  
		            jobId = rs.next() ? rs.getInt(1) : 0;
		           	job.setJobId(jobId);
		           
        } 
	       catch (SQLException ex) {	      
	    	  // System.out.println("Inserting job posting cause exception,mate.");
	    	   System.out.println(ex.toString());
	        }
			return job;	        
	}
	
	public static int getJobId() {
		int jobId = 0; 

		try {			
			Connection conn=  JDBCUtil.getConnection() ; 
			String job_id_query="SELECT * FROM jobs ORDER BY job_id DESC LIMIT 1" ; 
	      	PreparedStatement pst2 =  conn.prepareStatement(job_id_query) ; 
            ResultSet rs = pst2.executeQuery() ; 
        	 
              if(rs.next()){
        		 jobId = rs.getInt("job_id") ;       		
               }else {
        		 // System.out.println("No id mate");
        	  }
       	  
			}catch(Exception p) {
				//System.out.println(p.toString());
			}
		return jobId;
	}
	
	public static int getJobId(Job job) {
		int jobId = 0; 

		try {			
			Connection conn=  JDBCUtil.getConnection() ; 
			String job_id_query="SELECT job_id FROM jobs WHERE job_title=? AND company_name=? AND job_location=?" ; 
	      	 PreparedStatement pst =  conn.prepareStatement(job_id_query) ;
	      	   pst.setString(1, job.getTitle() );
 	      	   pst.setString(2, job.getCompanyName());
	           pst.setString(3, job.getLocation());
 	      	
	      	ResultSet rs = pst.executeQuery() ; 
        	 
              if(rs.next()){
        		 jobId = rs.getInt("job_id") ;       		
               }else {
        		 // System.out.println("No id mate");
        	  }
       	  
			}catch(Exception p) {
				// System.out.println(p.toString());
			}
		return jobId;
	}
	
	public static boolean insertJobSkills(int jobId,ArrayList<String> skills){
		Connection conn=  JDBCUtil.getConnection() ; 
		 
		 if(conn==null) {
			 System.out.println("insertEuducationInfo,conn null");
			 return false ; 
		 }
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
			         pstInner.setInt(1,  jobId);
			         pstInner.setInt(2, skillId );
	 	        	 pstInner.executeUpdate() ; 
 	          }        
 	           return true ; 	     	           
	       } 
	       catch (SQLException ex) 
	        {
	    	  //  System.out.println("u r getting it .");
	    	  // System.out.println(ex.toString());
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
				//System.out.println(p.toString());
			}
	  return skillId;		 
}
	
	// first inert into jobtype table ,then insert into join table
	public static boolean insertJobjobTypes(int jobId,ArrayList<String> jobTypes){
		Connection conn=  JDBCUtil.getConnection() ; 
		 
		 if(conn==null) {
			 //System.out.println("insertEuducationInfo,conn null");
			 return false ; 
		 }
		 if(jobTypes!=null) {
		    String insertQuuery = "INSERT INTO job_types(job_type_name) VALUES(?)" ;
	        try {
	          PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
	          
 	          for(String jobType : jobTypes) {
	        		  if(getJobTypeId(jobType)==0) {
 	        			   pst.setString(1, jobType); 
 	        			   pst.executeUpdate(); 
	        		  }
	        		  // skill already present in db 
	        		  int jobTypeId = getJobTypeId(jobType) ; 
	        		  String query =  "INSERT INTO job_posting_job_types_join_table (job_id, job_type_id) VALUES(?,?)" ; 	
		        	  PreparedStatement pstInner = conn.prepareStatement(query) ; 
			          pstInner.setInt(1,  jobId);
			          pstInner.setInt(2, jobTypeId );
	 	        	  pstInner.executeUpdate() ; 
	 	          }        
	 	           return true ; 	     	           
		       } 
		       catch (SQLException ex) 
		        {
//		    	   System.out.println("u r getting it .");
//		    	   System.out.println(ex.toString());
		        }
		 }
	       return false ; 
	}

	private static int getJobTypeId(String jobType) {
		int jobTypeId = 0 ; 
		try {	
			Connection conn=  JDBCUtil.getConnection() ; 
			String query="SELECT * FROM job_types WHERE job_type_name=?" ; 
	      	PreparedStatement pst =  conn.prepareStatement(query) ; 
	      	pst.setString(1, jobType);
	        ResultSet rs = pst.executeQuery() ; 
	    	 
	          if(rs.next()){
	        	  jobTypeId = rs.getInt("job_type_id") ;       		
	           }else {
	    		  System.out.println("No id mate");
	    	  }
	   	  
			}catch(Exception p) {
				//System.out.println(p.toString());
			}
		
		return jobTypeId;
	}
	
	private static boolean insertJobBenefits(int jobId,ArrayList<String> jobFacilities){
		Connection conn=  JDBCUtil.getConnection() ; 
		 
		 if(conn==null) {
			 System.out.println("insertEuducationInfo,conn null");
			 return false ; 
		 }
		 
		 if(jobFacilities!=null) {
		    String insertQuuery = "INSERT INTO job_benefits(benefit_name) VALUES(?)" ;
	        try {
	          PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
	          
		          for(String facility : jobFacilities) {
	        		  if(getfacilityId(facility)==0) {
		        			   pst.setString(1, facility); 
		        			   pst.executeUpdate(); 
	        		  }
	        		  // benefit is in already present in db 
	        		  // now join table 
	        		  int facilityId = getfacilityId(facility) ; 
	        		  String query =  "INSERT INTO job_posting_job_benefits_join_table (job_id, benefit_id) VALUES(?,?)" ; 	
		        	  PreparedStatement pstInner = conn.prepareStatement(query) ; 
			          pstInner.setInt(1,  jobId);
			          pstInner.setInt(2, facilityId );
	 	        	  pstInner.executeUpdate() ; 
	 	          }        
	 	           return true ; 	     	           
		       } 
		       catch (SQLException ex) 
		        {
//		    	   System.out.println("u r getting it .");
//		    	   System.out.println(ex.toString());
		        }
		 }
	       return false ; 
	}

	private static int getfacilityId(String facility) {
		int facilityId = 0 ; 
		try {	
			Connection conn=  JDBCUtil.getConnection() ; 
			String query="SELECT * FROM job_benefits WHERE benefit_name=?" ; 
	      	PreparedStatement pst =  conn.prepareStatement(query) ; 
	      	pst.setString(1, facility);
	        ResultSet rs = pst.executeQuery() ; 
	    	 
	          if(rs.next()){
	        	  facilityId = rs.getInt("benefit_id") ;       		
	           }else {
	    		  System.out.println("No benefit id mate ");
	    	  }
	   	  
			}catch(Exception p) {
				// System.out.println(p.toString());
			}
		
		return facilityId;
	}
}
