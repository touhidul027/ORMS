package jobPostingServlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

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
import jobs.Job;

/**
 * Servlet implementation class JobPostingAboutJobServlet
 */
@WebServlet("/JobPostingAboutJobServlet")
public class JobPostingAboutJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/*// make the general model object 
				JobPostingGeneralObj jobPostingGeneralObj = new JobPostingGeneralObj() ; 
				jobPostingGeneralObj.setJobPostingJobTitle(jobPostingJobTitle);
				jobPostingGeneralObj.setJobPostingCompanyName(jobPostingCompanyName);
				jobPostingGeneralObj.setJobPostingJobLocation(jobPostingJobLocation);
				jobPostingGeneralObj.setJobPostingJobDescription(jobPostingJobDescription);
				jobPostingGeneralObj.setJobPosterKeySkillsSelection(jobPosterKeySkillsSelection);
				
				// insert and update the database , get back the updated object
				jobPostingGeneralObj = JobPostingDAO.insertAboutJob(jobPostingGeneralObj) ; 
	 * System.out.println(jobPostingGeneralObj.getJobId());
		HttpSession session = request.getSession(); 		 
		session.setAttribute("jobPostingGeneralObj", jobPostingGeneralObj);
		session.setAttribute("nextPageName", "jobPostingEmployeeInfo.jsp");
		
		// update  the join table
		
		BasicUser basicUser = (BasicUser) session.getAttribute("aJobPoster") ; 
		JobPosterJoinJobPostingDAO.insertIntoJobPosterJobPostingJoinTable(basicUser.getUserSerial(),jobPostingGeneralObj.getJobId()) ; 
		response.sendRedirect("jobPoster\\jobPostingSeries.jsp");
	 * 
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// grab the form data , in case of unfilled up form we  null value 
		String title = request.getParameter("jobPostingJobTitle").trim() ; 
		String companyName = request.getParameter("jobPostingCompanyName").trim() ; 
		String location = request.getParameter("jobPostingJobLocation").trim() ; 
		String description = request.getParameter("jobPostingJobDescription").trim() ; 
		String[] skillsGot = request.getParameterValues("jobPosterKeySkillsSelection"); 
		ArrayList<String> skills = null ; 
		if(skillsGot!=null && skillsGot. length!=0)
		  skills = new ArrayList<String>(Arrays.asList(skillsGot))   ; 

		/*
		     
		*/		
				
		// make the Job Object 
	    Job job = new Job() ; 
	    job.setTitle(title);
	    job.setCompanyName(companyName);
	    job.setLocation(location);
	    job.setDescription(description);
		job.setSkills(skills);
		
		// put the job object into the session 
 		HttpSession session = request.getSession(); 		 
		session.setAttribute("job", job);
		
		session.setAttribute("nextPageName", "jobPostingEmployeeInfo.jsp");
		response.sendRedirect("recruiter\\jobPostingSeries.jsp");
	}

}
