package com.generalServlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.generalDAO.BasicUser;
import com.generalDAO.JDBCUtil;
import com.generalDAO.SignUpDAO;
import com.jobSeekerDAO.JobSeeker;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email") ; 
		String fullName = request.getParameter("fullName") ; 
		String password = request.getParameter("password") ; 
		String userType= request.getParameter("userType") ; 
			
		// validate it more with java regular expression 
		
		// create object 
		BasicUser basicUser = new BasicUser(1,fullName,email,userType,password) ; 
		boolean flag = false;
		try {
			flag = SignUpDAO.registerAUser(basicUser);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(flag==true) {
			request.getSession().setAttribute("loginAfterSignUp", "You have sucessfully Signed up.Login to continue");
			response.sendRedirect("signIn.jsp");
		}else {
			System.out.println("Not Working");
		}
		System.out.println("Sign up servlet");
	}

}
