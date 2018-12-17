<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="..\css\commonStyle.css">			
		
		<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">
		
</head>
<body>

<div class="card text-center">
  <div class="card-header">
    <ul class="nav nav-tabs card-header-tabs">
      <li class="nav-item">
        <a class="nav-link " href="jobSeekerStartPage.jsp">Dashboard</a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="profileOverview.jsp">Profile Overview</a>
      </li>						 
      <li class="nav-item">
        <a class="nav-link active" href="notifications.jsp">Notifications</a>
      </li>
      
       <li class="nav-item">
        <a class="nav-link " href="jobSeekerDashBoard.jsp"> All applied jobs</a>
      </li>
      
       <li class="nav-item">
        <a class="nav-link " href="savedJob.jsp"> Saved jobs</a>
       </li>
      
     
       <li class="nav-item">
        <a class="nav-link " href="updateProfile.jsp"> Update profile</a>
      </li>
      
       <li class="nav-item">
        <a class="nav-link " href="../company/follow.jsp">Followed Company</a>
      </li>
      
       <li class="nav-item">
        <a class="nav-link" href="../JobSeekerLogOutServlet">Log Out</a>
      </li>
    </ul>
  </div>
  <div class="card-body">
   	 <c:forEach var="recruiterNotificaion" items="${jobSeeker.recruiterNotificaions}"> 
			<a href="..\AcceptInvitationServlet?jobId=${recruiterNotificaion.job.jobId}" >
				     <c:choose>
				        <c:when test="${recruiterNotificaion.hasSeenStatus==1}"> 
				         			<b>${recruiterNotificaion}</b>
				         </c:when>
				         <c:otherwise>
          					${recruiterNotificaion}
         				</c:otherwise> 		
				     </c:choose>
		     </a>
		     <br>
	 </c:forEach>
   </div>
</div>

 

</body>
</html>