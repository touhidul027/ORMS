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
import recruiter.ApplicantNotificationDAO;
import recruiter.Recruiter;

/**
 * Servlet implementation class NotifyJobSeekerDecisionServlet
 */
@WebServlet("/NotifyJobSeekerDecisionServlet")
public class NotifyJobSeekerDecisionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NotifyJobSeekerDecisionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//It will save job and jobSeeker object in the session ,so that the recruiter can see his details and send invitation
		
		int jobId = Integer.parseInt(request.getParameter("jobId").trim()) ; 
		int jobSeekerId =Integer.parseInt(request.getParameter("jobSeekerId").trim())  ; 
		
		HttpSession session = request.getSession() ;
		Recruiter recruiter = (Recruiter) session.getAttribute("recruiter") ; 
		
		// set the job in the session 
		for(Job job : recruiter.getJobs()) {
			if(job.getJobId() == jobId ) {
				session.setAttribute("job", job);
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
		
		// now update the notification status cause he already seen the message 
		// next time he will not see ths applicant notification 
		ApplicantNotificationDAO.updateNotification(jobId, jobSeekerId);
		 
		// update the recruiter applicant updated notifications 
		recruiter.setApplicantNotifications(ApplicantNotificationDAO.getNotifications(recruiter.getJobs()));
		// send redirect to a specific page
		response.sendRedirect("recruiter\\NotifyJobSeekerDecision.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
