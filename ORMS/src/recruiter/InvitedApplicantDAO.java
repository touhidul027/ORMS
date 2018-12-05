package recruiter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.generalDAO.JDBCUtil;

import jobs.Job;

public class InvitedApplicantDAO {
	
 public static ArrayList<InvitedApplicant> getApplicants(int recruiterId) {
	 ArrayList<InvitedApplicant> invitedApplicants = new ArrayList<>() ; 
	 
    Connection conn = JDBCUtil.getConnection() ; 
			 
	String selectQuery ="SELECT jobs_application.job_id,jobs_application.job_seeker_id FROM `job_poster_job_posting_join_table` \r\n" + 
			"JOIN jobs_application ON job_poster_job_posting_join_table.job_id=jobs_application.job_id\r\n" + 
			"WHERE `job_poster_id`= ? AND jobs_application.sent_invitation=0\r\n" + 
			"ORDER BY jobs_application.apply_time DESC" ; 
			
				ResultSet rs = null ; 
				try {
			        PreparedStatement pst =  conn.prepareStatement(selectQuery) ; 
			        pst.setInt(1, recruiterId);			           
			        rs = pst.executeQuery() ; 		           
			        	   
			        // means we have many unseen job seeker notification
			       while(rs.next()) {
			    	   InvitedApplicant invitedApplicant = new InvitedApplicant() ; 
			    	   invitedApplicant.setJobId(rs.getInt("job_id"));
			    	   invitedApplicant.setJobSeekerId(rs.getInt("job_seeker_id "));
			    	   invitedApplicants.add(invitedApplicant) ; 
			       }
			       
			     }catch (Exception e) {
 				}
	 return invitedApplicants ;        
 }
 
 public static boolean notInvited(int jobId,int jobSeekerId) {
	 	 
	    Connection conn = JDBCUtil.getConnection() ; 
	    String selectQuery=
	    		"SELECT * FROM jobs_application WHERE job_id=? AND job_seeker_id=? AND sent_invitation=0 LIMIT 1" ; 
	    ResultSet rs = null ; 
		try {
	        PreparedStatement pst =  conn.prepareStatement(selectQuery) ; 
	        pst.setInt(1, jobId);		
	        pst.setInt(2, jobSeekerId);
	        rs = pst.executeQuery() ; 		           
	        
	        if(rs.next()) {        	
	        	return true ; 
	        }
 	        
	     }catch (Exception e) {
			}
		return false;    
 }
 
}
