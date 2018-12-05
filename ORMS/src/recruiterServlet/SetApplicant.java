package recruiterServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jobSeekerDAO.JobSeeker;

import jobs.Job;
import recruiter.Recruiter;

/**
 * Servlet implementation class SetApplicant
 */
@WebServlet("/SetApplicant")
public class SetApplicant extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int jobId = Integer.parseInt(request.getParameter("jobId").trim()) ; 
		int jobSeekerId =Integer.parseInt(request.getParameter("jobSeekerId").trim())  ; 
		
		HttpSession session = request.getSession() ;
		Recruiter recruiter = (Recruiter) session.getAttribute("recruiter") ; 
		
		// set the job in the session 
		for(Job job : recruiter.getJobs()) {
			if(job.getJobId() == jobId ) {
				//session.setAttribute("job", job);
				// now this has the particular jobSeeker 
				for(JobSeeker jobSeeker : job.getApplicants()) {
					if(jobSeeker.getId()==jobSeekerId) {
						session.setAttribute("jobSeeker", jobSeeker);
						//System.out.println(jobSeeker.getId());
						break ;  
					}
				}
				//System.out.println(jobId);
			break ; 
			}		
		}
		response.sendRedirect("recruiter\\jobStatistics.jsp");
		
	}

}
