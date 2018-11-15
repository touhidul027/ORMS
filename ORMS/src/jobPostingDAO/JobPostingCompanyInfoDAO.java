package jobPostingDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.generalDAO.JDBCUtil;

public class JobPostingCompanyInfoDAO {
	
	public static void insertCompanyInfo(int jobId,JobPostingCompanyInfo jobPostingCompanyInfoObj) {		
		Connection conn=  JDBCUtil.getConnection() ; 	
			 if(conn==null) {
				 System.out.println(" ");				
			 }
			 
		    String insertQuuery = "UPDATE job_posting SET company_email=?, company_cell_phone_number=?, adress=?, company_website=?  WHERE job_id= ?";
	       
		    try {
		           PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
			           pst.setString(1,jobPostingCompanyInfoObj.getJobPostingCompanyEmail() );
			           pst.setString(2, jobPostingCompanyInfoObj.getJobPostingCompanyCellPhoneNumber());
			           pst.setString(3, jobPostingCompanyInfoObj.getJobPostingCompanyAdress());
			           pst.setString(4, jobPostingCompanyInfoObj.getJobPostingCompanyWebsite());
			           pst.setInt(5,jobId );
			           pst.executeUpdate();            
 	        } 
	       catch (SQLException ex) {	      
	    	   System.out.println("Inserting company info cause exception,mate.");
	    	   System.out.println(ex.toString());
	        }
	}
	
	public static void insertCompanyInfo(JobPostingGeneralObj jobPostingGeneralObj) {		
		Connection conn=  JDBCUtil.getConnection() ; 	
		int jobId = jobPostingGeneralObj.getJobId(); 
			 if(conn==null) {
				 System.out.println(" ");				
			 }
			 
		    String insertQuuery = "UPDATE job_posting SET company_email=?, company_cell_phone_number=?, adress=?, company_website=?  WHERE job_id= ?";
	       
		    try {
		           PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
			           pst.setString(1,jobPostingGeneralObj.getJobPostingCompanyEmail() );
			           pst.setString(2, jobPostingGeneralObj.getJobPostingCompanyCellPhoneNumber());
			           pst.setString(3, jobPostingGeneralObj.getJobPostingCompanyAdress());
			           pst.setString(4, jobPostingGeneralObj.getJobPostingCompanyWebsite());
			           pst.setInt(5,jobId );
			           pst.executeUpdate();            
 	        } 
	       catch (SQLException ex) {	      
	    	   System.out.println("Inserting company info cause exception,mate.");
	    	   System.out.println(ex.toString());
	        }
	}
}
