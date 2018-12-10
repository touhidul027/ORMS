package com.jobSeekerServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jobs.JobDAO;

/**
 * Servlet implementation class ConfirmSaveJobServlet
 */
@WebServlet("/ConfirmSaveJobServlet")
public class ConfirmSaveJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmSaveJobServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
  	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int jobId = Integer.parseInt(request.getParameter("jobId")) ; 
		int jobSeekerId = Integer.parseInt(request.getParameter("jobSeekerId")) ; 
		String note = request.getParameter("note") ; 
		
		JobDAO.saveJob(jobId, jobSeekerId, note);
		response.sendRedirect("jobSeeker\\jobSeekerStartPage.jsp");
	}

}
