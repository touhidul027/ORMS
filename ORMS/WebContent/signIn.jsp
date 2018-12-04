<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign In</title>
	
	<link rel="stylesheet" type="text/css" href="css\commonStyle.css">
	<link rel="stylesheet" type="text/css" href="bootstrap\css\bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css\homePageHeader.css">
	<link rel="stylesheet" type="text/css" href="css\signIn.css">	
	<link rel="stylesheet" type="text/css" href="css\mainFooter.css">	
	<script src="bootstrap\js\bootstrap.js" > </script> 	 
	<style >
	
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

<div class="container">

<a href="index.jsp">  <img src="images/banner2.jpg" alt="Snow" style="width:100%;"> </a>
  <div class="bottom-left">  </div>
  <div class="top-left"><a href="index.jsp" ><h1>Home</h1></a></div>
  <div class="top-right"></div>
  <div class="bottom-right"></div>
  <div class="centered"> </div>
</div>		 
	  
		 <!-- Own part -->
		 <form action="SignInServlet" method="post" >
		 
 		 		<div id="signInEmail" style="padding-top:10px ;" >
 		 		<!-- put the condition checking and show the message  -->
 		 		<h3> ${loginAfterSignUp}</h3>
 		 		<h3>${messageForAppyJobWithoutSignIn}</h3>
 		 		
						Email
							<input type="email" id="signInEmailMail" name="email" required="required" > <br>		
						Password 
							<input type="password" id="signInEmailPassword" name="password" required="required"> <br>	
						
							<input type="submit" id="signInEmailSubmitButton" value="Sign In" > 
				</div>
		 </form>
		 		
		 
		 <!-- Including the footer part + css -->
		 <jsp:include page="mainFooter.html"></jsp:include>
		 
		  
		
</body>
</html>