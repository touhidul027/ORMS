package com.generalServlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.generalDAO.SearchJobs;

import jobPostingDAO.JobPostingGeneralObj;

@WebServlet("/SearchJobsServlet")
public class SearchJobsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jobTitle = request.getParameter("jobTitle") ;    
		String location = request.getParameter("location") ; 
		
		 ArrayList<JobPostingGeneralObj> jobsForApply = SearchJobs.searchs(jobTitle, location)  ;
		 HttpSession session= request.getSession() ; 
		 // System.out.println(jobsForApply);
		 session.setAttribute("jobsForApply", jobsForApply);
		 response.sendRedirect("jobSummary.jsp");
	}
}
