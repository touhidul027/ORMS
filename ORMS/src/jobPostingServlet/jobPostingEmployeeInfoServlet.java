package jobPostingServlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jobPostingDAO.JobPostingEmployeeInfo;
import jobPostingDAO.JobPostingEmployeeInfoDAO;
import jobPostingDAO.JobPostingGeneralObj;
import jobs.Job;

/**
 * Servlet implementation class jobPostingEmployeeInfo
 */
@WebServlet("/jobPostingEmployeeInfo")
public class jobPostingEmployeeInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
/*
 * protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String jobPostingEmployeeEducationLevel = request.getParameter("jobPostingEmployeeEducationLevel") ; 
		String jobPostingEmployeeExperience = request.getParameter("jobPostingEmployeeExperience") ; 
		String[] jobPostingJobType = request.getParameterValues("jobPostingJobType") ; 

		
		HttpSession session = request.getSession();
		JobPostingGeneralObj jobPostingGeneralObj = (JobPostingGeneralObj) session.getAttribute("jobPostingGeneralObj") ; 
		//save the new data to the model obj 
		jobPostingGeneralObj.setJobPostingEmployeeEducationLevel(jobPostingEmployeeEducationLevel);
		jobPostingGeneralObj.setJobPostingEmployeeExperience(jobPostingEmployeeExperience);
		jobPostingGeneralObj.setJobPostingJobType(jobPostingJobType);
		
		// save the data to database 
		JobPostingEmployeeInfoDAO.insertEmployeeInfo(jobPostingGeneralObj);
		session.setAttribute("jobPostingGeneralObj", jobPostingGeneralObj ); 		  
		session.setAttribute("nextPageName", "jobPostingBenefits.jsp");
		response.sendRedirect("jobPoster\\jobPostingSeries.jsp");
	}
 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String educationLevel = request.getParameter("jobPostingEmployeeEducationLevel") ; 
		String experience = request.getParameter("jobPostingEmployeeExperience") ; 
		String[] jobTypeGot = request.getParameterValues("jobPostingJobType") ; 
		ArrayList<String> jobType = null ;
		
		if(jobTypeGot!=null && jobTypeGot.length!=0)
			jobType = new ArrayList<String>(Arrays.asList(jobTypeGot))   ; 

		
		HttpSession session = request.getSession();
		Job job = (Job) session.getAttribute("job") ; 
		
		//save the new data to the model obj 
 		job.setEducationLevel(educationLevel);
 		job.setExperience(experience);
 		job.setJobType(jobType);
		
 		
 		session.setAttribute("job", job ); 		  
		session.setAttribute("nextPageName", "jobPostingBenefits.jsp");
		response.sendRedirect("recruiter\\jobPostingSeries.jsp");
	}

}
