<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Fresh skill Hunting </title>
	
	<link rel="stylesheet" type="text/css" href="bootstrap\css\bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css\homePageHeader.css">
	<link rel="stylesheet" type="text/css" href="css\generalSearch.css">	
	<link rel="stylesheet" type="text/css" href="css\mainFooter.css">	
	<script src="bootstrap\js\bootstrap.js" > </script> 
	<link rel="stylesheet" type="text/css" href="css\commonStyle.css">
	
<style>
	.container {
    position: relative;
    text-align: center;
    color: white;
}

.bottom-left {
    position: absolute;
    bottom: 8px;
    left: 16px;
    color:black;
}

.top-left {
    position: absolute;
    top: 8px;
    left: 16px;
     color:black;
}

.top-right {
    position: absolute;
    top: 8px;
    right: 16px;
     color:black;
}

.bottom-right {
    position: absolute;
    bottom: 8px;
    right: 16px;
     color:black;
}

.centered {
color:black;
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
}
</style>

</head>
<body>
 
		 
<!-- localhost/phpmyadmin/ -->
<div class="container">
  <img src="images/banner.jpg" alt="Snow" style="width:100%;">
  <div class="bottom-left">
  </div>
  <div class="top-left"></div>
  <div class="top-right"></div>
  <div class="bottom-right"></div>
  <div class="centered">
  <h3>Your next Job is here</h3>
  	<ul><li>Have a account</li></ul>
  	<ul><li>Apply Job</li></ul>
  	<ul><li>Land in a Job</li></ul>	
  </div>
  <div class="bottom-left">
	<div class="card text-center">
  <div class="card-header">
    <ul class="nav nav-pills card-header-pills">
      <li class="nav-item">
        <a class="nav-link" href="signIn.jsp">Sign In</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="signUp.jsp">Sign Up</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="">Extra</a>
      </li>
    </ul>
  </div>
</div>
  </div>
  
</div>
		
		<!-- General search -->
		<jsp:include page="generalSearch.html"></jsp:include>
		
	    <jsp:include page="category.jsp"></jsp:include>

		
		 <jsp:include page="mainFooter.html"></jsp:include>
		
		 
</body>
</html>