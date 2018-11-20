package com.generalServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jobSeekerDAO.JobSeeker;

/**
 * Servlet implementation class ConditionCheckForApplyToJob
 */
@WebServlet("/ConditionCheckForApplyToJob")
public class ConditionCheckForApplyToJob extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// first check logged in or not 
		HttpSession session = request.getSession() ; 
		JobSeeker jobSeeker =(JobSeeker) session.getAttribute("jobSeeker");
		
		if( jobSeeker == null ) {
			
			// session to hold next page name for apply the job 
			String nextPage="jobSeeker/applyJob.jsp" ; 
			session.setAttribute("nextPage", nextPage);
			
			String messageForAppyJobWithoutSignIn = "To Apply A job You Need to Sign In First.";			
			session.setAttribute("messageForAppyJobWithoutSignIn", messageForAppyJobWithoutSignIn );
			
			// go to sign in for signing in 
			response.sendRedirect("signIn.jsp");
			
			
			
		}else {
	     	response.sendRedirect("jobSeeker/applyJob.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
