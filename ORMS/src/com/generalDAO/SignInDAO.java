package com.generalDAO;

import java.sql.*;

public class SignInDAO {
	
	public static BasicUser doSignIn(String email,String password) {
		Connection conn = JDBCUtil.getConnection() ; 
		
		String signInQuery = "SELECT * FROM sign_up WHERE email=? AND password=?" ; 
		ResultSet rs = null ; 
 		BasicUser aBasicUser = null ; 
		try {
	        PreparedStatement pst =  conn.prepareStatement(signInQuery) ; 
	           pst.setString(1, email);
	           pst.setString(2, password);
	           rs = pst.executeQuery() ; 
	           if(rs.next()) {
	        	   int userSerial = rs.getInt("user_serial") ; 
	        	   String fullName = rs.getString("full_name") ; 	        	   
	        	   String userType = rs.getString("user_type") ; 
 	        	   
	        	   aBasicUser =  new BasicUser(userSerial,fullName,email,userType,password) ; 
	        	  // System.out.println(aBasicUser);
	        	   return  aBasicUser ; 
	           }
	       } 
	       catch (SQLException ex) 
	       {
	    	   System.out.println("SignInDAO catch block");
	       }
		 return aBasicUser;
	}
	
	public static User isSignedUp(String email,String password) throws SQLException {
			
		Connection conn = JDBCUtil.getConnection() ; 
		
		String signInQuery = "SELECT * FROM sign_up WHERE email=?" ; 
		ResultSet rs = null ;
		String userDbPassword ; 
		try {
	           PreparedStatement pst =  conn.prepareStatement(signInQuery) ; 
	           pst.setString(1, email);	        
	           rs = pst.executeQuery() ; 	           
		    }
	       catch (SQLException ex) 
	       {
	    	   
	       }		 
	 
		if(rs.next()) {	        	    
     	   userDbPassword = rs.getString("password") ; 
     	   if(userDbPassword.equals(password)) {
     		   return User.smartUser ; 
     	   }
     	   return User.forgettableUser ; 
        }		
		
		return User.notAUser;				 
	}
}
