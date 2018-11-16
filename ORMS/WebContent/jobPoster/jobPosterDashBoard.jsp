<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	response.setHeader("Cache-Control", "no-cache , no-store , must-revalidate");	
		if (session.getAttribute("aJobPoster")== null){		
			response.sendRedirect("..\\index.jsp");		
		}	
	%>
	<h1>This is the dash board of job poster contain</h1>
	<h3>Posting job</h3>
	<h3>My Posted Job</h3>
	

				<div >
					 <a href="..\JobPostingStartingServlet"><h1>Post a job</h1></a>
				</div>
				
				<div >
					 <a href="..\JobPostingGetAllPostedJobsServlet"><h1>My Posted Jobs</h1></a>
				</div>
				
				<div> 
					<form action="..\JobPostingLogOutServlet" method="post" >
						 <a> 
					       <input type="submit" value="Log Out" >
					     </a>
					</form>
				</div>
</body>
</html>