package recruiterServlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jobs.Job;

/**
 * Servlet implementation class RecruiterController
 */
public class RecruiterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		
		// first get destination path 
		String action = request.getServletPath() ; 
		
		// call to for right action 
		switch(action) {
			case "/PostJob" :  
				try {
					postJob(request,response) ;
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				break ;
				
			case "/Delete" : 
				  break ; 
		}
		
	}

	private void postJob(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// perform logic operation for posting a job 
		// get all the information associatd with posting a job

		// about job :- grab the form data , in case of unfilled up form we  null value 
						String title = request.getParameter("title").trim() ; 
						String companyName = request.getParameter("companyName").trim() ; 
						String location = request.getParameter("location").trim() ; 
						String description = request.getParameter("description").trim() ; 
						String skills = request.getParameter("skills"); 
		 		
				// employment 
						String educationLevel = request.getParameter("educationLevel") ; 
						String experience = request.getParameter("experience") ; 
						String[] jobTypeGot = request.getParameterValues("jobTypes") ; 
						ArrayList<String> jobTypes = null ;
						
						if(jobTypeGot!=null && jobTypeGot.length!=0)
							jobTypes = new ArrayList<String>(Arrays.asList(jobTypeGot))   ; 
						
				//Compenation and Benefits
						String salary = request.getParameter("salary") ; 
						String salaryReview = request.getParameter("salaryReview") ; 
						String[] jobPostingFacilities = request.getParameterValues("facilities") ; 	 
						ArrayList<String> facilities=null ; 
						
						if(jobPostingFacilities!=null && jobPostingFacilities.length!=0) {
							facilities = new ArrayList<String>(Arrays.asList(jobPostingFacilities))   ; 
						}
						
				// company information 
						String companyAddress = request.getParameter("companyAdress") ; 
						String companyEmail= request.getParameter("email" ) ; 
						String companyCellPhoneNumber= request.getParameter("cell" ) ; 
						String website= request.getParameter( "website") ; 

						
				// make the Job Object 
					    Job job = new Job() ; 
					    job.setTitle(title);
					    job.setCompanyName(companyName);
					    job.setLocation(location);
					    job.setDescription(description);
						job.setSkills(skills);
						
						job.setEducationLevel(educationLevel);
						job.setExperience(experience);
						job.setJobType(jobTypes);	
						
						job.setSalary(salary);
						job.setSalaryReview(salaryReview);
						job.setFacilities(facilities);
						
						
						job.setCompanyAddress(companyAddress);
						job.setCompanyEmail(companyEmail);
						job.setCompanyCellPhoneNumber(companyCellPhoneNumber);
						job.setWebsite(website);		
						
				 // put the job object into the session 
				 		HttpSession session = request.getSession(); 		 
						session.setAttribute("job", job);
								 		
				response.sendRedirect("recruiter/overview.jsp");
	}

}
