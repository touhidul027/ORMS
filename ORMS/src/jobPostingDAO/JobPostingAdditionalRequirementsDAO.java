package jobPostingDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.generalDAO.JDBCUtil;

public class JobPostingAdditionalRequirementsDAO {
public static void insertBenefits(int jobId,JobPostingAdditionalRequirements jobPostingAdditionalRequirementsObj) {		
		Connection conn=  JDBCUtil.getConnection() ; 
		
			 if(conn==null) {
				 System.out.println(" ");			
			 }			 
		    String insertQuuery = "UPDATE job_posting SET additional_requirements = ? WHERE job_id= ?";
	       
		    try {
		           PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
			           pst.setString(1, jobPostingAdditionalRequirementsObj.getJobPostingAdditionalRequirementsinput() );
			           pst.setInt(2,jobId );			           
			           pst.executeUpdate(); 
	        } 
	       catch (SQLException ex) {	      
	    	   System.out.println("Inserting job employee info cause exception,mate.");
	    	   System.out.println(ex.toString());
	        }
}
public static void insertBenefits(JobPostingGeneralObj jobPostingGeneralObj) {		
	Connection conn=  JDBCUtil.getConnection() ; 
	int jobId  = jobPostingGeneralObj.getJobId() ; 
	
		 if(conn==null) {
			 System.out.println(" ");			
		 }			 
	    String insertQuuery = "UPDATE job_posting SET additional_requirements = ? WHERE job_id= ?";
       
	    try {
	           PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
		           pst.setString(1, jobPostingGeneralObj.getJobPostingAdditionalRequirementsinput() );
		           pst.setInt(2,jobId );			           
		           pst.executeUpdate(); 
        } 
       catch (SQLException ex) {	      
    	   System.out.println("Inserting job employee info cause exception,mate.");
    	   System.out.println(ex.toString());
        }
}
}
