package jobPostingServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jobPostingDAO.JobPostingBenefits;
import jobPostingDAO.JobPostingBenefitsDAO;
import jobPostingDAO.JobPostingGeneralObj;

/**
 * Servlet implementation class JobPostingBenefits
 */
@WebServlet("/JobPostingBenefits")
public class JobPostingBenefitsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// get all the values 
	String jobPostingSalary = request.getParameter("jobPostingSalary") ; 
	String jobPostingSalaryReview = request.getParameter("jobPostingSalaryReview") ; 
	String[] jobPostingFacilities = request.getParameterValues("jobPostingFacilities") ; 
	

	
	HttpSession session = request.getSession(); 		  
	// get the general model object 
	JobPostingGeneralObj jobPostingGeneralObj = (JobPostingGeneralObj) session.getAttribute("jobPostingGeneralObj") ; 
	// set the new property  
	jobPostingGeneralObj.setJobPostingSalary(jobPostingSalaryReview);
	jobPostingGeneralObj.setJobPostingSalaryReview(jobPostingSalaryReview);
	jobPostingGeneralObj.setJobPostingFacilities(jobPostingFacilities);
	
	// create a object and save data to database 
	JobPostingBenefitsDAO.insertBenefits(jobPostingGeneralObj);
	
	// save it to session 
	session.setAttribute("jobPostingGeneralObj", jobPostingGeneralObj );
		
			session.setAttribute("nextPageName", "jobPostingAdditionalRequirements.jsp");
			response.sendRedirect("jobPoster\\jobPostingSeries.jsp");
		}

}
