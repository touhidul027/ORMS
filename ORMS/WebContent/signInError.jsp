<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="css\commonStyle.css">
	<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">
	<link rel="stylesheet" type="text/css" href="bootstrap\css\bootstrap.css">
	<link rel="stylesheet" type="text/css" href="bootstrap\css\bootstrap.css">
	<link rel="stylesheet" type="text/css" href="css\homePageHeader.css">
	<link rel="stylesheet" type="text/css" href="css\generalSearch.css">	
	<link rel="stylesheet" type="text/css" href="css\mainFooter.css">	
	<script src="bootstrap\js\bootstrap.js" > </script> 	
</head>
<body>

	<!-- Including the header -->
		<jsp:include page="homePageHeader.html"></jsp:include>
		
				<div class="card" style="width: 400px;text-align:center ;  margin: 0 auto ; margin-top:30px ; ">
				  <div class="card-body">
					<h5 class="card-title">Login Information</h5>
					<h6 class="card-subtitle mb-2 text-muted">Password mismatch</h6>
					<p class="card-text">The email you provide is right,but the password is not correct.So follow the 
					following option.</p>
					<a href="index.jsp" class="card-link">Home page</a>
					<a href="signIn.jsp" class="card-link">Try Again</a>
					<a href="#" class="card-link">Forget Password</a>
				  </div>
				</div>	
				
		<jsp:include page="mainFooter.html"></jsp:include>
</body>
</html>