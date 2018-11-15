package com.jobSeekerServlet;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.generalDAO.JDBCUtil;
import com.generalDAO.User;
import com.jobSeekerDAO.JobSeekerSummary;

/**
 * Servlet implementation class ProfileCreationJobSeekerSummaryServlet
 */
@MultipartConfig
@WebServlet("/ProfileCreationJobSeekerSummaryServlet")
public class ProfileCreationJobSeekerSummaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileCreationJobSeekerSummaryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
 		
		String jobSeekerSummary = request.getParameter("jobSeekerSummary") ; 
		 
		JobSeekerSummary jobSeekerSummaryObj = new JobSeekerSummary(jobSeekerSummary) ; 
		System.out.println(jobSeekerSummary);
		HttpSession session = request.getSession() ; 
		session.setAttribute("jobSeekerSummaryObj", jobSeekerSummaryObj);
		response.sendRedirect("jobSeeker\\profileCreationJobSeekerProfileOverview.jsp");
	}

}
