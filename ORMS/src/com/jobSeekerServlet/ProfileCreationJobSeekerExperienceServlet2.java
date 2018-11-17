package com.jobSeekerServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jobSeekerDAO.JobSeekerExperience;

/**
 * Servlet implementation class ProfileCreationJobSeekerExperienceServlet2
 */
@WebServlet("/ProfileCreationJobSeekerExperienceServlet2")
public class ProfileCreationJobSeekerExperienceServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileCreationJobSeekerExperienceServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String jobSeekerOrganizationName= request.getParameter("jobSeekerOrganizationName") ; 
		String jobSeekerDesignation= request.getParameter("jobSeekerDesignation") ; 
		String jobSeekerEmploymentDuration= request.getParameter("jobSeekerEmploymentDuration") ; 
		String jobSeekerProjectName= request.getParameter("jobSeekerProjectName") ; 
 		JobSeekerExperience jobSeekerExperience = new JobSeekerExperience(jobSeekerOrganizationName, jobSeekerDesignation, jobSeekerEmploymentDuration, jobSeekerProjectName) ; 
		
		// get the session and add the bean to the session
 		HttpSession session = request.getSession(); 
 		session.setAttribute("jobSeekerExperienceObj", jobSeekerExperience);
 		
		session.setAttribute("nextPageName", "profileCreationJobSeekerSkills.jsp");
		response.sendRedirect("jobSeeker\\jobSeekerProfileCreationSeries.jsp");
 	}

}
