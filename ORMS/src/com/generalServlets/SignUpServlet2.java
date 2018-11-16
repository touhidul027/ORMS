package com.generalServlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.generalDAO.BasicUser;
import com.generalDAO.SignUpDAO;

/**
 * Servlet implementation class SignUpServlet2
 */
@WebServlet("/SignUpServlet2")
public class SignUpServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

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
		BasicUser basicUser = new BasicUser(1,fullName,email,password,userType) ; 
		boolean flag = false;
		try {
			flag = SignUpDAO.registerAUser(basicUser);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(flag==true) {
			response.sendRedirect("signIn.jsp");
		}
		System.out.println("Sign up servlet");
}

}
