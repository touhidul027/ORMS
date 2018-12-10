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
				    </c:forEach>
</body>
</html>