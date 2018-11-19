package com.jobSeekerServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.generalDAO.BasicUser;
import com.jobSeekerDAO.JobSeeker;
import com.jobSeekerDAO.JobSeekerActivity;
import com.jobSeekerDAO.JobSeekerEducation;
import com.jobSeekerDAO.JobSeekerExperience;
import com.jobSeekerDAO.JobSeekerInterests;
import com.jobSeekerDAO.JobSeekerPersonalInfo;
import com.jobSeekerDAO.JobSeekerProfileConfirmationDAO;
import com.jobSeekerDAO.JobSeekerSkills;
import com.jobSeekerDAO.JobSeekerSummary;
import com.jobSeekerDAO.ProfileCreationDAO;

/**
 * Servlet implementation class ProfileCreationConfirmServlet
 */
@WebServlet("/ProfileCreationConfirmServlet")
public class ProfileCreationConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;       
	/**
	 * HttpSession session = 	request.getSession() ; 
		// get all the object attribute and assign it to it's corresponding object
		JobSeekerActivity jobSeekerActivityObj =  (JobSeekerActivity) session.getAttribute("jobSeekerActivityObj") ; 	
		JobSeekerEducation jobSeekerEducationObj = (JobSeekerEducation) session.getAttribute("jobSeekerEducationObj") ; 
		JobSeekerExperience jobSeekerExperienceObj = (JobSeekerExperience) session.getAttribute("jobSeekerExperienceObj") ; 
		JobSeekerInterests jobSeekerInterestsObj = (JobSeekerInterests) session.getAttribute("jobSeekerInterestsObj") ; 
		JobSeekerPersonalInfo jobSeekerPersonalInfoObj = (JobSeekerPersonalInfo) session.getAttribute("jobSeekerPersonalInfoObj") ; 
		JobSeekerSkills jobSeekerSkillsObj = (JobSeekerSkills) session.getAttribute("jobSeekerSkillsObj") ;
		JobSeekerSummary jobSeekerSummaryObj = (JobSeekerSummary) session.getAttribute("jobSeekerSummaryObj") ; 
		BasicUser basicUserObj = (BasicUser) session.getAttribute("aJobSeeker") ; 
		/*
		// print to make sure everything is OK
			System.out.println(jobSeekerExperienceObj);
			System.out.println(jobSeekerEducationObj);
			System.out.println(jobSeekerActivityObj);
			System.out.println(jobSeekerInterestsObj);
			System.out.println(jobSeekerPersonalInfoObj);
			System.out.println(jobSeekerSummaryObj);
		*/
		
 		/*
		// one by one save it to data base  
		//
		JobSeekerProfileConfirmationDAO.insertPersonalInfo(jobSeekerPersonalInfoObj, basicUserObj) ; 
		JobSeekerProfileConfirmationDAO.insertExperienceInfo(jobSeekerExperienceObj, basicUserObj) ; 
		JobSeekerProfileConfirmationDAO.insertEuducationInfo(jobSeekerEducationObj, basicUserObj) ; 
		JobSeekerProfileConfirmationDAO.insertSkills(jobSeekerSkillsObj, basicUserObj) ; 
		JobSeekerProfileConfirmationDAO.insertActivities(jobSeekerActivityObj, basicUserObj) ; 
		JobSeekerProfileConfirmationDAO.insertInterests(jobSeekerInterestsObj, basicUserObj) ; 
		JobSeekerProfileConfirmationDAO.insertSummary(jobSeekerSummaryObj, basicUserObj) ; 
	
		// if everything is ok send it to the profile page 
		response.sendRedirect("jobSeeker\\jobSeekerStartPage.jsp");
		*/
	/* 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	  HttpSession session = request.getSession() ; 
	  JobSeeker jobSeeker = (JobSeeker) session.getAttribute("jobSeeker") ; 
		System.out.println(jobSeeker);
	  ProfileCreationDAO.createJobSeekerProfile(jobSeeker);
	  response.sendRedirect("jobSeeker\\jobSeekerStartPage.jsp");
	}

}
