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
import com.jobSeekerDAO.JobSeekerActivity;
 
/**
 * Servlet implementation class ProfileCreationJobSeekerActivityServlet
 */
@WebServlet("/ProfileCreationJobSeekerActivityServlet")
public class ProfileCreationJobSeekerActivityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileCreationJobSeekerActivityServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("activities received . ");
		
		// get the skills list and set it to the bean 
		String[] jobSeekerActivityLists = request.getParameterValues("jobSeekerActivityLists") ; 
		JobSeekerActivity jobSeekerActivity = new JobSeekerActivity(jobSeekerActivityLists) ; 
				
				 
		System.out.println(jobSeekerActivity);
		
		HttpSession session = request.getSession(); 	
		session.setAttribute("jobSeekerActivityObj", jobSeekerActivity);
		session.setAttribute("nextPageName", "profileCreationJobSeekerInterest.jsp");
		response.sendRedirect("jobSeeker\\jobSeekerProfileCreationSeries.jsp");
	}
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// get the skills list and set it to the bean 
		String[] jobSeekerActivityLists = request.getParameterValues("jobSeekerActivityLists") ; 
		ArrayList<String> activities = new ArrayList<String>( Arrays.asList(jobSeekerActivityLists)) ; 		
				 		
		HttpSession session = request.getSession(); 	
		JobSeeker jobSeeker = (JobSeeker) session.getAttribute("jobSeeker") ; 		 
		jobSeeker.setActivities(activities);
 		session.setAttribute("jobSeeker", jobSeeker);
 		
		session.setAttribute("nextPageName", "profileCreationJobSeekerInterest.jsp");
		response.sendRedirect("jobSeeker\\jobSeekerProfileCreationSeries.jsp");
	}

}
