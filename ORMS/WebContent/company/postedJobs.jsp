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
  
   <c:set var="recruiters" value="${company.recruiters}"></c:set>
   
  	 <c:forEach var="recruiter" items="${recruiters}"> 4
  	 	<c:forEach var="job" items="${recruiter.jobs}"> 5
  	 		 <div class="card-body">
			  
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
			 	<a href="../SaveJobServlet?jobId=${job.jobId}" class="btn btn-primary">Save this job</a>			 	
			 	
				<a href="#" class="btn btn-primary">Send this job to your friends</a>
				
				<a href="../JobDesCriptionForApply?jobId=${job.jobId}" class="btn btn-primary">See Details</a>
			 
			  </div>
  	 	</c:forEach>
  	 </c:forEach>
  	 
  </div>
</div>

</body>
</html>