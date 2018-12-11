package company;

import java.io.IOException;
import java.util.Stack;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jobSeekerDAO.JobSeeker;
import com.jobSeekerDAO.JobSeekerGetProfileInfo;

/**
 * Servlet implementation class FollowServlet
 */
@WebServlet("/FollowServlet")
public class FollowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FollowServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession() ; 
		JobSeeker jobSeeker = (JobSeeker) session.getAttribute("jobSeeker") ; 
		
		// create stack of page 
		Stack<String> pagesStack =(Stack<String>) session.getAttribute("pagesStack") ; 
		if(pagesStack==null) {
			pagesStack = new Stack<>() ; 
		}
		
		pagesStack.push("company/company.jsp") ; 
		
		String msg="Sign in to follow the company" ;
		
		// job seeker is  logged in		
		if(jobSeeker == null) {
			session.setAttribute("pagesStack", pagesStack);
			session.setAttribute("msg", msg);
			response.sendRedirect("signIn.jsp");
		}else {			
			int jobSeekerId= Integer.parseInt(request.getParameter("jobSeekerId")) ; 
			int companyId= Integer.parseInt(request.getParameter("companyId")) ; 
			CompanyDAO.follow(companyId, jobSeekerId);
			jobSeeker=JobSeekerGetProfileInfo.getJobSeeker(jobSeeker);
			response.sendRedirect("company/company.jsp");
		}
	}

}
