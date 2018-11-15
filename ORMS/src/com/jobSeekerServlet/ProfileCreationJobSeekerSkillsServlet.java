package com.jobSeekerServlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jobSeekerDAO.JobSeekerSkills;

/**
 * Servlet implementation class ProfileCreationJobSeekerSkillsServlet
 */
@WebServlet("/ProfileCreationJobSeekerSkillsServlet")
public class ProfileCreationJobSeekerSkillsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("end");
		
		// get the skills list and set it to the bean 
		String[] jobSeekerSkillsList = request.getParameterValues("jobSeekerSkillsList") ; 
		JobSeekerSkills jobSeekerSkills = new JobSeekerSkills(jobSeekerSkillsList) ; 
		
		 
		System.out.println(jobSeekerSkills);
		
		HttpSession session = request.getSession(); 		  
		session.setAttribute("nextPageName", "profileCreationJobSeekerActivity.jsp");
		session.setAttribute("jobSeekerSkillsObj", jobSeekerSkills);
		response.sendRedirect("jobSeeker\\jobSeekerProfileCreationSeries.jsp");
	}

}
