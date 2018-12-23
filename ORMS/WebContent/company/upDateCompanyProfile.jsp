<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Company Profile</title>
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
        <a class="nav-link active" href="#">Dashboard</a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="applications.jsp">Applicants application</a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="..\JobPostingStartingServlet"> Post a Job</a>
      </li>
      
       <li class="nav-item">
        <a class="nav-link " href="..\JobPostingGetAllPostedJobsServlet"> My Posted Jobs</a>
      </li>
       
       <li class="nav-item">
        <a class="nav-link " href="..\company\companyProfile.jsp"> Company Profile</a>
       </li>
      
      <li class="nav-item">
        <a class="nav-link " href="..\company\upDateCompanyProfile.jsp"> Update Company Profile</a>
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
 
 <h5>
 Updating will be performed here.
 

<c:if test="${pageContext.request.method == 'POST'}"> 
	 <c:out value="${param.companyName}" />
	 <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost/fshdb"  
     user="root"  password=""/>  
     
	<sql:update dataSource="${db}" var="count">  
	 REPLACE INTO Students VALUES (154,'Nasreen', 'jaha', 25);  
	</sql:update>  
	 
</c:if>

 </h5>
 
<div class="container">
	<div class="row">
		<div class="col-md-9">
		    <div class="card">
		        <div class="card-body">
		            <div class="row">
		                <div class="col-md-12">
		                    <h4>Update Company Profile</h4>
		                    <hr>
		                </div>
		            </div>
		            <div class="row">
		                <div class="col-md-12">
		                    <form action="upDateCompanyProfile.jsp" method="post" >
		                 
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost/fshdb"  
     user="root"  password=""/>  
  
<sql:query dataSource="${db}" var="rs">  
	SELECT * from Students;  
</sql:query>  
   
		                    
                              <div class="form-group row">
                                <label for="username" class="col-4 col-form-label">Company Name </label> 
                                <div class="col-8">
                                  <input id="username" name="companyName" placeholder="BJIT" class="form-control here" required="required" type="text">
                                </div>
                              </div>
                              <div class="form-group row">
                                <label for="name" class="col-4 col-form-label">Company Address</label> 
                                <div class="col-8">
                                  <input id="name" name="name" placeholder="eg. Uttara,Road 12,Sector-10" class="form-control here" type="text">
                                </div>
                              </div>
                             
                              
                              <div class="form-group row">
                                <label for="email" class="col-4 col-form-label">Email*</label> 
                                <div class="col-8">
                                  <input id="email" name="email" placeholder="Email" class="form-control here" required="required" type="text">
                                </div>
                              </div>
                              
                              <div class="form-group row">
                                <label for="newpass" class="col-4 col-form-label">Cell phone Number  </label> 
                                <div class="col-8">
                                  <input id="newpass" name="newpass" placeholder="" class="form-control here" type="text">
                                </div>
                              </div> 
                              
                              <div class="form-group row">
                                <label for="website" class="col-4 col-form-label">Website</label> 
                                <div class="col-8">
                                  <input id="website" name="website" placeholder="website" class="form-control here" type="text">
                                </div>
                              </div>
                              
                              <div class="form-group row">
                                <label for="companySize" class="col-4 col-form-label">Company Size</label> 
                                <div class="col-8">
                                  <input id="companySize" name="size" placeholder="eg. 50-200" class="form-control here" type="text">
                                </div>
                              </div>
                              
                               <div class="form-group row">
                                 <label for="select" class="col-4 col-form-label">Company Type</label> 
                                <div class="col-8">
                                  <select id="select" name="select" class="custom-select">
                                    <option value="privately held company">privately held company</option>
                                    <option value="publicly held company">publicly held company</option>                                    
                                  </select>
                                </div>
                              </div>
                              
                               <div class="form-group row">
                                <label for="foundedYear" class="col-4 col-form-label">Founded Year</label> 
                                <div class="col-8">
                                  <input id="foundedYear" name="size" placeholder="e.g. 2000" class="form-control here" type="text">
                                </div>
                              </div>
                              
                              
                               <div class="form-group row">
                                <label for="headQuarters" class="col-4 col-form-label">Head Quarters</label> 
                                <div class="col-8">
                                  <input id="headQuarters" name="size" placeholder="japan" class="form-control here" type="text">
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
                                  <button name="submit" type="submit" class="btn btn-primary">Update Profile</button>
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