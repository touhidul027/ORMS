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
	 	
</head>
<body>
	<!-- Including the header -->
		<jsp:include page="homePageHeader.html"></jsp:include>

	<!-- Include the registration form  -->
			<jsp:include page="registrationForm.html"></jsp:include>
	
	<!-- Including the footer -->
	<jsp:include page="mainFooter.html"></jsp:include>
	
</body>
</html>