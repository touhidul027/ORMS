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
	
<div class="card text-center">
  <div class="card-header">
    <ul class="nav nav-tabs card-header-tabs">
      <li class="nav-item">
        <a class="nav-link " href="recruiterDashBoard.jsp"> Dashboard </a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="">Applicants application</a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href=""> Old Post a Job</a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link active" href="">Post a Job</a>
      </li>
      
       <li class="nav-item">
        <a class="nav-link " href=""> My Posted Jobs</a>
      </li>
       
       <li class="nav-item">
        <a class="nav-link " href=""> Company Profile</a>
       </li>
      
      <li class="nav-item">
        <a class="nav-link " href=""> Update Company Profile</a>
       </li> 
       
       <li class="nav-item">
        <a class="nav-link" href="..\RecruiterLogOutServlet">Log Out</a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" href="payment.jsp">Payment Demo</a>
      </li>
      
    </ul>
  </div>
  <div class="card-body">
    <h5 class="card-title">Special title treatment</h5>
    <div class="container">
	<div class="row">
		<div class="col-md-9">
		    <div class="card">
		        <div class="card-body">
		            <div class="row">
		                <div class="col-md-12">
		                    <h4>Your Profile</h4>
		                    <hr>
		                </div>
		            </div>
		            <div class="row">
		                <div class="col-md-12">
		                    <form>
                              <div class="form-group row">
                                <label for="username" class="col-4 col-form-label">Job Title*</label> 
                                <div class="col-8">
                                  <input id="username" name="jobPostingJobTitle" placeholder="Job Title" class="form-control here" required="required" type="text">
                                </div>
                              </div>
                              <div class="form-group row">
                                <label for="name" class="col-4 col-form-label">Company Name</label> 
                                <div class="col-8">
                                  <input id="name" name="jobPostingCompanyName"  placeholder="Company Name" class="form-control here" type="text">
                                </div>
                              </div>
                              <div class="form-group row">
                                <label for="lastname" class="col-4 col-form-label">Job Location</label> 
                                <div class="col-8">
                                  <input id="lastname" name="jobPostingJobLocation"  placeholder="Job Location" class="form-control here" type="text">
                                </div>
                              </div>
                              
                              <div class="form-group row">
                                <label for="publicinfo" class="col-4 col-form-label">Public Info</label> 
                                <div class="col-8">
                                  <textarea id="publicinfo" name="publicinfo" cols="40" rows="4" class="form-control"></textarea>
                                </div>
                              </div>                             
                              
                               
                               
                               
                              <div class="form-group row">
                                <div class="offset-4 col-8">
                                  <button name="submit" type="submit" class="btn btn-primary">Post Job</button>
                                </div>
                              </div>
                            </form>
		                </div>
		            </div>
		            
		        </div>
		    </div>
		</div>
	</div>
</div>
  </div>
</div>		
				
</body>
</html>