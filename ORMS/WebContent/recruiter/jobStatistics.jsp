<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Job Description</title>

<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">

<style>
			 td{
				 padding-top:10px ; 
				 }				 
			
				p{
					margin-left: 50px ; 
				}	
		</style>

</head>
<body>

<div class="card text-center">
  <div class="card-header">
    <ul class="nav nav-tabs card-header-tabs">
      <li class="nav-item">
        <a class="nav-link " href="recruiterDashBoard.jsp">Dashboard</a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="applications.jsp">Applicants application</a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="..\JobPostingStartingServlet"> Post a Job</a>
      </li>
       <li class="nav-item">
        <a class="nav-link active" href="..\JobPostingGetAllPostedJobsServlet"> My Posted Jobs</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="..\RecruiterLogOutServlet">Log Out</a>
      </li>
    </ul>
  </div>
</div>		

<div class="card text-center" style="width:700px;margin:50px ; " >
  <div class="card-header">
    <ul class="nav nav-tabs card-header-tabs">
      <li class="nav-item">
        <a class="nav-link" href="postedJobDetails.jsp">Job Details</a>
      </li>
      <li class="nav-item">
        <a class="nav-link active" href="#">Statistics</a>
      </li>
    </ul>
  </div>
  <div class="card-body">
  	<div class="card-header">
    <ul class="nav nav-tabs card-header-tabs">
      <li class="nav-item">
       job id : ${job.jobId}
      </li>
      
      <li class="nav-item" style="margin-left: 50px ; " >  
        Applicants : ${fn:length(job.applicants)} 
      </li>     
    </ul>
   </div> 
   
  <!-- job applicants summary  --> 
  <c:forEach var="jobSeeker" items="${job.applicants}">
  <div class="card" style="text-align:left;margin:5px;">
  <div class="card-header">
    <b>${jobSeeker.fullName}</b>
  </div>
  <div class="card-body"  >experience
    Education :<h6 class="card-title" > ${jobSeeker.education}</h6>
    Experience :<h6 class="card-title" >${jobSeeker.experience}</h6>
    Skills: <h6 class="card-title" >${jobSeeker.skills}</h6>   
    <a href="" class="btn btn-primary">See details</a>
  </div>
</div>
</c:forEach>
   	
  </div>
 </div>
   

</body>
</html>