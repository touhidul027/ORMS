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

</head>
<body>
<div class="card" style="margin:20px ; " >
  <div class="card-header">
    Sent Job Invitation 
  </div>
  <div class="card-body">
  <form action="..\ConfirmServlet" method="post" >
  	<input type="hidden" name="jobId" value="${job.jobId}"/>
	<input type="hidden" name="jobSeekerId" value="${jobSeeker.id}"/>
	
    <h5 class="card-title">Job Seeker Name : ${jobSeeker.fullName}</h5>
   	<br>
    <h6 class="card-text">Job Title : ${job.title}</h6>
    <h6 class="card-text">Comapny Name : ${job.companyName}</h6>
    <h6 class="card-text">Address : ${job.companyAddress}</h6>
    <h6 class="card-text">Email : ${recruiter.email}</h6>  
    <h6 class="card-text">Interview Date :<input type="date" required>  </h6>
    <h6 class="card-text">Interview Time :<input type="time"> </h6>
    
    <br>
     <input class="btn btn-primary " type="submit" value="Confirm">  
     
     </form>
  </div>
</div>

</form>
</div>

</body>
</html>