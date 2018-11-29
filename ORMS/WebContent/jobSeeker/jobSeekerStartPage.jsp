<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
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
	    <%
			response.setHeader("Cache-Control", "no-cache , no-store , must-revalidate");	
				if (session.getAttribute("jobSeeker")== null){		
					response.sendRedirect("..\\index.jsp");		
				}	
		%>

		
		
		
		<!-- include job seeker start page Header Part . -->
		<jsp:include page="jobSeekerStartPageHeader.jsp"></jsp:include>
		
		<!-- General search -->
 		
 		<form action="../SearchJobsServlet" method="post" >
				<div id="generalSearchOption" >
 					<input type="text" name="jobTitle" id="generalTextInput" placeholder="Job Title" > <br>	
					<input type="text" name="location" id="generalTextInput" placeholder="Place,Location,City"> <br>					
					<input type="submit" id="generalTextInputSubmitButton" value="search" > 
				</div>			
			</form>
 		 
		<!-- Main Footer Part  -->
		<jsp:include page="..\\mainFooter.html"></jsp:include>
</body>
	
</html>
