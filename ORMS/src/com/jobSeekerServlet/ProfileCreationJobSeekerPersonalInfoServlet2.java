package com.jobSeekerServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jobSeekerDAO.JobSeekerPersonalInfo;

/**
 * Servlet implementation class ProfileCreationJobSeekerPersonalInfoServlet2
 */
@WebServlet("/ProfileCreationJobSeekerPersonalInfoServlet2")
public class ProfileCreationJobSeekerPersonalInfoServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileCreationJobSeekerPersonalInfoServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("get personal Info ");
				String jobSeekerCellPhoneNumber=request.getParameter("cellPhoneNumber") ; 
				String jobSeekerAddress=request.getParameter("address") ; 
				String jobSeekerNid=request.getParameter("nidNumber") ; 
				String jobSeekerGender=request.getParameter("gender") ; 
				
				//create related DAO object  
				JobSeekerPersonalInfo jobSeekerPersonalInfoObj = new JobSeekerPersonalInfo(jobSeekerGender,jobSeekerCellPhoneNumber,jobSeekerNid,jobSeekerAddress) ; 
				
				HttpSession session = request.getSession(); 		  
				session.setAttribute("jobSeekerPersonalInfoObj", jobSeekerPersonalInfoObj );		
				
				session.setAttribute("nextPageName", "profileCreationJobSeekerEducation.jsp");
				response.sendRedirect("jobSeeker\\jobSeekerProfileCreationSeries.jsp");
	}

}
