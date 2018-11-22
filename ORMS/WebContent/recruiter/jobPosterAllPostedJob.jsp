<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
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
	
	 			
 <div >
 	 <a href="jobPosterDashBoard.jsp"><h3>Your Dash board</h3></a>
</div>	 			
				
	<h1>ALL Job Posting</h1>
	
<c:if test="${recruiter.jobs!=null && not empty recruiter.jobs}" >  
       
 <c:forEach var="job" items="${recruiter.jobs}">
 <div class="card" style="width:700px ; margin:50px;" >
  <div class="card-header">
    ${job.jobId}
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