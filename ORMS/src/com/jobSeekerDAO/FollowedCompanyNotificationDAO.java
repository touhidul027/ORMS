package com.jobSeekerDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.generalDAO.BasicUser;
import com.generalDAO.JDBCUtil;

public class FollowedCompanyNotificationDAO {
public static ArrayList<FollowedCompanyNotification> getFollowedCompanyNotification(int followerId) {
	ArrayList<FollowedCompanyNotification> followedCompanyNotifications = new ArrayList<>(); 
	
	Connection conn = JDBCUtil.getConnection() ; 
		
		String selectQuery = "SELECT job_post_notifications.company_id,jobs.company_name, job_post_notifications.job_id, job_post_notifications.has_seen,jobs.publish_time,\r\n" + 
				"jobs.title FROM `job_post_notifications`JOIN jobs ON jobs.job_id=job_post_notifications.job_id\r\n" + 
				"WHERE follower_id=?  AND jobs.is_published=? ORDER BY jobs.publish_time DESC" ; 
		ResultSet rs = null ; 
 		BasicUser aBasicUser = null ; 
		try {
	        PreparedStatement pst =  conn.prepareStatement(selectQuery) ; 
	           pst.setInt(1, followerId);
	           pst.setInt(2, 1);
 	           rs = pst.executeQuery() ; 
 	           while(rs.next()) {
 	        	  FollowedCompanyNotification followedCompanyNotification = new FollowedCompanyNotification() ; 
 	              followedCompanyNotification.setCompanyId(rs.getInt("company_id"));
 	              followedCompanyNotification.setCompanyName(rs.getString("company_name"));
 	              followedCompanyNotification.setJobId(rs.getInt("job_id"));
 	              followedCompanyNotification.setJobTitle(rs.getString("title"));
 	              followedCompanyNotification.setHasSeenStatus(rs.getInt("has_seen"));
 	              followedCompanyNotification.setPublishTime(rs.getLong("publish_time"));

  	             followedCompanyNotifications.add(followedCompanyNotification) ; 
 	              
 	           }
 	           
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		return followedCompanyNotifications ; 
	}
}
