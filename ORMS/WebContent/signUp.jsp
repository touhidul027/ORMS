<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up</title>

	<link rel="stylesheet" type="text/css" href="css\commonStyle.css">
	<link rel="stylesheet" type="text/css" href="bootstrap\css\bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css\homePageHeader.css">
	<link rel="stylesheet" type="text/css" href="css\registrationForm.css">
	<link rel="stylesheet" type="text/css" href="css\mainFooter.css">	
	<script src="bootstrap\js\bootstrap.js" > </script> 
	<script src="js\passwordEqualityChecking.js" > </script> 
	<style >
	
.container2 {
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

<div class="container2">

<a href="index.jsp">  <img src="images/banner2.jpg" alt="Snow" style="width:100%;"> </a>
  <div class="bottom-left">  </div>
  <div class="top-left"><a href="index.jsp" ><h1>Home</h1></a></div>
  <div class="top-right"></div>
  <div class="bottom-right"></div>
  <div class="centered"> </div>
</div>	
	<!-- Include the registration form  -->
			<jsp:include page="registrationForm.html"></jsp:include>
	
	<!-- Including the footer -->
	<jsp:include page="mainFooter.html"></jsp:include>
	
</body>
</html>