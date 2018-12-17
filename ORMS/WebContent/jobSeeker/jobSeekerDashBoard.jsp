<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">
<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.min.css">

</head>
<body>
<%
			response.setHeader("Cache-Control", "no-cache , no-store , must-revalidate");	
				if (session.getAttribute("jobSeeker")== null){		
					response.sendRedirect("..\\index.jsp");		
				}	
%>

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
        <a class="nav-link active" href="jobSeekerDashBoard.jsp"> All applied jobs</a>
      </li>
      
       <li class="nav-item">
        <a class="nav-link " href="savedJob.jsp"> Saved jobs</a>
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
  
  
  <div class="card-body" style="text-align:left;">
    <c:forEach var="appliedJob" items="${jobSeeker.appliedJobs}" > 
	<div class="card" style=" margin:30px;" >
	  <div class="card-header">
	    Apply time 
	  </div>
	  <div class="card-body">
	    <h5 class="card-title">${appliedJob.title}</h5>
	    <p class="card-text">${appliedJob.companyName}</p>
	    <a href="../SeeAppliedJobServlet?jobId=${appliedJob.jobId}" class="btn btn-primary">See Details</a>
	  </div>
	</div>
</c:forEach>

  </div>
</div>	

 


</body>
</html>