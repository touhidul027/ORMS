package jobPostingServlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.generalDAO.BasicUser;

import jobPostingDAO.AllJobPostingGeneralObj;
import jobPostingDAO.AllJobPostingGeneralObjDAO;
import jobPostingDAO.JobPostingGeneralObj;
import jobs.GetAllJobsDAO;
import jobs.Job;
import recruiter.Recruiter;

/**
 * Servlet implementation class JobPostingGetAllPostedJobs
 */
@WebServlet("/JobPostingGetAllPostedJobsServlet")
public class JobPostingGetAllPostedJobsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JobPostingGetAllPostedJobsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(); 
		// check the session is old or not -> do it later 
		if(session!=null) {
		BasicUser basicUser = (BasicUser) session.getAttribute("aJobPoster") ;
		
			if(basicUser==null) {
				request.setAttribute("loginInformation", "Job Posting Information");
				request.setAttribute("missingThing", "Account Existencity");
				request.setAttribute("loginInformationMissingThingmessage", "create a new recruiter account or Sign in old account to post a job.");
				// forward to a error page 
				response.sendRedirect("error404.jsp");
			}
			else {
				// get the initialized object holding all the information job posted  by him 		
				//System.out.println("I am executing");
				ArrayList<JobPostingGeneralObj> allPostedJobArrayListOfTypeJobPostingGeneralObj ;//= new  ArrayList<>() ;
				allPostedJobArrayListOfTypeJobPostingGeneralObj = AllJobPostingGeneralObjDAO.getAllJobPostingGeneralObj(basicUser.getUserSerial()) ; 			   
				
				session.setAttribute("allPostedJobs", allPostedJobArrayListOfTypeJobPostingGeneralObj);
			    response.sendRedirect("jobPoster\\jobPosterAllPostedJob.jsp");
			}
		}else {
			request.setAttribute("loginInformation", "Job Posting Information");
			request.setAttribute("missingThing", "Account Existencity");
			request.setAttribute("loginInformationMissingThingmessage", "create a new recruiter account or Sign in old account to post a job.");
			// forward to a error page 
			response.sendRedirect("error404.jsp");
		}
	}
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(); 
		// check the session is old or not -> do it later 
		if(session!=null) {
			Recruiter recruiter = (Recruiter) session.getAttribute("recruiter") ;
		
			if(recruiter==null) {
				request.setAttribute("loginInformation", "Job Posting Information");
				request.setAttribute("missingThing", "Account Existencity");
				request.setAttribute("loginInformationMissingThingmessage", "create a new recruiter account or Sign in old account to post a job.");
				// forward to a error page 
				response.sendRedirect("error404.jsp");
			}
			else {
				// get the initialized object holding all the information job posted  by him 		
				//System.out.println("I am executing");
				ArrayList<Job> postedJobs = GetAllJobsDAO.getAllJob(recruiter.getId()) ; ; 							   
				recruiter.setJobs(postedJobs);
				session.setAttribute("recruiter", recruiter);
			    response.sendRedirect("recruiter\\jobPosterAllPostedJob.jsp");
			}
		}else {
			request.setAttribute("loginInformation", "Job Posting Information");
			request.setAttribute("missingThing", "Account Existencity");
			request.setAttribute("loginInformationMissingThingmessage", "create a new recruiter account or Sign in old account to post a job.");
			// forward to a error page 
			response.sendRedirect("error404.jsp");
		}
	}

}
