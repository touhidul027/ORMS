package com.generalDAO;

import java.sql.* ; 

public class JDBCUtil
{
private static final String DB_DRIVER="com.mysql.jdbc.Driver" ; 
  
       private static final String  username="root" ; 
       private static final String password=""; 
       private static final String  url="jdbc:mysql://localhost/fshdb" ;
       
       public static Connection getConnection()
       {
           Connection conn=null ; 
            try
            {
               Class.forName(DB_DRIVER) ; 
               conn=DriverManager.getConnection(url,username,password) ; 
            }
            catch(Exception e){
            	System.out.println("JDBC Util conn exception.");
            }
            return conn ; 
       }
}