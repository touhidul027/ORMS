<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ taglib prefix="myFunction" uri="MyFunctions" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	
		<title> Note to self </title>
	    <meta charset="utf-8" >
		
		<link rel="stylesheet" type="text/css" href="..\css\commonStyle.css">					
		<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">		
        <link rel="stylesheet" type="text/css" href="..\css\jobSeekerStartPageHeader.css">						
		<script src="bootstrap\js\bootstrap.js" > </script> 
	    <link rel="stylesheet" type="text/css" href="style.css">								
		<style>
			
		</style>
	</head>		
	
	<body>		
	    

<div class="card text-center">
  <div class="card-header">
    <ul class="nav nav-tabs card-header-tabs">
      <li class="nav-item">
        <a class="nav-link " href="dashboard.jsp">Dashboard</a>
      </li>
      <li class="nav-item">
        <a class="nav-link active" href="manageJob.jsp">Manage Job</a>
      </li>						 
      
        
       <li class="nav-item">
        <a class="nav-link" href="">Log Out</a>
      </li>
    </ul>
  </div>
  
  <div class="card-body">
  
     <table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Job ID</th>
      <th scope="col">Company</th>
      <th scope="col">Title</th>
      <th scope="col">Time</th>
      <th scope="col">Price</th>
     <th scope="col">Paid</th>
      <th scope="col">Action</th>
      
    </tr>
  </thead>
  <tbody>
   <c:set var="manageJobs" value="${myFunction:getRequestedJobPost()}"></c:set> 	
  
   <c:forEach var="manageJob" items="${manageJobs}" > 
    <tr>
      <td>${manageJob.jobId}</td>
      <td>${manageJob.companyName}</td>
      <td>${manageJob.title}</td>
      <td>${manageJob.getFormatedTime()}</td>
      <td>${manageJob.price}</td>
      <td>${manageJob.paid}</td>
      <td>     
	    <a href="../AllowJobPostServlet?jobId=${manageJob.jobId}">POST</a>
     </td>      
    </tr>  
   </c:forEach>
  </tbody>
</table>
    
    
    
    
    
    
  	
	
	<script>
/* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */
function myFunction() {
  document.getElementById("myDropdown").classList.toggle("show");
}

// Close the dropdown if the user clicks outside of it
window.onclick = function(event) {
  if (!event.target.matches('.dropbtn')) {
    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}
</script>
  </div>
</div>		

		 
</body>
	
</html>
