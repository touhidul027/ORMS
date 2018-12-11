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
import jobs.Job;
import jobs.JobDAO;

/**
 * Servlet implementation class JobDesCriptionForApply
 */
@WebServlet("/JobDesCriptionForApply")
public class JobDesCriptionForApplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			//System.out.println(request.getParameter("jobId"));
		 int jobId = Integer.parseInt(request.getParameter("jobId")) ; 
		 
		 // when the request will come from job seeker saved jobs then we have to get
		 // the job explicitly 
		 
		 
		 HttpSession session = request.getSession() ; 
		 ArrayList<Job> jobs = (ArrayList<Job>) session.getAttribute("jobsForApply") ; 
		 
		 if(jobs != null ) {
			 for(Job job:jobs) {
				 if(job.getJobId()==jobId) {
					 session.setAttribute("singleJobDescriptionForApply", job);
					// System.out.println(job);
					 break ; 
				 }
			 }
		 }else {
			 session.setAttribute("singleJobDescriptionForApply", JobDAO.getJob(jobId) );			 
		 }
		 
		
			 
		 response.sendRedirect("jobDescriptionForApply.jsp");
	}

}
