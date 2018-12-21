package com.jobSeekerServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class JobSeekerPersonalInfoServlet
 */
 @WebServlet("/ProfileCreationJobSeekerServlet")
public class ProfileCreationJobSeekerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("first call to personal info form");
		HttpSession session = request.getSession(); 		  
		session.setAttribute("nextPageName", "profileCreationJobSeekerPersonalInfo.jsp");
		response.sendRedirect("jobSeeker\\jobSeekerProfileCreationSeries.jsp");
		// 
	}
}
