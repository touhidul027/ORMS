<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
  <%@ taglib prefix="myFunction" uri="MyFunctions" %>
  
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
		                
<form action="../UpdateCompanyProfile" method="post" >    
<c:set var="companyId" value="${recruiter.companyId}"></c:set>
 
<c:set var="company" value="${myFunction:getCompany(companyId)}"></c:set> 	

<input type="hidden" name="companyId" value="${companyId}" > 	
               
             <div class="form-group row">
                  <label for="username" class="col-4 col-form-label">Company Name </label> 
                    <div class="col-8">
                   <input id="username" name="companyName" value="${company.companyName}" placeholder="BJIT" class="form-control here" required="required" type="text">
                   </div>
             </div>
                              
            <div class="form-group row">
                   <label for="name" class="col-4 col-form-label">Company Address</label> 
                   <div class="col-8">
                    <input id="name" name="company_address" value="${company.company_address }" placeholder="eg. Uttara,Road 12,Sector-10" class="form-control here" type="text">
                   </div>
            </div>                            
                              
                   <div class="form-group row">
                    <label for="email" class="col-4 col-form-label"> Email* </label> 
                     <div class="col-8">
                       <input id="email" name="email" value="${company.email}"  placeholder="Email" class="form-control here" required="required" type="text">
                     </div>
                   </div>
                              
                              <div class="form-group row">
                                <label for="newpass" class="col-4 col-form-label">Cell phone Number  </label> 
                                <div class="col-8">
                                  <input id="newpass" name="cellPhoneNumber" value="${company.cellPhoneNumber}" placeholder="" class="form-control here" type="text">
                                </div>
                              </div> 
                              
                              <div class="form-group row">
                                <label for="website" class="col-4 col-form-label">Website</label> 
                                <div class="col-8">
                                  <input id="website" name="website" value="${company.website}" placeholder="website" class="form-control here" type="text">
                                </div>
                              </div>
                              
                              <div class="form-group row">
                                <label for="companySize" class="col-4 col-form-label">Company Size</label> 
                                <div class="col-8">
                                  <input id="companySize" name="size" value="${company.size}" placeholder="eg. 50-200" class="form-control here" type="text">
                                </div>
                              </div>
                              
                               <div class="form-group row">
                                 <label for="select" class="col-4 col-form-label">Company Type</label> 
                                <div class="col-8">
                                  <select id="select" name="industryType" class="custom-select">
                                    <option value="privately held company">privately held company</option>
                                    <option value="publicly held company">publicly held company</option>                                    
                                  </select>
                                </div>
                              </div>
                              
                               <div class="form-group row">
                                <label for="foundedYear" class="col-4 col-form-label">Founded Year</label> 
                                <div class="col-8">
                                  <input id="foundedYear" name="founded" value="${company.founded}" placeholder="e.g. 2000" class="form-control here" type="text">
                                </div>
                              </div>
                              
                              
                               <div class="form-group row">
                                <label for="headQuarters" class="col-4 col-form-label">Head Quarters</label> 
                                <div class="col-8">
                                  <input id="headQuarters" name="headQuarter" value="${company.headQuarter}" placeholder="japan" class="form-control here" type="text">
                                </div>
                              </div>
                              
                              <div class="form-group row">
                                <label for="publicinfo" class="col-4 col-form-label">Public Info</label> 
                                <div class="col-8">
                                  <textarea id="publicinfo" name="publicInfo" cols="40" rows="4" class="form-control">${company.publicInfo }</textarea>
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