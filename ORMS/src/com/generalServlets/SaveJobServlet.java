package com.generalServlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jobSeekerDAO.JobSeeker;

import jobs.Job;

/**
 * Servlet implementation class SaveJobServlet
 */
@WebServlet("/SaveJobServlet")
public class SaveJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveJobServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int jobId = Integer.parseInt(request.getParameter("jobId")) ; 
		
		HttpSession session = request.getSession() ; 
		JobSeeker jobSeeker = (JobSeeker) session.getAttribute("jobSeeker") ; 
		
		ArrayList<Job> jobs = (ArrayList<Job>) session.getAttribute("jobsForApply") ; 
		
		// create stack of page 
				Stack<String> pagesStack =(Stack<String>) session.getAttribute("pagesStack") ; 
				if(pagesStack==null) {
					pagesStack = new Stack<>() ; 
				}				
				pagesStack.push("jobSeeker/saveJob.jsp") ; 
				session.setAttribute("pagesStack", pagesStack);
				session.setAttribute("msg", "In order to save a job you need to log in first.");
		
 		for(Job job:jobs) {
			 if(job.getJobId()==jobId) {
				 session.setAttribute("job", job);
 				// System.out.println(job);
				 break ; 
			 }
		 }		
		
		if(jobSeeker==null) {
			response.sendRedirect("signIn.jsp");
		}else {
			response.sendRedirect("jobSeeker\\saveJob.jsp");
		}
	}

}
