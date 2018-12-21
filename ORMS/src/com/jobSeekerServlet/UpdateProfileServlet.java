package com.jobSeekerServlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jobSeekerDAO.JobSeeker;
import com.jobSeekerDAO.JobSeekerDAO;
import com.jobSeekerDAO.JobSeekerEducation;
import com.jobSeekerDAO.JobSeekerExperience;
import com.jobSeekerDAO.JobSeekerGetProfileInfo;

/**
 * Servlet implementation class UpdateProfileServlet
 */
@WebServlet("/UpdateProfileServlet")
public class UpdateProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(); 		
		
		String cellPhoneNumber=request.getParameter("cellPhoneNumber") ; 
		String adress=request.getParameter("address") ; 
		String nid=request.getParameter("nidNumber") ; 
		String gender=request.getParameter("gender") ; 
		
		ArrayList<String> cellPhoneNumbers = new ArrayList<>() ;   
		cellPhoneNumbers.add(cellPhoneNumber) ; 
				  
		
		JobSeeker jobSeeker = (JobSeeker) session.getAttribute("jobSeeker") ; 
		jobSeeker.setCellPhoneNumber(cellPhoneNumbers);
		jobSeeker.setAdress(adress);
		jobSeeker.setNid(nid);
		jobSeeker.setGender(gender);
		
		// get the form value and create the bean 
				String jobSeekerEducationLevel = request.getParameter("jobSeekerEducationLevel") ; 
				String jobSeekerEducationalInstituition=request.getParameter("jobSeekerEducationalInstituition") ; 
				String jobSeekerEducationalDepartment=request.getParameter("jobSeekerEducationalDepartment") ; 
				String jobSeekerEducationalDuration=request.getParameter("jobSeekerEducationalDuration") ; 
				
				JobSeekerEducation jobSeekerEducation =
						new JobSeekerEducation(jobSeekerEducationLevel,jobSeekerEducationalInstituition,jobSeekerEducationalDepartment,jobSeekerEducationalDuration) ; 

				
				ArrayList<JobSeekerEducation> education = new ArrayList<>() ; 
				if(jobSeekerEducationalInstituition != null || jobSeekerEducationalInstituition.isEmpty()==false ) {
					
				}
						education.add(jobSeekerEducation) ; 
				
		jobSeeker.setEducation(education);
		
		
		// Experience part  
				String jobSeekerOrganizationName= request.getParameter("jobSeekerOrganizationName") ; 
				String jobSeekerDesignation= request.getParameter("jobSeekerDesignation") ; 
				String jobSeekerEmploymentDuration= request.getParameter("jobSeekerEmploymentDuration") ; 
				String jobSeekerProjectName= request.getParameter("jobSeekerProjectName") ; 
		 		
				JobSeekerExperience jobSeekerExperience = new JobSeekerExperience(jobSeekerOrganizationName, jobSeekerDesignation, jobSeekerEmploymentDuration, jobSeekerProjectName) ; 
				
		 		ArrayList<JobSeekerExperience> experience = new ArrayList<>() ; 
		 		   if(jobSeekerOrganizationName != null || jobSeekerOrganizationName.isEmpty()==false) {
		 			  experience.add(jobSeekerExperience) ; 
		 		   }
		 		
				// get the session and add the bean to the session
		 		jobSeeker.setExperience(experience);
				
		 // skills 	
		 		ArrayList<String> skills =null ; 
		 		String[] jobSeekerSkillsList = request.getParameterValues("jobSeekerSkillsList") ; 	
		 		
		 		if( jobSeekerSkillsList!=null && jobSeekerSkillsList.length != 0) {
		 			skills = new ArrayList<String>(Arrays.asList(jobSeekerSkillsList))   ; 
		 		} 				
 				jobSeeker.setSkills(skills); 
 				
		// activities	 			
 				String[] jobSeekerActivityLists = request.getParameterValues("jobSeekerActivityLists") ; 
 				ArrayList<String> activities =null ; 		
 				if(jobSeekerActivityLists != null && jobSeekerActivityLists.length != 0) {
 					activities = new ArrayList<String>( Arrays.asList(jobSeekerActivityLists)) ;
 				}
 				jobSeeker.setActivities(activities);
 		 		
 		 // interests 
 				String[] jobSeekerInterestsList = request.getParameterValues("jobSeekerInterestsList") ; 
 			    ArrayList<String> interests = null ;  	
 			    if(jobSeekerInterestsList!=null && jobSeekerInterestsList.length!=0) {
 			    	interests = new ArrayList<String>( Arrays.asList(jobSeekerInterestsList));
 			    }
 			      
 				jobSeeker.setInterests(interests);
 				
 		// summary 
 				String objective = request.getParameter("jobSeekerSummary") ; 		 
 				jobSeeker.setObjective(objective);
 				
 				JobSeekerDAO.upDateProfile(jobSeeker);
 				jobSeeker = JobSeekerGetProfileInfo.getJobSeeker(jobSeeker) ; 
				
 		        session.setAttribute("jobSeeker", jobSeeker);
 		        
 		        response.sendRedirect("jobSeeker/profileOverview.jsp");
 		
	}

}
