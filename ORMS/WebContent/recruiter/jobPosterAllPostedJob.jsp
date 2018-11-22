<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
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
	
	 			
	 			 <div >
					 <a href="jobPosterDashBoard.jsp"><h3>Your Dash board</h3></a>
				</div>
				
	<h1>ALL Job Posting</h1>
 			
	         <c:if test="${allPostedJobs !=null}">												
						<div id="employementStatusA" class="divInfo" >							
							<c:forEach var="obj" items="${allPostedJobs}">
								<h4><p>${obj.jobId}</p></h4>
								<h4><p>${obj.jobPostingJobTitle}</p></h4>
							    <h4><p><a href="feature.jsp"><h3>see details Buddy</h3></a></p></h4>
							</c:forEach>									
						</div>						
						 <hr size=2 noshade >
	         </c:if>
	        
	        <c:if test="${allPostedJobs==null ||empty allPostedJobs}">												
						 <h1>No Job Posted By him.</h1>
						 <hr size=2 noshade >
	        </c:if>
 			 
</body>
</html>