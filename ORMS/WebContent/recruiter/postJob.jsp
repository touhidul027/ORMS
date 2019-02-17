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
  
  <form action="../PostJob" method="post" > 
  
  <div class="card-body">
     <div class="container">
	<div class="row">
		<div class="col-md-9">
		    <div class="card">
		        <div class="card-body">
		            <div class="row">
		                <div class="col-md-12">
		                    <h4>About Job</h4>
		                    <hr>
		                </div>
		            </div>
		            <div class="row">
		                <div class="col-md-12">		             
                              <div class="form-group row">
                                <label for="title" class="col-4 col-form-label">Job Title*</label> 
                                <div class="col-8">
                                  <input id="title" name="title" placeholder="Job Title" class="form-control here" required="required" type="text">
                                </div>
                              </div>
                              <div class="form-group row">
                                <label for="companyName" class="col-4 col-form-label">Company Name</label> 
                                <div class="col-8">
                                  <input id="companyName" name="companyName"  placeholder="Company Name" class="form-control here" type="text">
                                </div>
                              </div>
                              <div class="form-group row">
                                <label for="location" class="col-4 col-form-label">Job Location</label> 
                                <div class="col-8">
                                  <input id="location" name="location"  placeholder="Job Location" class="form-control here" type="text">
                                </div>
                              </div>
                              
                              <div class="form-group row">
                                <label for="description" class="col-4 col-form-label">Job Description</label> 
                                <div class="col-8">
                                  <textarea id="description" name="description" cols="40" rows="4" class="form-control"></textarea>
                                </div>
                              </div>                             
                               
                              <div class="form-group row">
                                <label for="jobTitle" class="col-4 col-form-label">Enter Skill Name</label> 
                                <div class="col-8">
                                  <input id="skills" name="skills" placeholder="Java,php" class="form-control here" required="required" type="text">
                                </div>
                              </div>
                           
		                </div>
		            </div>
                
		        </div>
		    </div>
		</div>
	</div>
</div>

<div class="container">
	<div class="row">
		<div class="col-md-9">
		    <div class="card">
		        <div class="card-body">
		            <div class="row">
		                <div class="col-md-12">
		                    <h4>Employment Requirement</h4>
		                    <hr>
		                </div>
		            </div>
		            <div class="row">
		                <div class="col-md-12">
		                  <div class="form-group row">
                                <label for="education" class="col-4 col-form-label">Level of Education</label> 
                                <div class="col-8">
                              <select  name="educationLevel"    >
							  <option value="masterLevel" > Masters</option>
							  <option value="bachelorLevel" > Bachelors</option>	
							  <option value="diplomaLevel" > Diploma</option>							  
							  <option value="highSchoolLevel" > High School</option>							  						
							</select>
                                </div>
                            </div>
                             <div class="form-group row">
                                <label for="experience" class="col-4 col-form-label">Job Experience</label> 
                                <div class="col-8">
                              <select  name="experience" >
							  <option value="NA" >No Experience</option>
							  <option value="At least 1 Year" > At least 1 Year</option>
							  <option value="At least 2 Year" >At least 2 Year</option>	
							  <option value="At least 3 years" >At least 3 years</option>							  
							  <option value="At least 4 years" >At least 4 years</option>							  						
							  </select>
                                </div>
                              </div>   
                              
                              <div class="form-group row">
                                <label for="jobType" class="col-4 col-form-label">Job Type</label> 
                                <div class="col-8">
                     <input type="checkbox" name="jobTypes" checked="checked" value="Full Time Job" />Full Time Job<br>
							  <input type="checkbox" name="jobTypes" value="Part Time Job" />Part Time Job<br>
							  <input type="checkbox" name="jobTypes" value="Contractual Job" />Contractual Job <br>
							  <input type="checkbox" name="jobTypes" value="Remote Job Full Time" />Remote Job Full Time <br>
							  <input type="checkbox" name="jobTypes" value="Remote Job Part Time" />Remote Job Part Time <br>
                                 </div>
                              </div>  
                              
                                            
		                </div>
		            </div>               
		        </div>
		    </div>
		</div>
	</div>
</div>

<div class="container">
	<div class="row">
		<div class="col-md-9">
		    <div class="card">
		        <div class="card-body">
		            <div class="row">
		                <div class="col-md-12">
		                    <h4>Compenation and Benefits</h4>
		                    <hr>
		                </div>
		            </div>
		            <div class="row">
		                <div class="col-md-12">
		          	 <div class="form-group row">
                           <label for="salary" class="col-4 col-form-label">Salary</label> 
                                <div class="col-8">
                                  <input id="salary" name="salary"  class="form-control here" required="required" type="text">
                                </div>
                      </div>
                              
					 <div class="form-group row">
                           <label for="salaryReview" class="col-4 col-form-label">Salary Review </label> 
                             <div class="col-8">
                              <select  name="salaryReview"  style="width:400px ;height:40px;" >							  
							  <option value="Based on Experience" > Based on Experience </option>
							  <option value="Yearly" > Yearly</option>
							  <option value="Half Yearly" >Half Yearly</option>	
							  <option value="Quarter Yearly" >Quarter Yearly</option>							  
							</select>  
                             </div>
                      </div> 
				
				
				<div class="form-group row">
                           <label for="facilities" class="col-4 col-form-label">Facilities </label> 
                      <div class="col-sm-5" id="facilities" style="float:left" >
							  <input type="checkbox" name="facilities" value="Lunch Facilities: Full Subsidize" />Lunch Facilities: Full Subsidize<br>
							  <input type="checkbox" name="facilities" value="Health Insurance " /> Health Insurance  <br>
							  <input type="checkbox" name="facilities" value="Salary Review: Yearly" />Salary Review: Yearly <br>
							  <input type="checkbox" name="facilities" value="Festival Bonus: 2 Times" />Festival Bonus: 2 Times <br>
							  <input type="checkbox" name="facilities" value="Yearly Official Tour" />Yearly Official Tour <br>
							  <input type="checkbox" name="facilities" value="Friendly work environment" />Friendly work environment <br>
							  <input type="checkbox" name="facilities" value="Competitive salary & benefits" />Competitive salary & benefits <br>
							  <input type="checkbox" name="facilities" value="Opportunity for Career Growth" />Opportunity for Career Growth. <br>
							  <input type="checkbox" name="facilities" value="Provident fund" />Provident fund <br>
							  <input type="checkbox" name="facilities" value="Friendly environment" />Friendly environment <br>
 					 </div>		       
                  </div> 
                  
                   <div class="form-group row">
                                <label for="additionalRequirement" class="col-4 col-form-label">Additional Requirement</label> 
                                <div class="col-8">
                                  <textarea id="additionalRequirement" name="additionalRequirement" cols="40" rows="4" class="form-control"></textarea>
                                </div>
                              </div>  
                              
 	                </div>
		            </div>               
		        </div>
		    </div>
		</div>
	</div>
</div>

<div class="container">
	<div class="row">
		<div class="col-md-9">
		    <div class="card">
		        <div class="card-body">
		            <div class="row">
		                <div class="col-md-12">
		                    <h4> Company Information</h4>
		                    <hr>
		                </div>
		            </div>
		            <div class="row">
		                <div class="col-md-12">		
		                             
                              <div class="form-group row">
                                <label for="companyAddress" class="col-4 col-form-label"> Company Address </label> 
                                <div class="col-8">
                                  <input id="companyAddress" name="companyAddress" placeholder="" class="form-control here" required="required" type="text">
                                </div>
                              </div>     
                                
                              <div class="form-group row">
                                <label for="email" class="col-4 col-form-label">Email </label> 
                                <div class="col-8">
                                  <input id="email" name="email" placeholder="" class="form-control here" required="required" type="text">
                                </div>
                              </div>
                              
                              <div class="form-group row">
                                <label for="cell" class="col-4 col-form-label">Cell phone Number </label> 
                                <div class="col-8">
                                  <input id="cell" name="cell" placeholder="" class="form-control here"  type="text">
                                </div>
                              </div>       
                              
                               <div class="form-group row">
                                <label for="webSite" class="col-4 col-form-label">WebSite </label> 
                                <div class="col-8">
                                  <input id="webSite" name="webSite" placeholder="" class="form-control here"  type="text">
                                </div>
                              </div>  
                              
          <input class="btn btn-primary" type="submit" value="Post">
                                                                       
	       
	        </div>
		            </div>
                
		        </div>
		    </div>
		</div>
	</div>
</div>
  </div>
  
  </form>	 
  
</div>		
				
</body>
</html>