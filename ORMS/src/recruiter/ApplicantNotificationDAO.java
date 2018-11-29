package recruiter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.generalDAO.JDBCUtil;
import com.jobSeekerDAO.JobSeeker;

import jobs.Job;

public class ApplicantNotificationDAO {
	
// this method will return all the unread applicants applications for a single recruiter

	public static ArrayList<ApplicantNotification> getNotifications( ArrayList<Job> postedJobs ) {
		ArrayList<ApplicantNotification> applicantNotifications = new ArrayList<>() ; 
		
		
		// get each job id 
		for(Job job : postedJobs) {
			
			 int jobId = job.getJobId() ; 
			 
			
			// get the necessary field for ApplicatNotification object 
 			 Connection conn = JDBCUtil.getConnection() ; 
			 
				String selectQuery = "SELECT * FROM jobs_application WHERE job_id=? AND has_seen=?" ; 
				ResultSet rs = null ; 
				try {
			        PreparedStatement pst =  conn.prepareStatement(selectQuery) ; 
			           pst.setInt(1, jobId);
			           pst.setInt(2, 0);
			           rs = pst.executeQuery() ; 		           
			        	   
			        // means we have many unseen job seeker notification
			       while(rs.next()) {
			        // each one will make a single notification 
			        ApplicantNotification applicantNotification = new ApplicantNotification() ; 
			        int jobSeekerId = rs.getInt("job_seeker_id") ; 
			        
			        // get the necessary information 
			        applicantNotification.setJobSeekerId(jobSeekerId);
			        applicantNotification.setJobId(jobId);
			        applicantNotification.setApplyTime(rs.getLong("apply_time"));
			        
			        // get jobSeeker obj and then set jobSeeker full Name  
				        for(JobSeeker jobSeeker:job.getApplicants()) {
				        	if(jobSeeker.getId()==jobSeekerId) {
				        		//System.out.println(jobSeeker.getFullName());
				        		applicantNotification.setJobSeekerName(jobSeeker.getFullName());
				        		break ; 
				        	}
				        }
				     applicantNotification.setTitle(job.getTitle());
				     applicantNotification.setCompanyName(job.getCompanyName());
			        // System.out.println(applicantNotification);
			         
				     applicantNotifications.add(applicantNotification) ; 
			      }
		
		
				}catch(Exception e) {
					System.out.println(e.toString());
				}

		}
		return applicantNotifications ; 
}// method ends 
	
	
	/* 
	 * when a applicant message has already been seen
	 * this method will set seen status of that message 
	 */
	
	public static void updateNotification(int jobId,int jobSeekerId) {
		 Connection conn = JDBCUtil.getConnection() ; 
   		String selectQuery = "UPDATE jobs_application SET has_seen=? WHERE job_id=? AND job_seeker_id=?" ; 
		 
		try {
		      PreparedStatement pst =  conn.prepareStatement(selectQuery) ; 
		         pst.setInt(1, 1);
		         pst.setInt(2, jobId);
		         pst.setInt(3, jobSeekerId);		         
		         pst.executeUpdate() ; 		           
		        	   
	}catch(Exception e) {
		
	}
}// end method
	
	
	public static void confirmInvitation(int jobId,int jobSeekerId,String interviewTimePlace) {
	    Connection conn = JDBCUtil.getConnection() ; 
		String selectQuery = "UPDATE jobs_application SET sent_invitation=?,interview_time_place=? WHERE job_id=? AND job_seeker_id=?" ; 			 
				try {
			      PreparedStatement pst =  conn.prepareStatement(selectQuery) ; 
			         pst.setInt(1, 1);
			         pst.setString(2,  interviewTimePlace);
			         pst.setInt(3, jobId);
			         pst.setInt(4, jobSeekerId);		         
			         pst.executeUpdate() ; 		           			        	   
		}catch(Exception e) {
			System.out.println("ApplicantNotificationDAO.confirmInvitation()");
 		}	
	} // end of method
	
} // class ends 
	
	