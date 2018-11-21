package com.jobSeekerDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.generalDAO.JDBCUtil;

public class ApplyJobDAO {
	
 public static void doApply(int jobId,int jobSeekerId,int expectedSalary) {
	     Connection conn=  JDBCUtil.getConnection() ; 
	 	
	    String insertQuuery = "INSERT INTO jobs_application(job_id, job_seeker_id,expected_salary,apply_time) VALUES(?,?,?,?)" ;
        try {
        PreparedStatement pst =  conn.prepareStatement(insertQuuery) ;     
           pst.setInt(1,jobId);
           pst.setInt(2,jobSeekerId);
           pst.setInt(3, expectedSalary);
           pst.setLong(4,System.currentTimeMillis());            
	       pst.executeUpdate(); 	              
       } 
       catch (SQLException ex) 
        {
    	   System.out.println(ex.toString());
        }
 }
 
}
