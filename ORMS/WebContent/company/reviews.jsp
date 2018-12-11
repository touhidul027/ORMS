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
        <a class="nav-link active" href="../jobDescriptionForApply.jsp">Job details</a>
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
   <c:set var="companyId" value="${param.companyId}"></c:set>
   <c:set var="company" value="${myFunction:getCompany(companyId)}"></c:set> 	
  	<c:set var="reviews" value="${company.reviews}" ></c:set>
  	
  		<c:forEach var="review" items="${reviews}"> 
  			
		 <div class="card" style="margin-bottom:5px;width:750px;">
		  <div class="card-header">
		    ${review.review_title}
		  </div>
		  <div class="card-body">
		  
			 <div class="card">
			  <div class="card-body">
			   Pros : ${review.pros}
			  </div>
			 </div>
			
			<div class="card">
			  <div class="card-body">
			   Cons : ${review.cons}
			  </div>
			 </div>
			 
			 <div class="card">
			  <div class="card-body">
			   Outlook : ${review.outlook}
			  </div>
			 </div>
			 
			 <div class="card">
			  <div class="card-body">
			   Advice to management : ${review.advice}
			  </div>
			 </div>
			 			 		  
		  </div>
		</div>
  			
  		</c:forEach>
  </div>
</div>

</body>
</html>