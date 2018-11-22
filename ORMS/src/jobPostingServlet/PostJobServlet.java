package jobPostingServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jobPostingDAO.JobPosterJoinJobPostingDAO;
import jobs.Job;
import jobs.JobPostingDAO2;
import recruiter.Recruiter;

/**
 * Servlet implementation class PostJobServlet
 */
@WebServlet("/PostJobServlet")
public class PostJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostJobServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession() ; 
		Job job = (Job) session.getAttribute("job") ; 
		Recruiter recruiter = (Recruiter) session.getAttribute("recruiter") ; 
		job = JobPostingDAO2.postJob(job) ; 
		
		JobPosterJoinJobPostingDAO.insertIntoJobPosterJobPostingJoinTable(recruiter.getId(), job.getJobId()) ; 		
		session.removeAttribute("job");
		response.sendRedirect("recruiter\\recruiterDashBoard.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
