<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	response.setHeader("Cache-Control", "no-cache , no-store , must-revalidate");	
		if (session.getAttribute("recruiter")== null){		
			response.sendRedirect("..\\index.jsp");		
		}	
	%>
	
	 			
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
        <a class="nav-link active" href="#"> My Posted Jobs</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="..\RecruiterLogOutServlet">Log Out</a>
      </li>
    </ul>
  </div>
</div>		

	
<c:if test="${recruiter.jobs!=null && not empty recruiter.jobs}" >  
       
 <c:forEach var="job" items="${recruiter.jobs}">
 <div class="card" style="width:700px ; margin:50px;" >  
  
 	<div class="card-header">
    <ul class="nav nav-tabs card-header-tabs">
      <li class="nav-item">
       ${job.jobId}
      </li>
      
      <li class="nav-item" style="margin-left: 50px ; " >
      
        Applicants : ${fn:length(job.applicants)} 
      </li>
      
      <li class="nav-item" style="margin-left: 50px ; " >
        Invitation Sent: 0
      </li>
      
    </ul>
   </div> 	
  
	  <div class="card-body">
	    <h5 class="card-title">${job.title} </h5>
	    <p class="card-text"> ${job.companyName} </p>
	    <a href="..\PostedJobsServlet?jobId=${job.jobId}" class="btn btn-primary">See Details</a>
	  </div>  
</div>
</c:forEach>

</c:if>

<c:if test="${recruiter.jobs==null || empty recruiter.jobs}">
<div class="card">
  <div class="card-header">
    No Posted Jobs Found
  </div>
</div>
</c:if>
	        
 			 
</body>
</html>