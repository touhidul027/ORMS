package admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AllowJobPostServlet
 */
@WebServlet("/AllowJobPostServlet")
public class AllowJobPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int jobId = Integer.parseInt(request.getParameter("jobId")) ; 
		AdminDAO.allowJobPost(jobId);
		response.sendRedirect("admin\\manageJob.jsp");
	}

}
