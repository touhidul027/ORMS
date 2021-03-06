package com.jobSeekerServlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jobSeekerDAO.JobSeeker;
import com.jobSeekerDAO.JobSeekerEducation;

/**
 * Servlet implementation class ProfileCreationJobSeekerEducationServlet
 */
@WebServlet("/ProfileCreationJobSeekerEducationServlet")
public class ProfileCreationJobSeekerEducationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileCreationJobSeekerEducationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("3rd page is coming,experience");
		
		// get the form value and create the bean 
		String jobSeekerEducationLevel = request.getParameter("jobSeekerEducationLevel") ; 
		String jobSeekerEducationalInstituition=request.getParameter("jobSeekerEducationalInstituition") ; 
		String jobSeekerEducationalDepartment=request.getParameter("jobSeekerEducationalDepartment") ; 
		String jobSeekerEducationalDuration=request.getParameter("jobSeekerEducationalDuration") ; 
		
		JobSeekerEducation jobSeekerEducation =
				new JobSeekerEducation(jobSeekerEducationLevel,jobSeekerEducationalInstituition,jobSeekerEducationalDepartment,jobSeekerEducationalDuration) ; 

		
		ArrayList<JobSeekerEducation> education = new ArrayList<>() ; 
				education.add(jobSeekerEducation) ; 
		
		HttpSession session = request.getSession(); 
		JobSeeker jobSeeker = (JobSeeker) session.getAttribute("jobSeeker") ; 
		jobSeeker.setEducation(education);
		session.setAttribute("jobSeeker", jobSeeker);
 		session.setAttribute("nextPageName", "profileCreationJobSeekerExperience.jsp");
		response.sendRedirect("jobSeeker\\jobSeekerProfileCreationSeries.jsp");
	}
}
