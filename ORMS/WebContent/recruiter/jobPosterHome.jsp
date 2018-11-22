<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- if not loged in send it back to home page  -->
<%
	response.setHeader("Cache-Control", "no-cache , no-store , must-revalidate");	
		if (session.getAttribute("aJobPoster")== null){		
			response.sendRedirect("..\\index.jsp");		
		}	
%>

<h1>Job Poster Home Page</h1>

				
				<div><a href="jobPosterDashBoard.jsp" > Your Dashboard </a></div>
				
				<div >
				<form action="..\JobPostingLogOutServlet" method="post" >
					 <a> 
					   <input type="submit" value="Log Out" >
					 </a>
				</form>
				</div>
				
</body>
</html>