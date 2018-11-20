package com.generalServlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.generalDAO.BasicUser;
import com.generalDAO.SignInDAO;
import com.generalDAO.User;
import com.jobSeekerDAO.JobSeeker;
import com.jobSeekerDAO.JobSeekerGetProfileInfo;

/**
 * Servlet implementation class SignInServlet
 */
@WebServlet("/SignInServlet")
public class SignInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignInServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// get the paramater 
		String email = request.getParameter("email") ;
		String password = request.getParameter("password") ; 
		BasicUser aBasicUser = null ; 
		User userStatus = User.notAUser ; 
		
		try {
			userStatus = SignInDAO.isSignedUp(email, password) ;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
			//System.out.println("forward me to the profile page .");
		if(userStatus==User.smartUser) {			
			aBasicUser = SignInDAO.doSignIn(email, password) ; 		
			// store the information in the session
			HttpSession userSession = request.getSession() ;

			// depending on the type set attribute to the session 
			if(aBasicUser.getUserType().equals("jobSeeker")) {
				// first remove the conditional session 
				userSession.removeAttribute("messageForAppyJobWithoutSignIn");
				
				JobSeeker jobSeeker = new JobSeeker(aBasicUser.getUserSerial(),aBasicUser.getFullName(),aBasicUser.getEmail(),aBasicUser.getPassword()) ;  ; 							
				request.removeAttribute("loginError");
				
				// now get the all the information 
				jobSeeker = JobSeekerGetProfileInfo.getJobSeeker(jobSeeker) ; 
				userSession.setAttribute("jobSeeker", jobSeeker );
				
				// conditional forward,if have any
				String nextPage=(String) userSession.getAttribute("nextPage") ; 
				if(nextPage!=null && nextPage.isEmpty()==false) {
					userSession.removeAttribute("nextPage");
					response.sendRedirect(nextPage);
				}else {				
 				 response.sendRedirect("jobSeeker\\jobSeekerStartPage.jsp");
				}
			}
			else {
				userSession.setAttribute("aJobPoster", aBasicUser );
				response.sendRedirect("jobPoster\\jobPosterDashBoard.jsp") ;
			}
			
		}else if( userStatus == User.forgettableUser) {
			response.sendRedirect("signInError.jsp");
		}else {
			response.sendRedirect("suggestSignUp.jsp");
		}
		
		
		// System.out.println("I am here,in sign in servlet.");
	}

}
