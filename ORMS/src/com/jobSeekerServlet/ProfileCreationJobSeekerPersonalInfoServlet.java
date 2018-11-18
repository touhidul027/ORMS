package com.jobSeekerServlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.generalDAO.BasicUser;
import com.jobSeekerDAO.JobSeeker;
import com.jobSeekerDAO.JobSeekerPersonalInfo;

/**
 * Servlet implementation class profileCreationJobSeekerPersonalInfo
 */
@WebServlet("/ProfileCreationJobSeekerPersonalInfoServlet")
public class ProfileCreationJobSeekerPersonalInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileCreationJobSeekerPersonalInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// System.out.println("get personal Info ");
		String cellPhoneNumber=request.getParameter("cellPhoneNumber") ; 
		String adress=request.getParameter("address") ; 
		String nid=request.getParameter("nidNumber") ; 
		String gender=request.getParameter("gender") ; 
		
		ArrayList<String> cellPhoneNumbers = new ArrayList<>() ;   
		cellPhoneNumbers.add(cellPhoneNumber) ; 
		HttpSession session = request.getSession(); 		  
		
		JobSeeker jobSeeker = (JobSeeker) session.getAttribute("jobSeeker") ; 
		jobSeeker.setCellPhoneNumber(cellPhoneNumbers);
		jobSeeker.setAdress(adress);
		jobSeeker.setNid(nid);
		jobSeeker.setGender(gender);
		
		session.setAttribute("jobSeeker", jobSeeker);
		session.setAttribute("nextPageName", "profileCreationJobSeekerEducation.jsp");
		response.sendRedirect("jobSeeker\\jobSeekerProfileCreationSeries.jsp");
	}

}
