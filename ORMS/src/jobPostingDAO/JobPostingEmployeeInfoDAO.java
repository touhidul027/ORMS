package jobPostingDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.generalDAO.JDBCUtil;

public class JobPostingEmployeeInfoDAO {
	public static void insertEmployeeInfo(int jobId,JobPostingEmployeeInfo jobPostingEmployeeInfoObj) {
		
			Connection conn=  JDBCUtil.getConnection() ; 
			
				 if(conn==null) {
					 System.out.println(" ");
					
				 }
				 
			    String insertQuuery = "UPDATE job_posting SET education_level = ?, experience = ? WHERE job_id= ?";
		       
			    try {
			           PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
				           pst.setString(1, jobPostingEmployeeInfoObj.getJobPostingEmployeeEducationLevel() );
				           pst.setString(2, jobPostingEmployeeInfoObj. getJobPostingEmployeeExperience());
				           pst.setInt(3,jobId );
				           
				           pst.executeUpdate(); 
			           
			           // call the function to perform the job type adding and junctioning the table 
 			           insertJobjobTypes(jobId, jobPostingEmployeeInfoObj.getJobPostingJobType()) ; 
		        } 
		       catch (SQLException ex) {	      
		    	   System.out.println("Inserting job employee info cause exception,mate.");
		    	   System.out.println(ex.toString());
		        }
	}
	
	public static JobPostingGeneralObj insertEmployeeInfo(JobPostingGeneralObj jobPostingGeneralObj) {
		
		Connection conn=  JDBCUtil.getConnection() ; 
		int jobId = jobPostingGeneralObj.getJobId()  ; 
			 if(conn==null) {
				 System.out.println(" ");
				
			 }
			 
		    String insertQuuery = "UPDATE job_posting SET education_level = ?, experience = ? WHERE job_id= ?";
	       
		    try {
		           PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
			           pst.setString(1, jobPostingGeneralObj.getJobPostingEmployeeEducationLevel() );
			           pst.setString(2, jobPostingGeneralObj. getJobPostingEmployeeExperience());
			           pst.setInt(3,jobId);
			           
			           pst.executeUpdate(); 
		           
		           // call the function to perform the job type adding and junctioning the table 
			           insertJobjobTypes(jobId, jobPostingGeneralObj.getJobPostingJobType()) ; 
	        } 
	       catch (SQLException ex) {	      
	    	   System.out.println("Inserting job employee info cause exception,mate.");
	    	   System.out.println(ex.toString());
	        }
			return jobPostingGeneralObj;
}
	
	public static boolean insertJobjobTypes(int jobId,String[] jobTypes){
		Connection conn=  JDBCUtil.getConnection() ; 
		 
		 if(conn==null) {
			 System.out.println("insertEuducationInfo,conn null");
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
		    	   System.out.println("u r getting it .");
		    	   System.out.println(ex.toString());
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
				System.out.println(p.toString());
			}
		
		return jobTypeId;
	}
}
