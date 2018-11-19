<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" type="text/css" href="bootstrap\css\bootstrap.css">
<link rel="stylesheet" type="text/css" href="css\jobSummary.css">
		
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:choose>
<c:when test="${jobsForApply != null and not empty jobsForApply}">
	<c:forEach var="job" items="${jobsForApply}">
	
	
	<div class="card text-center" style="width:750px ; margin:20px ; " >
  <div class="card-header">
    <ul class="nav nav-tabs card-header-tabs">
      <li class="nav-item">
        <a class="nav-link active" href="#">Job Number</a>
      </li>      
    </ul>
  </div>
  <div class="card-body">
   <h5 class="card-title">
		<div id="jobTitle">
				<h4>${job.jobPostingJobTitle}</h4>
				<h5> ${job.jobPostingCompanyName} <h5>
			</div>
			<h5>${job.jobPostingJobLocation} |<c:forEach var="jobType" items="${job.jobPostingJobType}"> ${jobType} |
			</c:forEach> | Salary ${job.jobPostingSalary} </h5>
	</h5>
    <p class="card-text" style="text-align:left;" >
					 ${job.description()}			
 	</p>
    <a href="#" class="btn btn-primary">Save this job</a>
	<a href="#" class="btn btn-primary">Send this job to your friends</a>
	<a href="#" class="btn btn-primary">Save this job</a>
  </div>
</div>
</c:forEach>

</c:when>
<c:otherwise>
	
</c:otherwise>

</c:choose>

</body>
</html>