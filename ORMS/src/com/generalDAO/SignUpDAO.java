package com.generalDAO;

import java.sql.*;

import com.jobSeekerDAO.JobSeeker;

public class SignUpDAO {
	
	public static boolean registerAUser2(BasicUser basicUser) {
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
	
	public static boolean registerAUser(BasicUser basicUser) throws SQLException {
		// check email uniqueness 
		User userStatus = SignInDAO.isSignedUp(basicUser.getEmail(), basicUser.getPassword()) ;
		
		if(userStatus == User.smartUser) {
			System.out.println("person is trying , cheating with the system");
			// person is trying , cheating with the system 
		}else if(userStatus == User.forgettableUser) {
			// he may want to reset the password,give him to delete the account info
			System.out.println("he may want to reset the password,give him to delete the account info");
		}else if(userStatus == User.notAUser){
			
			
				// a new user,so free to sign up the account 
				
				Connection conn=  JDBCUtil.getConnection() ; 
				// insert into common table 
					String insertQuuery = "INSERT INTO sign_up(email, full_name,password, user_type) VALUES(?,?,?,?)" ;
			        try {
			        PreparedStatement pst =  conn.prepareStatement(insertQuuery) ; 		      
	 		           pst.setString(1, basicUser.getEmail() );
	 		           pst.setString(2, basicUser.getFullName());
			           pst.setString(3, basicUser.getPassword() );
			           pst.setString(4,basicUser.getUserType() );
		 	          if( pst.executeUpdate()!=0) {
		 	        	 // System.out.println("common working");
		 	          }
			       } 
			       catch (SQLException ex) 
			        {
		 	        }		
		        
			     // insert into specific table with selecting the id from common table 
					String insertJobSeeker = "INSERT INTO job_seeker(id) SELECT user_serial FROM sign_up WHERE email=? LIMIT 1" ;
			        try {
			        PreparedStatement pst2 =  conn.prepareStatement(insertJobSeeker) ; 		      
	 		           pst2.setString(1, basicUser.getEmail() );

		 	          if( pst2.executeUpdate()!=0 ) {
		 	        	 // System.out.println("working");
		 	          }else {
		 	        	//  System.out.println("not working");
		 	          }
			       } 
			       catch (SQLException ex) 
			        {
			    	   
		 	        }		
		}		
		  
	        return false ; 
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
}
