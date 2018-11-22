package jobPostingServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jobPostingDAO.JobPostingCompanyInfo;
import jobPostingDAO.JobPostingCompanyInfoDAO;
import jobPostingDAO.JobPostingGeneralObj;
import jobs.Job;

/**
 * Servlet implementation class JobPostingCompanyInfo
 */
@WebServlet("/JobPostingCompanyInfoServlet")
public class JobPostingCompanyInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String jobPostingCompanyAdress = request.getParameter("jobPostingCompanyAdress") ; 
		String jobPostingCompanyEmail= request.getParameter("jobPostingCompanyEmail" ) ; 
		String jobPostingCompanyCellPhoneNumber= request.getParameter("jobPostingCompanyCellPhoneNumber" ) ; 
		String jobPostingCompanyWebsite= request.getParameter( "jobPostingCompanyWebsite") ; 
		
		HttpSession session = request.getSession() ; 
		
		// get the general job posting object holding all the necessary information 		
		// get the model object 
		JobPostingGeneralObj jobPostingGeneralObj = (JobPostingGeneralObj) session.getAttribute("jobPostingGeneralObj") ; 
		jobPostingGeneralObj.setJobPostingCompanyAdress(jobPostingCompanyAdress);
		jobPostingGeneralObj.setJobPostingCompanyEmail(jobPostingCompanyEmail);
		jobPostingGeneralObj.setJobPostingCompanyCellPhoneNumber(jobPostingCompanyCellPhoneNumber);
		jobPostingGeneralObj.setJobPostingCompanyWebsite(jobPostingCompanyWebsite);
		
		// update the database 
		JobPostingCompanyInfoDAO.insertCompanyInfo(jobPostingGeneralObj);
		
		session.setAttribute("jobPostingGeneralObj", jobPostingGeneralObj);
		session.setAttribute("nextPageName", "jobPostingOverview.jsp");
		response.sendRedirect("jobPoster\\jobPostingSeries.jsp");
	}
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String companyAddress = request.getParameter("jobPostingCompanyAdress") ; 
		String companyEmail= request.getParameter("jobPostingCompanyEmail" ) ; 
		String companyCellPhoneNumber= request.getParameter("jobPostingCompanyCellPhoneNumber" ) ; 
		String website= request.getParameter( "jobPostingCompanyWebsite") ; 
		
		HttpSession session = request.getSession() ; 
		
		// get the general job posting object holding all the necessary information 		
		// get the model object 
		Job job = (Job) session.getAttribute("job") ; 
		job.setCompanyAddress(companyAddress);
		job.setCompanyEmail(companyEmail);
		job.setCompanyCellPhoneNumber(companyCellPhoneNumber);
		job.setWebsite(website);				
		
		session.setAttribute("job", job);
		response.sendRedirect("recruiter\\jobOverView.jsp");
		//System.out.println(job);
	}

}
