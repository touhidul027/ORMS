package com.generalDAO;

import java.sql.*;

public class SignUpDAO {
	
	public static boolean registerAUser(BasicUser basicUser) {
		// get the connection object 
		
		 Connection conn=  JDBCUtil.getConnection() ; 
		 
		 if(conn==null) {
			 System.out.println("SignUpDAO,conn null");
			 return false ; 
		 }
		 
		    String insertQuuery = "INSERT INTO sign_up(full_name,email, password, user_type) VALUES(?,?,?,?)" ;
	        try {
	        PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 
	          // pst.setInt(1, 1);
	           pst.setString(1,basicUser.getFullName() );
	           pst.setString(2, basicUser.getEmail() );
	           pst.setString(3, basicUser.getPassword() );
	           pst.setString(4,basicUser.getUserType() );
 	           return pst.executeUpdate()!=0 ; 	     
	           
	       } 
	       catch (SQLException ex) 
	        {
	    	   System.out.println("SignUpDAO pst not executed.");
	    	   System.out.println(ex.toString());
	        }
	        return false ; 
	}
	
}
