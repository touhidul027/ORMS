package recruiterServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import recruiter.ApplicantNotificationDAO;

/**
 * Servlet implementation class ConfirmInvitationServlet
 */
@WebServlet("/ConfirmInvitationServlet")
public class ConfirmInvitationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmInvitationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int jobId = Integer.parseInt(request.getParameter("jobId").trim()) ; 
			int jobSeekerId =Integer.parseInt(request.getParameter("jobSeekerId").trim())  ;
			String interviewTimePlace = request.getParameter("interviewTimePlace") ; 

			ApplicantNotificationDAO.confirmInvitation(jobId, jobSeekerId, interviewTimePlace);
			response.sendRedirect("recruiter\\recruiterDashBoard.jsp");
			}catch (Exception e) 
			{
				e.printStackTrace();
			}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
