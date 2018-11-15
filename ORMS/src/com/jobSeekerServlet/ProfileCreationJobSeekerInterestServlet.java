package com.jobSeekerServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jobSeekerDAO.JobSeekerInterests;

/**
 * Servlet implementation class ProfileCreationJobSeekerInterestServlet
 */
@WebServlet("/ProfileCreationJobSeekerInterestServlet")
public class ProfileCreationJobSeekerInterestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileCreationJobSeekerInterestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// get the skills list and set it to the bean 
				String[] jobSeekerInterestsList = request.getParameterValues("jobSeekerInterestsList") ; 
				JobSeekerInterests jobSeekerInterests = new JobSeekerInterests(jobSeekerInterestsList) ; 
		
				System.out.println(jobSeekerInterests);
				
		HttpSession session = request.getSession(); 	
		session.setAttribute("jobSeekerInterestsObj", jobSeekerInterests);
		session.setAttribute("nextPageName", "profileCreationJobSeekerSummary.jsp");
		response.sendRedirect("jobSeeker\\jobSeekerProfileCreationSeries.jsp");
		
	}
}
