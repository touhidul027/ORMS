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
<link rel="stylesheet" type="text/css" href="all.css">


</head>
<body>
	<%
	response.setHeader("Cache-Control", "no-cache , no-store , must-revalidate");	
		if (session.getAttribute("recruiter")== null){		
			response.sendRedirect("..\\index.jsp");		
		}	
	%>
	<h1>This is the dash board of Recruiter</h1>
	
	<div class="dropdown">
<button onclick="myFunction()" class="dropbtn">Appicant Notification</button>
  <div id="myDropdown" class="dropdown-content">
    <input type="text" placeholder="Search.." id="myInput" onkeyup="filterFunction()">
    
    <c:forEach var="applicantNotification" items="${recruiter.applicantNotifications}"> 
    	 <a href="..\NotifyJobSeekerDecisionServlet?jobId=${applicantNotification.jobId}&jobSeekerId=${applicantNotification.jobSeekerId}"><b> ${applicantNotification}</b></a>
    </c:forEach>
    
  </div>
</div>
	
	<h3>Posting job</h3>
	<h3>My Posted Job</h3>
	

				<div >
					 <a href="..\JobPostingStartingServlet"><h1>Post a job</h1></a>
				</div>
				
				<div >
					 <a href="..\JobPostingGetAllPostedJobsServlet"><h1>My Posted Jobs</h1></a>
				</div>
				
				<div> 
					<form action="..\RecruiterLogOutServlet" method="post" >
						 <a> 
					       <input type="submit" value="Log Out" >
					     </a>
					</form>
				</div>
				
				
				
				
 
<script>
/* When the user clicks on the button,
toggle between hiding and showing the dropdown content */
function myFunction() {
    document.getElementById("myDropdown").classList.toggle("show");
}

function filterFunction() {
    var input, filter, ul, li, a, i;
    input = document.getElementById("myInput");
    filter = input.value.toUpperCase();
    div = document.getElementById("myDropdown");
    a = div.getElementsByTagName("a");
    for (i = 0; i < a.length; i++) {
        if (a[i].innerHTML.toUpperCase().indexOf(filter) > -1) {
            a[i].style.display = "";
        } else {
            a[i].style.display = "none";
        }
    }
}
</script>

				
</body>
</html>