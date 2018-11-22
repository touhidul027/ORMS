package jobs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.generalDAO.JDBCUtil;



public class GetAllJobsDAO {
	public static ArrayList<Job> getAllJob(int recruiterId) {	
		
		ArrayList<Job> allJob = new ArrayList<>() ;
		 
		 // select all the job id 
		
			 Connection conn = JDBCUtil.getConnection() ; 
				
				String signInQuery = "SELECT * FROM job_poster_job_posting_join_table WHERE job_poster_id=?" ; 
				ResultSet rs = null ; 
	 			try {
			        PreparedStatement pst =  conn.prepareStatement(signInQuery) ; 
			           pst.setInt(1, recruiterId);
			           rs = pst.executeQuery() ; 
			           
			        	   
			        	 while(rs.next()) {
			        		//System.out.println("job id " +rs.getInt("job_id") );
			        		 // create a object that hold a single job information 
			        		 Job job = new Job() ; 
			        		 
			        		 // now select all the available values from the job posting table 
			        		 job = JobDAO.getJob(rs.getInt("job_id")) ; 
			        		 
			        		// let us check we got everything  or not
			        		// System.out.println(Job);
			        		 
			        		 
			        		 allJob.add(job) ; 			        		 
			        	 }
			        	 return allJob ; 
			        	 
	 		           
			       } 
			       catch (SQLException ex) 
			       {
			    	  // System.out.println("SignInDAO catch block");
			       }
	 	
		return null ; 
	}
}
