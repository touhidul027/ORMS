package recruiter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.generalDAO.JDBCUtil;

import jobs.GetAllJobsDAO;
import jobs.Job;

public class RecruiterDAO {
	
	public static Recruiter getProfile( Recruiter recruiter ) {	
		
		recruiter.setCompanyId(getCompanyId(recruiter.getId()));
		// get the initialized object holding all the information job posted  by him 				
		ArrayList<Job> postedJobs = GetAllJobsDAO.getAllJob(recruiter.getId()) ; ; 							   
		recruiter.setJobs(postedJobs);
		
		// set recruiter applicant notifications 
		recruiter.setApplicantNotifications(ApplicantNotificationDAO.getNotifications(postedJobs));				 
		
		// set invited applicants 
		recruiter.setInvitedApplicants(InvitedApplicantDAO.getApplicants(recruiter.getId()));		
	 return recruiter ; 
	}
	
	public static int getCompanyId(int recruiterId) {
		Connection conn = JDBCUtil.getConnection() ; 
		int companyId = 0 ; 
		String selectQuery = "SELECT company_id FROM recruiters WHERE recruiter_id=? LIMIT 1" ; 
		ResultSet rs = null ; 
			try {
	        PreparedStatement pst =  conn.prepareStatement(selectQuery) ; 
	           pst.setInt(1, recruiterId);
	           rs = pst.executeQuery() ;            
	        	   
	        	if(rs.next()) {        		
	        		 companyId = rs.getInt("company_id") ; 
	        	}
		    }catch(Exception e) {
	        		
	        }
	    return companyId ; 
	}

}
