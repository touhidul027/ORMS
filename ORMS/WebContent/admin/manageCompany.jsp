<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="myFunction" uri="MyFunctions" %>

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
        <a class="nav-link active" href="dashboard.jsp">Dashboard</a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link " href="manageJob.jsp">Manage Job</a>
      </li>	
      					 
      <li class="nav-item">
        <a class="nav-link " href="manageCompany.jsp">Manage Company</a>
      </li>	
        
       <li class="nav-item">
        <a class="nav-link" href="">Log Out</a>
      </li>
    </ul>
  </div>
  
<div class="card-body">

<table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Company Name</th>
      <th scope="col">Company Type</th>     
      <th scope="col">Size</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:set var="companies" value="${myFunction:allCompanies()}"></c:set> 	
  
   <c:forEach var="company" items="${companies}" >   
    <tr>
      <td>${company.company_id} </td>
      <td>${company.companyName} </td>
      <td>${company.industryType} </td>
      <td>${company.size} </td>
      <td><a href="">delete</a></td>
    </tr>   
    </c:forEach>
       
  </tbody>
</table>

  </div>
</div>		

		 
</body>
	
</html>
