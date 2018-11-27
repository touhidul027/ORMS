package jobs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.generalDAO.JDBCUtil;
import com.jobSeekerDAO.JobSeeker;
import com.jobSeekerDAO.JobSeekerGetProfileInfo;



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
			        		 
			        		 // get all the applicants it has 
			        		 job.setApplicants(getApplicants(job.getJobId()));
			        		
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
	
	private static ArrayList<JobSeeker> getApplicants(int jobId) {
		ArrayList<JobSeeker> jobSeekers = new ArrayList<>() ; 
		
		// get all the job_seeker_id first
		 Connection conn = JDBCUtil.getConnection() ; 
		 
			String selectJobSeekerQuery = "SELECT job_seeker_id FROM jobs_application WHERE job_id=?" ; 
			ResultSet rs = null ; 
			try {
		        PreparedStatement pst =  conn.prepareStatement(selectJobSeekerQuery) ; 
		           pst.setInt(1, jobId);
		           rs = pst.executeQuery() ; 		           
		        	   //System.out.print("Job seeker id ");
		        	 while(rs.next()) {
		        		 JobSeeker jobSeeker = new JobSeeker() ; 
		        		 jobSeeker.setId( rs.getInt("job_seeker_id"));
		        		 jobSeeker=JobSeekerGetProfileInfo.getJobSeeker(jobSeeker) ; 
		        		 jobSeekers.add(jobSeeker) ; 
		        	 }		        	 
		        } catch(Exception e) {
		        	System.out.println(e.toString());
		      }
			return jobSeekers;
	}
}
