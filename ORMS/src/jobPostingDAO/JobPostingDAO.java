package jobPostingDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.generalDAO.BasicUser;
import com.generalDAO.JDBCUtil;
import com.jobSeekerDAO.JobSeekerPersonalInfo;
import com.jobSeekerDAO.JobSeekerSkills;

public class JobPostingDAO {
	
	public static int getJobId() {
		int jobId = 0; 

		try {			
			Connection conn=  JDBCUtil.getConnection() ; 
			String job_id_query="SELECT * FROM job_posting ORDER BY job_id DESC LIMIT 1" ; 
	      	PreparedStatement pst2 =  conn.prepareStatement(job_id_query) ; 
            ResultSet rs = pst2.executeQuery() ; 
        	 
              if(rs.next()){
        		 jobId = rs.getInt("job_id") ;       		
               }else {
        		  System.out.println("No id mate");
        	  }
       	  
			}catch(Exception p) {
				System.out.println(p.toString());
			}
		return jobId;
	}
	
	public static int getJobId(JobPostingGeneralObj jobPostingGeneralObj) {
		int jobId = 0; 

		try {			
			Connection conn=  JDBCUtil.getConnection() ; 
			String job_id_query="SELECT job_id FROM job_posting WHERE job_title=? AND company_name=? AND job_location=?" ; 
	      	 PreparedStatement pst =  conn.prepareStatement(job_id_query) ;
	      	   pst.setString(1, jobPostingGeneralObj.getJobPostingJobTitle());
 	      	   pst.setString(2, jobPostingGeneralObj.getJobPostingCompanyName());
	           pst.setString(3, jobPostingGeneralObj.getJobPostingJobLocation());
 	      	
	      	ResultSet rs = pst.executeQuery() ; 
        	 
              if(rs.next()){
        		 jobId = rs.getInt("job_id") ;       		
               }else {
        		  System.out.println("No id mate");
        	  }
       	  
			}catch(Exception p) {
				System.out.println(p.toString());
			}
		return jobId;
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
	

	public static boolean insertJobSkills(int jobId,String[] skills){
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
	    	   System.out.println("u r getting it .");
	    	   System.out.println(ex.toString());
	        }
		 }
	       return false ; 
	}
	
	public static boolean insertAboutJob(JobPostingAboutJob jobPostingAboutJobObj) {
		Connection conn=  JDBCUtil.getConnection() ; 
		
			 if(conn==null) {
				 System.out.println(" ");
				 return false ; 
			 }
			
			int job_id;
		    String insertQuuery = "INSERT INTO job_posting(company_name,job_title,job_location,job_description) VALUES(?,?,?,?)" ;
	       
		    try {
		           PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
			           pst.setString(1, jobPostingAboutJobObj.getJobPostingCompanyName());
			           pst.setString(2, jobPostingAboutJobObj.getJobPostingJobTitle());
			           pst.setString(3, jobPostingAboutJobObj.getJobPostingJobLocation());
			           pst.setString(4, jobPostingAboutJobObj.getJobPostingJobDescription());
		           boolean flag =  pst.executeUpdate()!=0 ; 
		           
		           // call the function to perform the skill adding and junctioning the table 
		           insertJobSkills(getJobId(),jobPostingAboutJobObj.getJobPosterKeySkillsSelection()) ; 
		           
	        } 
	       catch (SQLException ex) {	      
	    	   System.out.println("Inserting job posting cause exception,mate.");
	    	   System.out.println(ex.toString());
	        }
	        return false ; 
	}
	
	public static JobPostingGeneralObj insertAboutJob(JobPostingGeneralObj jobPostingGeneralObj) {
		Connection conn=  JDBCUtil.getConnection() ; 
		int jobId;
			  
			
		    String insertQuuery = "INSERT INTO job_posting(company_name,job_title,job_location,job_description) VALUES(?,?,?,?)" ;
	       
		    try {
		           PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
			           pst.setString(1, jobPostingGeneralObj.getJobPostingCompanyName());
			           pst.setString(2, jobPostingGeneralObj.getJobPostingJobTitle());
			           pst.setString(3, jobPostingGeneralObj.getJobPostingJobLocation());
			           pst.setString(4, jobPostingGeneralObj.getJobPostingJobDescription());
		           boolean flag =  pst.executeUpdate()!=0 ; 
		           
		        // set the accurate job id from here 
					
						if(getJobId()==getJobId(jobPostingGeneralObj)) {
							jobId = getJobId(jobPostingGeneralObj) ; 
							jobPostingGeneralObj.setJobId(jobId);
						}
		           
		           // call the function to perform the skill adding and junctioning the table 
		           insertJobSkills(jobPostingGeneralObj.getJobId(),jobPostingGeneralObj.getJobPosterKeySkillsSelection()) ; 
		           
	        } 
	       catch (SQLException ex) {	      
	    	   System.out.println("Inserting job posting cause exception,mate.");
	    	   System.out.println(ex.toString());
	        }
			return jobPostingGeneralObj;
	        
	}

}
