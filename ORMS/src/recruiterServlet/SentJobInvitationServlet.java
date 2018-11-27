package recruiterServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import recruiter.Recruiter;

/**
 * Servlet implementation class SentJobInvitationServlet
 */
@WebServlet("/SentJobInvitationServlet")
public class SentJobInvitationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SentJobInvitationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int jobId = Integer.parseInt(request.getParameter("jobId").trim()) ; 
		int jobSeekerId =Integer.parseInt(request.getParameter("jobSeekerId").trim())  ; 
		
		HttpSession session = request.getSession() ;
		Recruiter recruiter = (Recruiter) session.getAttribute("recruiter") ; 
		
		int recruiterId = recruiter.getId() ; 
		response.sendRedirect("recruiter\\SendJobInvitation.jsp");
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
