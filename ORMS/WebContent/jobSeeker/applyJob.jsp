<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="..\css\commonStyle.css">				
<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<!--  redirect if job seeker is not signedIn -->

<c:if test="${jobSeeker==null }"> 
	 <c:redirect url ="../signIn.jsp"  />
</c:if>

<div style="margin:100px ; width:600px;" >
<form action="../ApplyJobServlet" method="post" >

<input type="hidden" name="jobId" value="${singleJobDescriptionForApply.jobId}"/>
<input type="hidden" name="jobSeekerId" value="${jobSeeker.id}"/>

	<div class="form-group row">
    <label for="staticEmail" class="col-sm-6 col-form-label" style="text-align:center ; " ><h4>Apply Job Confirmation</h4></label> 
  </div>

  <div class="form-group row">
    <label for="staticEmail" class="col-sm-2 col-form-label">Job Title</label>
    <div class="col-sm-10">
      <input type="text" readonly class="form-control-plaintext" id="staticEmail" value="${singleJobDescriptionForApply.title }">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="staticEmail" class="col-sm-2 col-form-label">Company Name</label>
    <div class="col-sm-10">
      <input type="text" readonly class="form-control-plaintext" id="staticEmail" value="${singleJobDescriptionForApply.companyName }">
    </div>
  </div>
  
  <div class="form-group row">
    <label for="staticEmail" class="col-sm-2 col-form-label">Expected Salary</label>
    <div class="col-sm-10">
      <input type="text"  name="expectedSalary"  id="staticEmail" placeholder="25000 BDT">
    </div>
  </div>
  
<input class="btn btn-primary " type="submit" value="Submit">  

</form>
</div>

</body>
</html>