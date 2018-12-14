<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="myFunction" uri="MyFunctions" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost/fshdb"  
     user="root"  password=""/> 
     
<c:set var="jobSeekerId" value="${param.jobSeekerId}"></c:set>
<sql:query dataSource="${db}" var="rs">  
SELECT job_seeker.id,job_seeker.address,job_seeker.nid,sign_up.full_name,sign_up.email FROM job_seeker
JOIN sign_up ON sign_up.user_serial=job_seeker.id;
</sql:query>  
</body>
</html>