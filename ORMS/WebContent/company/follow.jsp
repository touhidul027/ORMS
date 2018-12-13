<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
 
<%@ taglib prefix="myFunction" uri="MyFunctions" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Company Details</title>
<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">

</head>
<body>

<div class="card text-center">
  <div class="card-header">
    <ul class="nav nav-tabs card-header-tabs">
      <li class="nav-item">
        <a class="nav-link active" href="../jobSeeker/jobSeekerStartPage.jsp">Dashboard</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Link</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#">Disabled</a>
      </li>
    </ul>
  </div>
  <div class="card-body" style="text-align:left" >
  	  	
  
  <c:choose>
  <c:when test="${jobSeeker.followedCompanyNotifications!=null && not empty jobSeeker.followedCompanyNotifications}">
  	<c:forEach var="followedCompanyNotification" items="${jobSeeker.followedCompanyNotifications}">
 	  	<c:choose>  	
	    <c:when test="${followedCompanyNotification.hasSeenStatus==0}">
	    <div class="card">
		  <div class="card-header"><h5>
		   <a href="../JobDesCriptionForApply?jobId=${followedCompanyNotification.jobId}" > <b> ${followedCompanyNotification.companyName} </b> &nbsp;&nbsp; Title : 
		   <b>${followedCompanyNotification.jobTitle}</b> </a>
		  </h5></div>
	    </div>
	    </c:when>
	    <c:otherwise>
	    <div class="card">
		  <div class="card-header">
		     ${followedCompanyNotification.jobTitle} posted at ${followedCompanyNotification.companyName} 
		  </div>
	    </div>
	    </c:otherwise>
	    </c:choose>
  	</c:forEach>
  </c:when>
  <c:otherwise>
  <div class="card">
	  <div class="card-header">
	    Followed company did not post any job
	  </div>
  </div>
  </c:otherwise>
  </c:choose>
  
  </div>
  
</div>

</body>
</html>