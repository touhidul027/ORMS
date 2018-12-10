<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">
<link rel="stylesheet" type="text/css" href="..\css\jobSummary.css">
		
</head>
<body>

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
				<h4>${job.title}</h4>
				<h5> ${job.companyName} <h5>
			</div>
			<h5>${job.location} |<c:forEach var="jobType" items="${job.jobType}"> ${jobType} |
			</c:forEach> | Salary ${job.salary} </h5>
	</h5>
    <p class="card-text" style="text-align:left;" >
					 ${job.shortDescription()}			
 	</p>
 <div class="card" style="width:700px;">
  <div class="card-header">
    <div class="form-group">
    <label for="exampleInputEmail1">Your Note about this job</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Put your sticky note">
     </div>
  </div>
</div>
     
     <a href="ConfirmSaveJobServlet?jobId=${job.jobId}&jobSeekerId=${jobSeeker.id}" class="btn btn-primary">Save this job</a>
 
  
  </div>
</div>

</body>
</html>