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
        <a class="nav-link active" href="#">Dashboard</a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="applications.jsp">Applicants application</a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="..\JobPostingStartingServlet"> Old Post a Job</a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link " href="postJob.jsp">Post a Job</a>
      </li>
      
       <li class="nav-item">
        <a class="nav-link " href="..\JobPostingGetAllPostedJobsServlet"> My Posted Jobs</a>
      </li>
       
       <li class="nav-item">
        <a class="nav-link " href="..\company\companyProfile.jsp"> Company Profile</a>
       </li>
      
      <li class="nav-item">
        <a class="nav-link " href="..\company\upDateCompanyProfile.jsp"> Update Company Profile</a>
       </li> 
       
       <li class="nav-item">
        <a class="nav-link" href="..\RecruiterLogOutServlet">Log Out</a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" href="payment.jsp">Payment Demo</a>
      </li>
      
    </ul>
  </div>
  <div class="card-body">
    <h5 class="card-title">Special title treatment</h5>
    <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>		
				
</body>
</html>