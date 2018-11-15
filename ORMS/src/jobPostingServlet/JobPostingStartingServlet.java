package jobPostingServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.generalDAO.BasicUser;

/**
 * Servlet implementation class JobPostingStartingServlet
 */
@WebServlet("/JobPostingStartingServlet")
public class JobPostingStartingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JobPostingStartingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Yes buddy you r in right path.");
		
		HttpSession session = request.getSession(); 		  
		BasicUser basicUser = (BasicUser) session.getAttribute("aJobPoster") ; 
		
		// user is logged in ,now in home,so he can now post a job directly 
		// so check if the session is over or not
		if(basicUser==null) {
			response.sendRedirect("jobPostError.jsp");
		}
		else {
		session.setAttribute("nextPageName", "jobPostingAboutJob.jsp");
		response.sendRedirect("jobPoster\\jobPostingSeries.jsp");
		}
	}

}
