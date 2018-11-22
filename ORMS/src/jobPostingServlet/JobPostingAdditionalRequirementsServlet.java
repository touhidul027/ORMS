package jobPostingServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jobPostingDAO.JobPostingAdditionalRequirements;
import jobPostingDAO.JobPostingAdditionalRequirementsDAO;
import jobPostingDAO.JobPostingGeneralObj;
import jobs.Job;

/**
 * Servlet implementation class JobPostingAdditionalRequirements
 */
@WebServlet("/JobPostingAdditionalRequirements")
public class JobPostingAdditionalRequirementsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		String jobPostingAdditionalRequirementsinput = request.getParameter("jobPostingAdditionalRequirementsinput") ; 
		 
		// get the model object 
		JobPostingGeneralObj jobPostingGeneralObj = (JobPostingGeneralObj) session.getAttribute("jobPostingGeneralObj") ; 
		jobPostingGeneralObj.setJobPostingAdditionalRequirementsinput(jobPostingAdditionalRequirementsinput);
		
		//update the data base 
		JobPostingAdditionalRequirementsDAO.insertBenefits(jobPostingGeneralObj);
		
		session.setAttribute("jobPostingGeneralObj", jobPostingGeneralObj );
		session.setAttribute("nextPageName", "jobPostingCompanyInfo.jsp");
		response.sendRedirect("jobPoster\\jobPostingSeries.jsp");
 	}
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		String additionalRequirement = request.getParameter("jobPostingAdditionalRequirementsinput") ; 
		 
		// get the model object 
		Job job = (Job) session.getAttribute("job") ; 
		job.setAdditionalRequirement(additionalRequirement);		 
		
		session.setAttribute("job", job );
		session.setAttribute("nextPageName", "jobPostingCompanyInfo.jsp");
		response.sendRedirect("recruiter\\jobPostingSeries.jsp");
 	}

}
