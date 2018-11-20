package com.generalServlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.sql.* ; 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.generalDAO.JDBCUtil;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hello");
	   try {
		   java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
		  
		   
		    Connection conn= JDBCUtil.getConnection() ; 
	 		/*
	 		 * Running 
		    String insertQuuery = "INSERT INTO jobs_application(apply_date) VALUES(?)" ;
	 		PreparedStatement pst = conn.prepareStatement(insertQuuery) ; 
	 		pst.setDate(1, sqlDate);
	 		pst.executeUpdate() ; 
	 		*/
		    String insertQuuery = "SELECT apply_date FROM jobs_application WHERE application_id=?" ;
	 		PreparedStatement pst = conn.prepareStatement(insertQuuery) ; 
	 		pst.setInt(1, 1);
	 		ResultSet rs=	pst.executeQuery() ; 
	 		if(rs.next()) {
	 			java.sql.Date old =  rs.getDate("apply_date");   
	 			java.sql.Date current = new java.sql.Date(new java.util.Date().getTime());
	 			
	 			java.util.Calendar cal = java.util.Calendar.getInstance();
	 			cal.setTime(old);
	 			cal.add(Calendar.DATE, +4);
	 			//System.out.println(cal.getTime());
	 			System.out.println(new SimpleDateFormat("YYY-MM-dd", Locale.ENGLISH).format(cal.getTime()));
	 			 
	 			
	 		}
 	 		
	   }catch(Exception e) {
		   System.out.println(e.toString());
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
