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
<div class="card" style="margin:20px;" >
  <div class="card-header">
    Confirmed at <b><i> ${recruiterNotification.getTime()} </i></b> 
  </div>
  <div class="card-body">
    <h6 class="card-title">Company Name :<b>${recruiterNotification.job.companyName}</b></h6>
    <h6 class="card-title">Job Title :<b> ${recruiterNotification.job.title} </b> </h6>
    <h6 class="card-title">Email :<b> ${recruiterNotification.recruiterEmail}</b> </h6>
    <h6 class="card-title">Interview Time,Place : <b> ${recruiterNotification.interviewTimePlace}</b> </h6>    
   </div>
</div>
</body>
</html>