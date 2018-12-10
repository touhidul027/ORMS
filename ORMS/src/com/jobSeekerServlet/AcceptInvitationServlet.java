package com.jobSeekerServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jobSeekerDAO.JobSeeker;
import com.jobSeekerDAO.RecruiterNotification;
import com.jobSeekerDAO.RecruiterNotificationDAO;

/**
 * Servlet implementation class AcceptInvitationServlet
 */
@WebServlet("/AcceptInvitationServlet")
public class AcceptInvitationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
 		HttpSession session = request.getSession();
		JobSeeker jobSeeker = (JobSeeker) session.getAttribute("jobSeeker") ;
		int jobId = Integer.parseInt(request.getParameter("jobId"));
		
		// update the has seen table 
		RecruiterNotificationDAO.updateNotification(jobId, jobSeeker.getId());
		
		// get the job notifications and set it  
		jobSeeker.setRecruiterNotificaions( RecruiterNotificationDAO.getNotifications(jobSeeker.getId(), jobSeeker.getAppliedJobs() ));
		
		//now set the job details in a session 
		
		RecruiterNotification recruiterNotification= RecruiterNotificationDAO.getNotification(jobId,jobSeeker.getRecruiterNotificaions()) ; 
		session.setAttribute("recruiterNotification", recruiterNotification);
		response.sendRedirect("jobSeeker\\SeeInvitationDetails.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
