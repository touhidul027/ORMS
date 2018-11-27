package recruiterServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jobs.Job;
import recruiter.Recruiter;

/**
 * Servlet implementation class PostedJobsServlet
 */
@WebServlet("/PostedJobsServlet")
public class PostedJobsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	// will give us a job details from the session object
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        int jobId = Integer.parseInt(request.getParameter("jobId")) ; 		 
		 HttpSession session = request.getSession() ;
		Recruiter recruiter = (Recruiter) session.getAttribute("recruiter") ; 
 	
		for(Job job : recruiter.getJobs()) {
			if(job.getJobId() == jobId ) {
				session.setAttribute("job", job);
			break ; 
			}		
		}
		response.sendRedirect("recruiter\\postedJobDetails.jsp");
	}
}
