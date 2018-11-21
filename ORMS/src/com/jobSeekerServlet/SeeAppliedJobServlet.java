package com.jobSeekerServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jobSeekerDAO.JobSeeker;

import jobs.Job;

/**
 * Servlet implementation class SeeAppliedJobServlet
 */
@WebServlet("/SeeAppliedJobServlet")
public class SeeAppliedJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int jobId = Integer.parseInt(request.getParameter("jobId")) ; 
		System.out.println(jobId);
		// get the jobSeeker saving object 
		HttpSession session = request.getSession() ; 
		JobSeeker jobSeeker =  (JobSeeker) session.getAttribute("jobSeeker") ; 
		
		for(Job job:jobSeeker.getAppliedJobs()) {
			if(job.getJobId()==jobId) {
				session.setAttribute("singleJobDescriptionForApplied", job);				
			}
		}
		System.out.println("I am executing " + jobId);
		response.sendRedirect("jobSeeker\\seeAppliedJobDetails.jsp");
	}

}
