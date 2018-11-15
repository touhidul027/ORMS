package jobPostingDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.generalDAO.JDBCUtil;

public class JobPostingBenefitsDAO {
	public static void insertBenefitsf(int jobId,JobPostingBenefits jobPostingBenefitsObj) {
		
		Connection conn=  JDBCUtil.getConnection() ; 
		
			 if(conn==null) {
				 System.out.println(" ");				
			 }
			 
		    String insertQuuery = "UPDATE job_posting SET salary = ?, salary_review = ? WHERE job_id= ?";
	       
		    try {
		           PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
			           pst.setString(1, jobPostingBenefitsObj.getJobPostingSalary() );
			           pst.setString(2, jobPostingBenefitsObj.getJobPostingSalaryReview());
			           pst.setInt(3,jobId );
			           
			           pst.executeUpdate(); 
		           
		           // call the function to perform the job type adding and junctioning the table 
			           insertJobBenefits(jobId, jobPostingBenefitsObj.getJobPostingFacilities()) ; 
	        } 
	       catch (SQLException ex) {	      
	    	   System.out.println("Inserting job employee info cause exception,mate.");
	    	   System.out.println(ex.toString());
	        }
}
	
public static void insertBenefits(JobPostingGeneralObj jobPostingGeneralObj) {
		
		Connection conn=  JDBCUtil.getConnection() ; 
		int jobId = jobPostingGeneralObj.getJobId() ; 
		
			 if(conn==null) {
				 System.out.println(" ");
				
			 }
			 
		    String insertQuuery = "UPDATE job_posting SET salary = ?, salary_review = ? WHERE job_id= ?";
	       
		    try {
		           PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
			           pst.setString(1, jobPostingGeneralObj.getJobPostingSalary() );
			           pst.setString(2, jobPostingGeneralObj.getJobPostingSalaryReview());
			           pst.setInt(3,jobId );
			           
			           pst.executeUpdate(); 
		           
		           // call the function to perform the job type adding and junctioning the table 
			           insertJobBenefits(jobId, jobPostingGeneralObj.getJobPostingFacilities()) ; 
	        } 
	       catch (SQLException ex) {	      
	    	   System.out.println("Inserting job employee info cause exception,mate.");
	    	   System.out.println(ex.toString());
	        }
}

private static boolean insertJobBenefits(int jobId,String[] jobFacilities){
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
	    	   System.out.println("u r getting it .");
	    	   System.out.println(ex.toString());
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
			System.out.println(p.toString());
		}
	
	return facilityId;
}
}
