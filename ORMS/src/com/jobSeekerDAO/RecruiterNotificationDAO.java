package com.jobSeekerDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.generalDAO.JDBCUtil;

import jobs.Job;

public class RecruiterNotificationDAO {
	
	public  static ArrayList<RecruiterNotification> getNotifications(int jobSeekerId , ArrayList<Job> jobs) {
		ArrayList<RecruiterNotification> recruiterNotifications = new ArrayList<>() ; 
		
		 Connection conn = JDBCUtil.getConnection() ; 
		    
		 //select all the jobs offers that got accepted
		 // sorted by unseen first ,then early first 
			String selectQuery ="SELECT jobs_application.*,sign_up.user_serial,sign_up.full_name,sign_up.email FROM jobs_application  \r\n" + 
					"					JOIN job_poster_job_posting_join_table ON jobs_application.job_id = job_poster_job_posting_join_table.job_id\r\n" + 
					"					JOIN sign_up ON job_poster_job_posting_join_table.job_poster_id=sign_up.user_serial\r\n" + 
					"					WHERE job_seeker_id=? AND sent_invitation=? \r\n" + 
					"                    ORDER By `has_seen`ASC\r\n" + 
					"                    , `sent_invitation_time`DESC" ; 
					
 			ResultSet rs = null ; 
			try {
		        PreparedStatement pst =  conn.prepareStatement(selectQuery) ; 
		           pst.setInt(1, jobSeekerId);
		           pst.setInt(2, 1);
		           rs = pst.executeQuery() ; 
		          
		           while(rs.next()) {
		        	   RecruiterNotification recruiterNotification = new RecruiterNotification() ; 
		        	  
		        	   // get the job id 
		        	   int jobId = rs.getInt("job_id") ; 
		        	   
		        	   for(Job job : jobs) {
		        		   if(job.getJobId() == jobId) {
		        			   //System.out.println(job);
		        			   recruiterNotification.setJob(job);
		        			   break ;
		        		   }		        		   
		        	   }		        	   
		           recruiterNotification.setInterviewTimePlace(rs.getString("interview_time_place"));  
		           recruiterNotification.setRecruiterName( rs.getString("full_name"));
		           recruiterNotification.setRecruiterEmail(rs.getString("email"));		          
		           recruiterNotification.setHasSeenStatus(rs.getInt("has_seen"));
		           recruiterNotification.setApplicationId(rs.getInt("application_id"));
		           recruiterNotifications.add(recruiterNotification);
		           
		           // System.out.println(recruiterNotification);		           
		           }
		            
			}catch(Exception e) {
				System.out.println(e.toString());
			}
	
			return recruiterNotifications;
	}// end of method 
	
	
	// update has seen status,cause that has been seen 
	public static void updateNotification(int jobId,int jobSeekerId) {
		 Connection conn = JDBCUtil.getConnection() ; 
  		String selectQuery = "UPDATE jobs_application SET has_seen=? WHERE job_id=? AND job_seeker_id=?" ; 
		 
		try {
		      PreparedStatement pst =  conn.prepareStatement(selectQuery) ; 
		         pst.setInt(1, 2);
		         pst.setInt(2, jobId);
		         pst.setInt(3, jobSeekerId);		         
		         pst.executeUpdate() ; 		           
		        	   
	}catch(Exception e) {
		
	}
}// end method
	
	// it will return the notification that has the given job id
	public static RecruiterNotification getNotification(int jobId,ArrayList<RecruiterNotification> recruiterNotificaions ) {
		for(RecruiterNotification recruiterNotificaion :recruiterNotificaions) {
			if(recruiterNotificaion.getJob().getJobId()==jobId) {
				return recruiterNotificaion ; 
			}
		   }
		return null ; 
	}
	
}// end of class
 
