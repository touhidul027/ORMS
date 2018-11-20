package com.generalServlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jobPostingDAO.JobPostingGeneralObj;

/**
 * Servlet implementation class JobDesCriptionForApply
 */
@WebServlet("/JobDesCriptionForApply")
public class JobDesCriptionForApply extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			//System.out.println(request.getParameter("jobId"));
		 int jobId = Integer.parseInt(request.getParameter("jobId")) ; 
		 
		 HttpSession session = request.getSession() ; 
		 ArrayList<JobPostingGeneralObj> jobsForApply = (ArrayList<JobPostingGeneralObj>) session.getAttribute("jobsForApply") ; 
		 
		 for(JobPostingGeneralObj job:jobsForApply) {
			 if(job.getJobId()==jobId) {
				 session.setAttribute("singleJobDescriptionForApply", job);
				// System.out.println(job);
				 break ; 
			 }
		 }
		 
		 response.sendRedirect("jobDescriptionForApply.jsp");
	}

}
