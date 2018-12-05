<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Job Posting </title>
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
		<link rel="stylesheet" type="text/css" href="jobDescription.css">
			
 
 		<script src="..\js\profileCreationJobSeekerSkills.js" > </script> 
 		<script src="..\js\profileCreationJobSeekerActivity.js" ></script>
 		 <script src="..\js\profileCreationJobSeekerInterests.js" ></script>
 		
</head>
<body>
 	
 	<div class="card text-center">
  <div class="card-header">
    <ul class="nav nav-tabs card-header-tabs">
      <li class="nav-item">
        <a class="nav-link " href="recruiterDashBoard.jsp">Dashboard</a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="#">Applicants application</a>
      </li>
      <li class="nav-item">
        <a class="nav-link active" href="..\JobPostingStartingServlet"> Post a Job</a>
      </li>
       <li class="nav-item">
        <a class="nav-link " href="..\JobPostingGetAllPostedJobsServlet"> My Posted Jobs</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="..\RecruiterLogOutServlet">Log Out</a>
      </li>
    </ul>
  </div>
</div>	
	
	<!-- Include the file  -->
		<jsp:include page="${nextPageName}"></jsp:include>	
	<!--  Include footer -->
</body>
</html>