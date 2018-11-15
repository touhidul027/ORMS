package jobPostingServlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.generalDAO.BasicUser;

import jobPostingDAO.JobPosterJoinJobPostingDAO;
import jobPostingDAO.JobPostingAboutJob;
import jobPostingDAO.JobPostingDAO;
import jobPostingDAO.JobPostingGeneralObj;

/**
 * Servlet implementation class JobPostingAboutJobServlet
 */
@WebServlet("/JobPostingAboutJobServlet")
public class JobPostingAboutJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// grab the form data , in case of unfilled up form we  null value 
		String jobPostingJobTitle = request.getParameter("jobPostingJobTitle").trim() ; 
		String jobPostingCompanyName = request.getParameter("jobPostingCompanyName").trim() ; 
		String jobPostingJobLocation = request.getParameter("jobPostingJobLocation").trim() ; 
		String jobPostingJobDescription = request.getParameter("jobPostingJobDescription").trim() ; 
		String[] jobPosterKeySkillsSelection = request.getParameterValues("jobPosterKeySkillsSelection"); 

		// make the general model object 
				JobPostingGeneralObj jobPostingGeneralObj = new JobPostingGeneralObj() ; 
				jobPostingGeneralObj.setJobPostingJobTitle(jobPostingJobTitle);
				jobPostingGeneralObj.setJobPostingCompanyName(jobPostingCompanyName);
				jobPostingGeneralObj.setJobPostingJobLocation(jobPostingJobLocation);
				jobPostingGeneralObj.setJobPostingJobDescription(jobPostingJobDescription);
				jobPostingGeneralObj.setJobPosterKeySkillsSelection(jobPosterKeySkillsSelection);
				
				// insert and update the database , get back the updated object
				jobPostingGeneralObj = JobPostingDAO.insertAboutJob(jobPostingGeneralObj) ; 
				
				
				
				
				System.out.println(jobPostingGeneralObj.getJobId());
		HttpSession session = request.getSession(); 		 
		session.setAttribute("jobPostingGeneralObj", jobPostingGeneralObj);
		session.setAttribute("nextPageName", "jobPostingEmployeeInfo.jsp");
		
		// update  the join table
		
		BasicUser basicUser = (BasicUser) session.getAttribute("aJobPoster") ; 
		JobPosterJoinJobPostingDAO.insertIntoJobPosterJobPostingJoinTable(basicUser.getUserSerial(),jobPostingGeneralObj.getJobId()) ; 
		response.sendRedirect("jobPoster\\jobPostingSeries.jsp");
	}

}
