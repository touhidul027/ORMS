package com.jobSeekerServlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jobSeekerDAO.JobSeeker;
import com.jobSeekerDAO.JobSeekerExperience;

/**
 * Servlet implementation class ProfileCreationJobSeekerExperienceServlet
 */
@WebServlet("/ProfileCreationJobSeekerExperienceServlet")
public class ProfileCreationJobSeekerExperienceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// get the fields parameter and then create a bean 
		String jobSeekerOrganizationName= request.getParameter("jobSeekerOrganizationName") ; 
		String jobSeekerDesignation= request.getParameter("jobSeekerDesignation") ; 
		String jobSeekerEmploymentDuration= request.getParameter("jobSeekerEmploymentDuration") ; 
		String jobSeekerProjectName= request.getParameter("jobSeekerProjectName") ; 
 		
		JobSeekerExperience jobSeekerExperience = new JobSeekerExperience(jobSeekerOrganizationName, jobSeekerDesignation, jobSeekerEmploymentDuration, jobSeekerProjectName) ; 
		
 		ArrayList<JobSeekerExperience> experience = new ArrayList<>() ; 
 		   experience.add(jobSeekerExperience) ; 
 		
		// get the session and add the bean to the session
 		HttpSession session = request.getSession(); 
 		JobSeeker jobSeeker = (JobSeeker) session.getAttribute("jobSeeker") ; 		 
 		jobSeeker.setExperience(experience);
 		
 		session.setAttribute("jobSeeker", jobSeeker);
		session.setAttribute("nextPageName", "profileCreationJobSeekerSkills.jsp");
		response.sendRedirect("jobSeeker\\jobSeekerProfileCreationSeries.jsp");
		
		
	}

}
