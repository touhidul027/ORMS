package company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.generalDAO.BasicUser;
import com.generalDAO.JDBCUtil;

import jobs.GetAllJobsDAO;
import jobs.Job;
import recruiter.ApplicantNotificationDAO;
import recruiter.InvitedApplicantDAO;
import recruiter.Recruiter;

public class CompanyDAO {

 // this method will return all the company list 
	public static  ArrayList<Company> allCompanies() {
		 Connection conn = JDBCUtil.getConnection() ; 
		 ArrayList<Company> companies = new ArrayList<>() ; 
 	  	
			String selectQuery = "SELECT company_id FROM companies" ; 
			ResultSet rs = null ; 
	 		try {
		        PreparedStatement pst =  conn.prepareStatement(selectQuery) ; 
 	 	           rs = pst.executeQuery() ; 
		           while(rs.next()) {		        	   
		        	  companies.add( getCompany( rs.getInt("company_id") )) ;  
		           }
	 		}catch(Exception e) {
	 			
	 		}
	 		return companies ; 
	}
	
	
 public static void sentNotification(int companyId,int jobId) {
	 // get the all followers 
	 Connection conn=  JDBCUtil.getConnection() ; 
	 String insertQuery="INSERT INTO job_post_notifications(company_id,job_id,follower_id,has_seen) \r\n" + 
	 		"SELECT ?,?, follower_id,0 FROM company_followers WHERE company_followers.company_id=?" ; 
	       
		   try {			   
		      PreparedStatement pst =  conn.prepareStatement(insertQuery) ; 
		      		pst.setInt(1, companyId);
			        pst.setInt(2, jobId);
 			        pst.setInt(3, companyId);
 			        
			        pst.executeUpdate() ; 
		   }catch(Exception e) {
			  System.out.println(e.toString());
		   }
 }	
 public static Company getCompany(int companyId) {
	 // select all the properties of a company 
	 Connection conn = JDBCUtil.getConnection() ; 
  	 Company company = new Company() ; 
  	
		String selectQuery = "SELECT * FROM companies WHERE company_id=? LIMIT 1" ; 
		ResultSet rs = null ; 
 		try {
	        PreparedStatement pst =  conn.prepareStatement(selectQuery) ; 
	           pst.setInt(1, companyId);
 	           rs = pst.executeQuery() ; 
	           if(rs.next()) {
	        	  // System.out.println("rs.next()");
	        	   company.setCompany_id(companyId);
	        	   company.setCompanyName(rs.getString("company_name"));
 	        	   company.setFounded(rs.getString("founded") );
 	        	   company.setIndustryType(rs.getString("industry_type") );
 	        	   company.setSize( rs.getInt("size"));	        	  
 	        	   company.setHeadQuarter(rs.getString("head_quarter"));
 	        	   company.setRecruiters(getRecruiters(companyId));  ; 
 	        	   company.setReviews(getReviews(companyId));
	           }
	       } 
	       catch (Exception e)
		{
	    }
 		// System.out.println(company.getCompanyName());
 		return company ; 
}// end method 
 
 public static ArrayList<Recruiter> getRecruiters(int companyId) {
		Connection conn = JDBCUtil.getConnection() ; 
	 	ArrayList<Recruiter> recruiters = new ArrayList<>() ; 
			String selectQuery = "SELECT recruiter_id FROM recruiters WHERE company_id=?" ; 
			ResultSet rs = null ; 
			try {
		        PreparedStatement pst =  conn.prepareStatement(selectQuery) ; 
		           pst.setInt(1, companyId);
		           rs = pst.executeQuery() ; 
		           while(rs.next()) {
		        	   
		        	   int recruiterId = rs.getInt("recruiter_id") ; 
		        	//  System.out.println(recruiterId + "A" );

		        	// create the recruiter obj 
						Recruiter recruiter = new Recruiter() ; 
						
						// get the initialized object holding all the information job posted  by him 		
						ArrayList<Job> postedJobs = GetAllJobsDAO.getAllJob(1,recruiterId) ; 							   
						recruiter.setJobs(postedJobs);
 				recruiters.add(recruiter) ;						 											
		           }
				}catch(Exception e) {				
				}
	 return recruiters ; 
	}
 
// this method will return reviews 
private static ArrayList<Review> getReviews(int companyId) {	
	Connection conn = JDBCUtil.getConnection() ; 
	ArrayList<Review> reviews = new ArrayList<Review>() ;  
		
 	String selectQuery = "SELECT * FROM reviews WHERE company_id=?" ; 
		ResultSet rs = null ; 
		try {
	        PreparedStatement pst =  conn.prepareStatement(selectQuery) ; 
	           pst.setInt(1, companyId);
	           rs = pst.executeQuery() ; 
	           while(rs.next()) {
 	        	    Review review = new Review(); 
 	        	    review.setReview_title(rs.getString("review_title"));
 	        	    review.setRecommend(rs.getInt("recommend"));
 	        	    review.setOutlook(rs.getString("outlook"));
 	        	    review.setPros(rs.getString("pros"));
 	        	    review.setCons(rs.getString("cons"));
 	        	    review.setAdvice(rs.getString("advice"));
 	        	    review.setRating(rs.getFloat("rating"));
 	        	    reviews.add(review) ; 
	           }
		}catch(Exception e) {
			
		}
	return reviews;
}// end method

	// followers registry in the company
	public static void follow(int companyId,int jobSeekerId) {
		Connection conn=  JDBCUtil.getConnection() ; 
		String insertQuuery = "INSERT INTO company_followers(company_id,follower_id) VALUES(?,?)" ;
	       try {
	       PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
	          pst.setInt(1, companyId);
	          pst.setInt(2, jobSeekerId);
	         
	          pst.executeUpdate() ; 	          
	}catch(Exception e) {
		
	}
	}// end method
}