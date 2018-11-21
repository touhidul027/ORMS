package com.jobSeekerServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jobSeekerDAO.ApplyJobDAO;

import jobPostingDAO.JobPostingGeneralObj;

/**
 * Servlet implementation class ApplyJobServlet
 */
@WebServlet("/ApplyJobServlet")
public class ApplyJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		
		int jobId = Integer.parseInt(request.getParameter("jobId")); 
		int jobSeekerId = Integer.parseInt(request.getParameter("jobSeekerId")) ;
		int expectedSalary = Integer.parseInt(request.getParameter("expectedSalary")) ; 
		
		ApplyJobDAO.doApply(jobId, jobSeekerId, expectedSalary);
		
 		
		
	}

} 
