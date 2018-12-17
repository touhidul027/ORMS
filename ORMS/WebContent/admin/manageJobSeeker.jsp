<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="myFunction" uri="MyFunctions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	
		<title> Note to self </title>
	    <meta charset="utf-8" >
		
		<link rel="stylesheet" type="text/css" href="..\css\commonStyle.css">			
		
		<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">
		
        <link rel="stylesheet" type="text/css" href="..\css\jobSeekerStartPageHeader.css">		

		
		<link rel="stylesheet" type="text/css" href="..\css\generalSearch.css">	
		<link rel="stylesheet" type="text/css" href="..\css\mainFooter.css">
		
		<script src="bootstrap\js\bootstrap.js" > </script> 
		
		<style>
			
		</style>
	</head>		
	
	<body>		
	    

<div class="card text-center">
  <div class="card-header">
    <ul class="nav nav-tabs card-header-tabs">
      <li class="nav-item">
        <a class="nav-link  " href="dashboard.jsp">Dashboard</a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link " href="manageJob.jsp">Manage Job</a>
      </li>	
      					 
      <li class="nav-item">
        <a class="nav-link " href="manageCompany.jsp">Manage Company</a>
      </li>	
        
      <li class="nav-item">
        <a class="nav-link active" href="manageJobSeeker.jsp">Manage Job Seeker</a>
      </li>	
      
       <li class="nav-item">
        <a class="nav-link" href="">Log Out</a>
      </li>
    </ul>
  </div>
  
  
<div class="card-body">

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost/fshdb"  
     user="root"  password=""/> 
     
<sql:query dataSource="${db}" var="rs">  
SELECT job_seeker.id,job_seeker.address,job_seeker.nid,sign_up.full_name,sign_up.email FROM job_seeker
JOIN sign_up ON sign_up.user_serial=job_seeker.id;
</sql:query>  

      
<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>     
      <th scope="col">Adrress</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
   	
   <c:forEach var="jobSeeker" items="${rs.rows}">  
   <tr>
      <td>${jobSeeker.id} </td>
      <td>${jobSeeker.full_name}</td>
      <td>${jobSeeker.email}</td>
      <td>${jobSeeker.address} </td>
      <td><a href="../DeleteJobSeekerServlet?jobSeekerId=${jobSeeker.id}">delete</a></td>
    </tr>   
    </c:forEach>
       
  </tbody>
</table>

  </div>
</div>		

		 
</body>
	
</html>
