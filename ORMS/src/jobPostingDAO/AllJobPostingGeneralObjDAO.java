package jobPostingDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.generalDAO.BasicUser;
import com.generalDAO.JDBCUtil;

public class AllJobPostingGeneralObjDAO {
	
//	public static void getSingleJobPostingGeneralO
	
public static ArrayList<JobPostingGeneralObj> getAllJobPostingGeneralObj(int jobPosterSerialNumber) {	
	
	ArrayList<JobPostingGeneralObj> allJobPostingGeneralObj = new ArrayList<>() ;
	 
	 // select all the job id 
	
		 Connection conn = JDBCUtil.getConnection() ; 
			
			String signInQuery = "SELECT * FROM job_poster_job_posting_join_table WHERE job_poster_id=?" ; 
			ResultSet rs = null ; 
 			try {
		        PreparedStatement pst =  conn.prepareStatement(signInQuery) ; 
		           pst.setInt(1, jobPosterSerialNumber);
		           rs = pst.executeQuery() ; 
		           
		        	   
		        	 while(rs.next()) {
		        		//System.out.println("job id " +rs.getInt("job_id") );
		        		 // create a object that hold a single job information 
		        		 JobPostingGeneralObj jobPostingGeneralObj = new JobPostingGeneralObj() ; 
		        		 
		        		 // now select all the available values from the job posting table 
		        		 jobPostingGeneralObj =  getAJobPostingGeneralObj(rs.getInt("job_id")) ;
		        		 
		        		// let us check we got everything  or not
		        		// System.out.println(jobPostingGeneralObj);
		        		 
		        		 
		        		 allJobPostingGeneralObj.add(jobPostingGeneralObj) ; 
		        		 
		        	 }
		        	 return allJobPostingGeneralObj ; 
		        	 
 		           
		       } 
		       catch (SQLException ex) 
		       {
		    	   System.out.println("SignInDAO catch block");
		       }
 	
	 
	
	return null ; 
}

public static JobPostingGeneralObj getAJobPostingGeneralObj(int jobId) {
	JobPostingGeneralObj jobPostingGeneralObj = new JobPostingGeneralObj() ; 
	Connection conn = JDBCUtil.getConnection() ; 
	
	String signInQuery = "SELECT * FROM job_posting WHERE job_id=?" ; 
	ResultSet rs = null ; 
		try {
        PreparedStatement pst =  conn.prepareStatement(signInQuery) ; 
           pst.setInt(1, jobId);
           rs = pst.executeQuery() ; 
           
        	   
        	 if(rs.next()) {
        		// System.out.println(rs.getString("job_title"));
        		// get all the information

        		 jobPostingGeneralObj.setJobId(jobId);
        		 jobPostingGeneralObj.setJobPostingCompanyName(rs.getString("company_name"));
        		 jobPostingGeneralObj.setJobPostingJobTitle(rs.getString("job_title"));
        		 jobPostingGeneralObj.setJobPostingJobLocation(rs.getString("job_location"));
        		 jobPostingGeneralObj.setJobPostingJobDescription(rs.getString("job_description"));
        		 jobPostingGeneralObj.setJobPostingEmployeeEducationLevel(rs.getString("education_level"));
        		 jobPostingGeneralObj.setJobPostingEmployeeExperience(rs.getString("experience"));
        		 jobPostingGeneralObj.setJobPostingSalary(rs.getString("salary"));
        		 jobPostingGeneralObj.setJobPostingSalaryReview(rs.getString("salary_review"));
        		 jobPostingGeneralObj.setJobPostingAdditionalRequirementsinput(rs.getString("additional_requirements"));
        		 jobPostingGeneralObj.setJobPostingCompanyEmail(rs.getString("company_email"));
        		 jobPostingGeneralObj.setJobPostingCompanyCellPhoneNumber(rs.getString("company_cell_phone_number")) ; 
        		 jobPostingGeneralObj.setJobPostingCompanyAdress(rs.getString("adress"));
        		 jobPostingGeneralObj.setJobPostingCompanyWebsite(rs.getString("company_website"));
        		
        		 ArrayList<String> skillNames = getAllSkills(jobId) ;        		 
        		 String[] skillNames2 = new String[skillNames.size()];
        		 skillNames2 = skillNames.toArray(skillNames2);
         		 jobPostingGeneralObj.setJobPosterKeySkillsSelection(skillNames2);
         		 
         		ArrayList<String> jobTypesNames = getAllJobTypes(jobId) ;  ;        		 
       	     	String[] jobTypesNames2 = new String[jobTypesNames.size()];
       	        jobTypesNames2 = jobTypesNames.toArray(jobTypesNames2);
       	        jobPostingGeneralObj.setJobPostingJobType(jobTypesNames2);
         		 
         		ArrayList<String> benefitsNames = getAllJobBenefits(jobId) ;  ;        		 
       	     	String[] benefitsNames2 = new String[benefitsNames.size()];
       	     	benefitsNames2 = benefitsNames.toArray(benefitsNames2);
          		jobPostingGeneralObj.setJobPostingFacilities(benefitsNames2); 
         		
          		
        		// System.out.println(jobPostingGeneralObj);//ok
      		 
        		 return  jobPostingGeneralObj ; 
        	 }
        	 
        	 
	           
       } 
       catch (SQLException ex) 
       {
    	   System.out.println("SignInDAO catch block");
       }
		return jobPostingGeneralObj ; 
}

private static ArrayList<String> getAllJobTypes(int jobId) {
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
