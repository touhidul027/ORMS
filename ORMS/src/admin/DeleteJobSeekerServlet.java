package admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.generalDAO.JDBCUtil;

/**
 * Servlet implementation class DeleteJobSeekerServlet
 */
@WebServlet("/DeleteJobSeekerServlet")
public class DeleteJobSeekerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int jobSeekerId = Integer.parseInt(request.getParameter("jobSeekerId")) ; 
		Connection conn=  JDBCUtil.getConnection() ; 
// insert into common table 
 
	        try {	        
 	        conn.prepareStatement("DELETE FROM sign_up WHERE user_serial="+jobSeekerId).executeUpdate() ;       
	        conn.prepareStatement("DELETE FROM education WHERE  user_id="+jobSeekerId).executeUpdate() ;       
	        conn.prepareStatement("DELETE FROM job_seeker  WHERE id="+jobSeekerId).executeUpdate() ;       
	        conn.prepareStatement("DELETE FROM activities WHERE user_id="+jobSeekerId).executeUpdate() ;       
	        conn.prepareStatement("DELETE FROM cell_phone WHERE user_id="+jobSeekerId).executeUpdate() ;       
	        conn.prepareStatement("DELETE FROM cell_phone WHERE user_id="+jobSeekerId).executeUpdate() ;       
	        conn.prepareStatement("DELETE FROM company_followers WHERE follower_id ="+jobSeekerId).executeUpdate() ;       
	        conn.prepareStatement("DELETE FROM experiences WHERE id="+jobSeekerId).executeUpdate() ;       
	        conn.prepareStatement("DELETE FROM interests WHERE user_id ="+jobSeekerId).executeUpdate() ;       
	        conn.prepareStatement("DELETE FROM jobs_application WHERE job_seeker_id="+jobSeekerId).executeUpdate() ;       
	        conn.prepareStatement("DELETE FROM job_post_notifications WHERE follower_id="+jobSeekerId).executeUpdate() ;       
	        conn.prepareStatement("DELETE FROM reviews WHERE  reviewer_id="+jobSeekerId).executeUpdate() ;       
	        conn.prepareStatement("DELETE FROM save_jobs WHERE  job_seeker_id="+jobSeekerId).executeUpdate() ;       
	        conn.prepareStatement("DELETE FROM job_posting_job_skills_join_table WHERE job_id="+jobSeekerId).executeUpdate() ;       
	        }catch(Exception e) {
	        }
	        response.sendRedirect("admin/manageJobSeeker.jsp");
 	}// end method 

}
