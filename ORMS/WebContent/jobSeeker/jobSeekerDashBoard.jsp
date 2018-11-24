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
<h2>Dash board of applied jobs</h2>

<c:forEach var="appliedJob" items="${jobSeeker.appliedJobs}" > 
	<div class="card" style="width:300px ; margin:30px;" >
	  <div class="card-header">
	    Featured
	  </div>
	  <div class="card-body">
	    <h5 class="card-title">${appliedJob.title}</h5>
	    <p class="card-text">${appliedJob.companyName}</p>
	    <a href="../SeeAppliedJobServlet?jobId=${appliedJob.jobId}" class="btn btn-primary">See Details</a>
	  </div>
	</div>
</c:forEach>

</body>
</html>