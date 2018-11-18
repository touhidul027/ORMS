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

</head>
<body>
		
		 <!-- 	Including Header part  -->
		 <jsp:include page="homePageHeader.html"></jsp:include>
		 
		 <!-- Own part -->
		 
		  
		
		 <form action="SignInServlet" method="post" >
		 
 		 		<div id="signInEmail" >
 		 		<h3> ${loginAfterSignUp}</h3>
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