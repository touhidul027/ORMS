package jobs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.generalDAO.JDBCUtil;



public class JobDAO {
	
	// it will return a job information  matching with jobId
	public static Job getJob(int jobId) {
		Job job = new Job() ; 
		
		Connection conn = JDBCUtil.getConnection() ; 
		
		String signInQuery = "SELECT * FROM jobs WHERE job_id=?" ; 
		ResultSet rs = null ; 
			try {
	        PreparedStatement pst =  conn.prepareStatement(signInQuery) ; 
	           pst.setInt(1, jobId);
	           rs = pst.executeQuery() ; 
	           
	        	   
	        	 if(rs.next()) {
	        		// System.out.println(rs.getString("job_title"));
	        		// get all the information

	        		 job.setJobId(jobId);
	        		 job.setAdditionalRequirement(rs.getString("additional_requirements"));
	        		 job.setCompanyName(rs.getString("company_name"));
	        		 job.setTitle(rs.getString("job_title"));
	        		 job.setLocation(rs.getString("location"));
	        		 job.setDescription(rs.getString("description"));
	        		 job.setEducationLevel(rs.getString("education_level"));
	        		 job.setExperience(rs.getString("experience"));
	        		 job.setSalary(rs.getString("salary"));
	        		 
	        		 Job.setJobPostingSalary();
	        		 Job.setJobPostingSalaryReview(rs.getString("salary_review"));
	        		 Job.setJobPostingAdditionalRequirementsinput();
	        		 Job.setJobPostingCompanyEmail(rs.getString("company_email"));
	        		 Job.setJobPostingCompanyCellPhoneNumber(rs.getString("company_cell_phone_number")) ; 
	        		 Job.setJobPostingCompanyAdress(rs.getString("adress"));
	        		 Job.setJobPostingCompanyWebsite(rs.getString("company_website"));
	        		
	        		 ArrayList<String> skillNames = getAllSkills(jobId) ;        		 
	        		 String[] skillNames2 = new String[skillNames.size()];
	        		 skillNames2 = skillNames.toArray(skillNames2);
	         		 Job.setJobPosterKeySkillsSelection(skillNames2);
	         		 
	         		ArrayList<String> jobTypesNames = getTypes(jobId) ;  ;        		 
	       	     	String[] jobTypesNames2 = new String[jobTypesNames.size()];
	       	        jobTypesNames2 = jobTypesNames.toArray(jobTypesNames2);
	       	        Job.setJobPostingJobType(jobTypesNames2);
	         		 
	         		ArrayList<String> benefitsNames = getAllJobBenefits(jobId) ;  ;        		 
	       	     	String[] benefitsNames2 = new String[benefitsNames.size()];
	       	     	benefitsNames2 = benefitsNames.toArray(benefitsNames2);
	          		Job.setJobPostingFacilities(benefitsNames2); 
	         		
	          		
	        		// System.out.println(Job);//ok
	      		 
	        		 return  Job ; 
	        	 }
	       } 
	       catch (SQLException ex) 
	       {
	    	   System.out.println("SignInDAO catch block");
	       }
			return Job ; 
	}
	
	private static ArrayList<String> getTypes(int jobId) {
		// TODO Auto-generated method stub
	Connection conn = JDBCUtil.getConnection() ; 
		
		String signInQuery = "SELECT * FROM job_types WHERE job_type_id IN(SELECT job_type_id FROM job_posting_job_types_join_table WHERE job_id=?)" ; 
		ResultSet rs = null ; 
		ArrayList<String> jobTypesNames = new ArrayList<>() ; 
		
		int i=0 ; 
	        PreparedStatement pst;
			try {
				pst = conn.prepareStatement(signInQuery);
				pst.setInt(1, jobId);
		        rs = pst.executeQuery() ; 
		     
		        while(rs.next()) {
		        	jobTypesNames.add(rs.getString("job_type_name")) ; 
		        }
		        
				return jobTypesNames ; 	 

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				//System.out.println("Exception mate");
				e.printStackTrace();
			}
			return jobTypesNames; 
	}


	private static  ArrayList<String> getAllJobBenefits(int jobId) {
		// TODO Auto-generated method stub
	Connection conn = JDBCUtil.getConnection() ; 
		
		String signInQuery = "SELECT * FROM job_benefits WHERE benefit_id IN(SELECT benefit_id FROM job_posting_job_benefits_join_table WHERE job_id=?)" ; 
		ResultSet rs = null ; 
		ArrayList<String> benefitsNames = new ArrayList<>() ; 
		
		int i=0 ; 
	        PreparedStatement pst;
			try {
				pst = conn.prepareStatement(signInQuery);
				pst.setInt(1, jobId);
		        rs = pst.executeQuery() ; 
		     
		        while(rs.next()) {
		        	benefitsNames.add(rs.getString("benefit_name")) ; 
		        }
		        // System.out.println(benefitsNames);
				return benefitsNames ; 	 

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				//System.out.println("Exception mate");
				e.printStackTrace();
			}
			return benefitsNames;        	   
	}


	private static ArrayList<String> getAllSkills(int jobId) {
		// TODO Auto-generated method stub
	Connection conn = JDBCUtil.getConnection() ; 
		
		String signInQuery = "SELECT * FROM job_skills WHERE skill_id IN(SELECT skill_id FROM job_posting_job_skills_join_table WHERE job_id=?)" ; 
		ResultSet rs = null ; 
		ArrayList<String> skillNames = new ArrayList<>() ; 
		
		int i=0 ; 
	        PreparedStatement pst;
			try {
				pst = conn.prepareStatement(signInQuery);
				pst.setInt(1, jobId);
		        rs = pst.executeQuery() ; 
		     
		        while(rs.next()) {
		        	skillNames.add(rs.getString("skill_name")) ; 
		        }
		        
				return skillNames ; 	 

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				//System.out.println("Exception mate");
				e.printStackTrace();
			}
			return skillNames;        	   
	}
}