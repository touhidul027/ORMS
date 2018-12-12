package com.generalServlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Stack;

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
import com.jobSeekerDAO.JobSeekerDAO;
import com.jobSeekerDAO.JobSeekerGetProfileInfo;
import com.jobSeekerDAO.RecruiterNotificationDAO;

import jobs.GetAllJobsDAO;
import jobs.Job;
import recruiter.ApplicantNotificationDAO;
import recruiter.InvitedApplicantDAO;
import recruiter.Recruiter;
import recruiter.RecruiterDAO;

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
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response) ; 
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
				userSession.removeAttribute("loginMsgSaveJob");
				
				JobSeeker jobSeeker = new JobSeeker(aBasicUser.getUserSerial(),aBasicUser.getFullName(),aBasicUser.getEmail(),aBasicUser.getPassword()) ;  ; 							
				request.removeAttribute("loginError");
				
				// now get the all the information 
				jobSeeker = JobSeekerGetProfileInfo.getJobSeeker(jobSeeker) ; 
				
				
				// get the job notifications and set it  
				//jobSeeker.setRecruiterNotificaions( RecruiterNotificationDAO.getNotifications(jobSeeker.getId(), jobSeeker.getAppliedJobs() ));
				//System.out.println(jobSeeker.getRecruiterNotificaions());
				
				
				// update the session
				userSession.setAttribute("jobSeeker", jobSeeker );
				
				// conditional forward,if have any
				String nextPage=(String) userSession.getAttribute("nextPage") ; 
				
				// this is updated one 
				Stack<String> pagesStack =  (Stack<String>) userSession.getAttribute("pagesStack") ; 
				String next = null ; 
				
				if(pagesStack!=null && pagesStack.isEmpty()==false) {
					next = pagesStack.pop() ;
				}
				
				if(next!=null && next.isEmpty()==false) {
					response.sendRedirect(next);
				}
				else if(nextPage!=null && nextPage.isEmpty()==false) {
					userSession.removeAttribute("nextPage");
					response.sendRedirect(nextPage);
				}else {				
 				 response.sendRedirect("jobSeeker\\jobSeekerStartPage.jsp");
				}
			}
			else if(aBasicUser.getUserType().equals("employeer")){
				// create the recruiter obj 
				Recruiter recruiter = new Recruiter(aBasicUser.getUserSerial(),aBasicUser.getFullName(),aBasicUser.getEmail(),aBasicUser.getPassword(),aBasicUser.getUserType()) ; 
				
				recruiter=RecruiterDAO.getProfile(recruiter);
				//System.out.println("go to dashboard.buddy");
				userSession.setAttribute("recruiter", recruiter );
				response.sendRedirect("recruiter\\recruiterDashBoard.jsp") ;				
			}
			
		}else if( userStatus == User.forgettableUser) {
			response.sendRedirect("signInError.jsp");
		}else {
			response.sendRedirect("suggestSignUp.jsp");
		}
		
		
		// System.out.println("I am here,in sign in servlet.");
	}

}
