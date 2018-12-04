<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
  
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">
<link rel="stylesheet" type="text/css" href="all.css">


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
        <a class="nav-link active" href="#">Applicants application</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#"> Post a Job</a>
      </li>
       <li class="nav-item">
        <a class="nav-link disabled" href="#"> My Posted Jobs</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="..\RecruiterLogOutServlet">Log Out</a>
      </li>
    </ul>
  </div>
  <div class="card-body">
    <h5 class="card-title">Applicants Application</h5>
    <c:forEach var="applicantNotification" items="${recruiter.applicantNotifications}"> 
    	 <a href="..\NotifyJobSeekerDecisionServlet?jobId=${applicantNotification.jobId}&jobSeekerId=${applicantNotification.jobSeekerId}"><b> ${applicantNotification}</b></a>
    </c:forEach> 
  </div>
</div>
				
</body>
</html>