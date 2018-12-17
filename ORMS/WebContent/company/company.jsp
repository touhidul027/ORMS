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
        <a class="nav-link  " href="#">Job description</a>
      </li>
      <li class="nav-item">
        <a class="nav-link active" href="company/company.jsp?companyId=${singleJobDescriptionForApply.companyId}">Company Details</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="company/reviews.jsp?companyId=${singleJobDescriptionForApply.companyId}">Reviews</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="company/postedJobs.jsp?companyId=${singleJobDescriptionForApply.companyId}">All posted Job From This Company</a>
      </li>
    </ul>
  </div>
  <div class="card-body" style="text-align:left" >
   <c:set var="companyId" value="${param.companyId}"></c:set>
   <c:set var="company" value="${myFunction:getCompany(companyId)}"></c:set> 	
  	
    <div class="card-body">
    <h5 class="card-title"> Name : ${company.companyName} </h5>
    <p class="card-text">Company Type :  ${company.industryType} Company</p>
    <p class="card-text">Size : ${company.size}</p>
    <p class="card-text">Founded year:${company.founded}</p>
    <p class="card-text">Head Quarters : ${company.headQuarter}</p>
    </div>
  	
  	<br>
  <c:choose>
  <c:when test="${jobSeeker!=null && jobSeeker.isFollowedCompany(companyId)}">
  	<h5 class="card-header">You already followed this company</h5>
  </c:when>
  <c:otherwise> 
  	  <form action="../FollowServlet" method="post" >
	  	<input type="hidden" name="companyId" value="${company.company_id}">
	  	<input type="hidden" name="jobSeekerId" value="${jobSeeker.id}" > 
	  	<input class="btn btn-primary" type="submit" value="Follow This Company">
	  </form>
  </c:otherwise>
  </c:choose>
  
  </div>
  
</div>

</body>
</html>