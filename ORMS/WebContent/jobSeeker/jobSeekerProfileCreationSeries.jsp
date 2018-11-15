<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 <!-- to use jstl tag , jstl1.2.jar and import statement is needed -->

<%@page import="com.jobSeekerDAO.*" %> 
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

		<link rel="stylesheet" type="text/css" href="..\css\commonStyle.css">			
		<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">
		<link rel="stylesheet" type="text/css" href="..\css\generalSearch.css">	
		<link rel="stylesheet" type="text/css" href="..\css\mainFooter.css">	
 		<link rel="stylesheet" type="text/css" href="..\css\jobSeekerStartPageHeader.css"> 				
		<link rel="stylesheet" type="text/css" href="..\css\profileCreationJobSeekerPersonalInfo.css">		
		<link rel="stylesheet" type="text/css" href="..\css\profileCreationJobSeekerEducation.css">
		<link rel="stylesheet" type="text/css" href="..\css\profileCreationJobSeekerExperience.css">		
		<link rel="stylesheet" type="text/css" href="..\css\profileCreationJobSeekerSummary.css">
		<link rel="stylesheet" type="text/css" href="..\css\profileCreationJobSeekerSkills.css">	
		<link rel="stylesheet" type="text/css" href="..\css\activity.css">		
			
 
 		<script src="..\js\profileCreationJobSeekerSkills.js" > </script> 
 		<script src="..\js\profileCreationJobSeekerActivity.js" ></script>
 		 <script src="..\js\profileCreationJobSeekerInterests.js" ></script>
 		
		
	<style >
			#jobSeekerInterestsList option{
							margin:10px ; 
						}			
			
	</style>
 </head>
<body>

		<!-- include job seeker start page Header Part . -->
		<jsp:include page="jobSeekerStartPageHeader.jsp"></jsp:include>
		
		<!--  page calling decision is coming from home -->		
		<jsp:include page="${nextPageName}"></jsp:include>
		
		
		<!-- Main Footer Part  -->
		<jsp:include page="..\\mainFooter.html"></jsp:include>



</body>
</html>