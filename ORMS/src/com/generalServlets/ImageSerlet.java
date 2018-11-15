package com.generalServlets;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Blob;
import java.sql.Connection;

import com.generalDAO.JDBCUtil;
 
/**
 * Servlet implementation class ImageSerlet
 */
@WebServlet("/ImageServlet")
public class ImageSerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// now get the image back and save it to session then print it in the page , then done 
			Connection conn =  JDBCUtil.getConnection() ; 		
				String selectQuery = "SELECT * FROM test WHERE id=100" ; 
				String userDbPassword ; 
				ResultSet rs = null ; 
				OutputStream img ; 
				PreparedStatement pst ; 
				OutputStream outputStream ; 
				try {
								pst =  conn.prepareStatement(selectQuery) ; 
			          	        rs =  pst.executeQuery() ; 
			          	          
			          	        if(rs.next()) {	     
			          	        	System.out.println("Yep I get the image.");
			          	        	Blob blob = rs.getBlob("image") ; 
			          	        	byte[] imageBytes = blob.getBytes(1, (int)blob.length()) ; 
			          	        	response.setContentType("img/jpeg");
			          	        	outputStream = response.getOutputStream() ; 
			          	        	outputStream.write(imageBytes);
			          	        	outputStream.flush(); 
			          	        	outputStream.close();
			   					}
			          	        else {
			          	        	System.out.println("Image has not been found.");
			          	        }
				    }
			       catch (SQLException ex) 
			       {
			    	   System.out.println("Exception occured to get the image.");
			    	   System.out.println(ex.toString());
			       }		 
			 
				 		
	}

}
