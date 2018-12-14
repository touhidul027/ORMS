package admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.generalDAO.BasicUser;
import com.generalDAO.JDBCUtil;

public class AdminDAO {
	
	public static void allowJobPost(int jobId) {
	Connection conn = JDBCUtil.getConnection() ; 
	String updateQuery = "UPDATE jobs SET is_published=1 WHERE job_id=?" ; 
			 
	try {
		PreparedStatement pst =  conn.prepareStatement(updateQuery) ; 
			pst.setInt(1, jobId);
 		    pst.executeUpdate() ; 		           		        	   
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
public static ArrayList<ManageJob> getRequestedJobPost() {
	Connection conn = JDBCUtil.getConnection() ; 
	ArrayList<ManageJob> manageJobs = new ArrayList<>() ; 
	 
	String selectQuery = "SELECT * FROM jobs WHERE is_published=0 ORDER BY publish_time DESC" ; 
	ResultSet rs = null ; 
		BasicUser aBasicUser = null ; 
	try {
        PreparedStatement pst =  conn.prepareStatement(selectQuery) ;          
           rs = pst.executeQuery() ; 
           while(rs.next()) {
        	   ManageJob manageJob = new ManageJob() ; 
        	   
        	   manageJob.setJobId(rs.getInt("job_id")); 
        	   manageJob.setTitle(rs.getString("title"));
        	   manageJob.setCompanyId(rs.getInt("company_id"));
        	   manageJob.setCompanyName(rs.getString("company_name"));
        	   manageJob.setPublishTime(rs.getLong("publish_time"));
        	   manageJob.setPrice(rs.getInt("price"));
        	   manageJob.setPaid(rs.getInt("paid"));
        	   manageJob.setIsAllowedStatus(rs.getInt("is_published"));
        	   manageJobs.add(manageJob) ; 
        	  // System.out.println("fine");
        	   }
       } 
       catch (Exception e) {    	   
    	   System.out.println(e.toString());
       }
	return manageJobs ; 
} // end method

// this method will delete a job seeker 
public static void delete(int jobSeekerId) {
	
}

}
