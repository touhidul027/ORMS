package jobPostingDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.generalDAO.JDBCUtil;

public class JobPosterJoinJobPostingDAO {
	public static boolean insertIntoJobPosterJobPostingJoinTable(int userId,int jobId) {
		Connection conn=  JDBCUtil.getConnection() ; 
		
		 if(conn==null) {
			 return false ; 
		 }
		
		//.out.println("JobPosterJoinJobPostingDAO -> insertIntoJobPosterJobPostingJoinTable" + userId );
		//.out.println(jobId);
	    String insertQuuery = "INSERT INTO job_poster_job_posting_join_table(job_poster_id,job_id) VALUES(?,?)" ;
      
	    try {
	           PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
		           pst.setInt(1,userId);
		           pst.setInt(2,jobId);
 	           return  pst.executeUpdate()!=0 ; 	           	           
       } 
      catch (SQLException ex) {	      
   	   System.out.println("Inserting job posting cause exception,mate.");
   	   System.out.println(ex.toString());
       }
       return false ; 
	}
}
