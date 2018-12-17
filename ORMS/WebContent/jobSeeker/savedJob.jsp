<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="myFunction" uri="MyFunctions" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Saved job</title>
		<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">

</head>
<body>

<div class="card text-center">
  <div class="card-header">
    <ul class="nav nav-tabs card-header-tabs">
      <li class="nav-item">
        <a class="nav-link " href="jobSeekerStartPage.jsp">Dashboard</a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="profileOverview.jsp">Profile Overview</a>
      </li>						 
      <li class="nav-item">
        <a class="nav-link " href="notifications.jsp">Notifications</a>
      </li>
      
       <li class="nav-item">
        <a class="nav-link " href="jobSeekerDashBoard.jsp"> All applied jobs</a>
      </li>
      
       <li class="nav-item">
        <a class="nav-link active" href="savedJob.jsp"> Saved jobs</a>
       </li>
      
     
       <li class="nav-item">
        <a class="nav-link " href="updateProfile.jsp"> Update profile</a>
      </li>
      
       <li class="nav-item">
        <a class="nav-link " href="../company/follow.jsp">Followed Company</a>
      </li>
      
       <li class="nav-item">
        <a class="nav-link" href="../JobSeekerLogOutServlet">Log Out</a>
      </li>
    </ul>
  </div>
  
</div>	



<c:choose> 
 <c:when test="${jobSeeker.savedJobs!=null && not empty jobSeeker.savedJobs}"> 
 	
 <c:forEach var="saveJob" items="${jobSeeker.savedJobs}" > 
 
 <c:set var="job" value="${saveJob.job}"></c:set>
 
  <div class="card text-center" style="width:750px ; margin:20px ; " >
  <div class="card-header">
    <ul class="nav nav-tabs card-header-tabs">
      <li class="nav-item">
         ${saveJob.getFormatedTime()}
      </li>      
    </ul>
  </div>
  <div class="card-body">
  
  <div class="card-header">
       <b>"${saveJob.note}"</b>
  </div>
  
   <h5 class="card-title">
		<div id="jobTitle">
				<h4>${job.title}</h4>
				<h5> ${job.companyName} <h5>
			</div>
			<h5>${job.location} |<c:forEach var="jobType" items="${job.jobType}"> ${jobType} |
			</c:forEach> | Salary ${job.salary} </h5>
	</h5>
    <p class="card-text" style="text-align:left;" >
					 ${job.shortDescription()}			
 	</p>
 	
	<a href="#" class="btn btn-primary">Send this job to your friends</a>
	
	<a href="../JobDesCriptionForApply?jobId=${job.jobId}" class="btn btn-primary">See Details</a>
 
  </div>
</div>
</c:forEach>
 	
 </c:when>
  
 <c:otherwise>
 <div class="card">
  <div class="card-header">
     No Saved jobs found
  </div>
   
</div>
</c:otherwise>
 </c:choose>
 
</body>
</html>