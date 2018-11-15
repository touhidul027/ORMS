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
					<h4 class="card-title" style="text-align:left ;" >Login Information</h4>
					<h5 class="card-subtitle mb-2 text-muted">Account Information</h5> 
					<p class="card-text"> You don't have any account with this email id.Please Try the  
					following option.</p>
					<a href="index.jsp" class="card-link">Home page</a>
					<a href="signUp.jsp" class="card-link">Create A account</a>
 				  </div>
				</div>	
				
		<jsp:include page="mainFooter.html"></jsp:include>
</body>
</html>