<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	
		<title> Note to self </title>
	    <meta charset="utf-8" >
		
		<link rel="stylesheet" type="text/css" href="..\css\commonStyle.css">			
		
		<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">
		
        <link rel="stylesheet" type="text/css" href="..\css\jobSeekerStartPageHeader.css">		

		
		<link rel="stylesheet" type="text/css" href="..\css\generalSearch.css">	
		<link rel="stylesheet" type="text/css" href="..\css\mainFooter.css">
		
		<script src="bootstrap\js\bootstrap.js" > </script> 
		<link rel="stylesheet" type="text/css" href="..\css\commonStyle.css">			
		<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">
		<link rel="stylesheet" type="text/css" href="..\css\generalSearch.css">	
		<link rel="stylesheet" type="text/css" href="..\css\mainFooter.css">	
 		<link rel="stylesheet" type="text/css" href="..\css\jobSeekerStartPageHeader.css"> 				
		<link rel="stylesheet" type="text/css" href="..\css\profileCreationJobSeekerPersonalInfo.css">		
		<link rel="stylesheet" type="text/css" href="..\css\profileCreationJobSeekerEducation.css">
		<link rel="stylesheet" type="text/css" href="..\css\profileCreationJobSeekerExperience.css">		
		<link rel="stylesheet" type="text/css" href="..\css\profileCreationJobSeekerSummary.css">
		<link rel="stylesheet" type="text/css" href="..\css\profileCreationJobSeekerSkills.css">	
		<link rel="stylesheet" type="text/css" href="..\css\activity.css">		
			
 
 		<script src="..\js\profileCreationJobSeekerSkills.js" > </script> 
 		<script src="..\js\profileCreationJobSeekerActivity.js" ></script>
 		<script src="..\js\profileCreationJobSeekerInterests.js" ></script>
 		
 		
		<style>
			
		</style>
	</head>		
	
	<body>		
	    <%
			response.setHeader("Cache-Control", "no-cache , no-store , must-revalidate");	
				if (session.getAttribute("jobSeeker")== null){	
					response.sendRedirect("..\\signIn.jsp");		
				}	
		%>

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
        <a class="nav-link " href="..\JobPostingStartingServlet"> Post a Job</a>
      </li>
       <li class="nav-item">
        <a class="nav-link " href="jobSeekerDashBoard.jsp"> All applied jobs</a>
      </li>
      
       </li>
       <li class="nav-item">
        <a class="nav-link active" href="../ProfileCreationJobSeekerServlet"> Update profile</a>
      </li>
      
       <li class="nav-item">
        <a class="nav-link" href="../JobSeekerLogOutServlet">Log Out</a>
      </li>
    </ul>
  </div>
  
  <div class="card-body">
    <h5 class="card-title">Update Existed Profile</h5>
    
    <hr size=2 noshade >
    <div>
			<div class="container" style="text-align:left;" >
			<form action="../UpdateProfileServlet" method="post" class="form-horizontal" role="form"  id="jobSeekerProfile" >
										
					<div class="form-group">
						<label for="register" class="col-sm-3 control-label"><h4>Personal Information</h4></label>
					</div>										
					
					<div class="form-group">
						<label for="firstName" class="col-sm-3 control-label">Name</label>
						<div class="col-sm-5">
							<input type="text" name="fullName" id="name" placeholder="Full Name" value="${jobSeeker.fullName}"  class="form-control" autofocus>
 						</div>
					</div>
					
					<div class="form-group">
						<label for="email" class="col-sm-3 control-label">Email</label>
						<div class="col-sm-5">
							<input type="email" name="email" id="email" placeholder="Email" value="${jobSeeker.email}" class="form-control" readonly>
						</div>
					</div>
					
					 
					 
					 <div class="form-group">
						<label for="email" class="col-sm-3 control-label">Address</label>
						<div class="col-sm-5">
							<input type="text" name="address" id="address" placeholder="e.g Uttara , sector-11" value="${jobSeeker.address}" class="form-control">
						</div>
					</div>
					
					<div class="form-group">
						<label for="gender" class="col-sm-3 control-label">Gender</label>
						<div class="col-sm-5">
							<select name="gender"    style="width:200px ;" >
							  <option value="male" >Male</option>
							  <option value="female" >Female</option>							  
							</select>
						</div>						
					</div>
					 
					<div class="form-group">
						<label for="email" class="col-sm-3 control-label">Cell</label>
						<div class="col-sm-5">
							<input type="text" name="cellPhoneNumber" id="cellPhoneNumber" placeholder="cell - phone number" value="${jobSeeker.cellPhoneNumber.get(0)}" class="form-control">
						</div>
					</div>
					
					
					<div class="form-group">
						<label for="email" class="col-sm-3 control-label">NID</label>
						<div class="col-sm-5">
							<input type="text" name="nidNumber" id="cell" placeholder="National ID card" value="${jobSeeker.nid}" class="form-control">
						</div>
					</div>									  	
			<hr size=2 noshade >
			<div class="form-group">
						<label for="register" class="col-sm-3 control-label"><h4>Education</h4></label>
					</div>										
					
					<div class="form-group">
						<label for="email" class="col-sm-3 control-label">Level of Education</label>
						<div class="col-sm-5">
							<select class="col-sm-5" name="jobSeekerEducationLevel"   style="width:200px ;" >
							  <option value="masterLevel" > Masters</option>
							  <option value="bachelorLevel" > Bachelors</option>	
							  <option value="diplomaLevel" > Diploma</option>							  
							  <option value="highSchoolLevel" > High School</option>							  						
							</select>
 						</div>												
					</div>
					
					<div class="form-group">
						<label for="email" class="col-sm-3 control-label">Organization Name</label>
						<div class="col-sm-5">
						
							<input type="text" id="organizationName" name="jobSeekerEducationalInstituition" value="${jobSeeker.education.get(0).jobSeekerEducationalInstituition}"  placeholder="eg. IUBAT,BUET"  class="form-control">
						</div>
					</div>
					
					<div class="form-group">
						<label for="firstName" class="col-sm-3 control-label">Department</label>
						<div class="col-sm-5">
							<input type="text" id="department" name="jobSeekerEducationalDepartment" value="${jobSeeker.education.get(0).jobSeekerEducationalDepartment}" placeholder="Your department eg. CSE department" class="form-control" autofocus>
 						</div>
					</div>
										
					
					<div class="form-group"  >
						<label for="email" class="col-sm-3 control-label">Duration</label>
						<div class="col-sm-5"  >
							<input type="text" id="education"  name="jobSeekerEducationalDuration"  placeholder="duration" class="form-control">						
						</div>
						 
					</div>					 
				<hr size=2 noshade >
			<div class="form-group">
						<label for="register" class="col-sm-3 control-label"><h4>Experience</h4></label>
					</div>										
					
					 
					
					<div class="form-group">
						<label for="organizationName" class="col-sm-3 control-label">Organization Name</label>
						<div class="col-sm-5">
							<input type="text" id="organizationName" name="jobSeekerOrganizationName" placeholder="Bit Mascot" class="form-control">
						</div>
					</div>
					
					<div class="form-group">
						<label for="firstName" class="col-sm-3 control-label">Designation</label>
						<div class="col-sm-5">
							<input type="text" id="department" name="jobSeekerDesignation"  placeholder="Junior Java Developer" class="form-control" autofocus>
 						</div>
					</div>
										
					
					<div class="form-group">
						<label for="jobSeekerEmploymentDuration" class="col-sm-3 control-label">Employment duration</label>
						<div class="col-sm-7" style="height:30px ; " >
							<select class="col-sm-5" name="jobSeekerEmploymentDuration"    >
							  <option value="0" > 0 Year</option>
							  <option value="1" > 1 Year</option>
							  <option value="2" > 2 years </option>	
							  <option value="3" > 3 years </option>							  
							  <option value="4" > 4 years </option>							  						
							</select>
 						</div>
					</div>					 
				 
					 <div class="form-group">
						<label for="email" class="col-sm-3 control-label">Project Name</label>
						<div class="col-sm-5">
							<input type="text" id="jobSeekerProjectName" name="jobSeekerProjectName" placeholder="Prism ERP" class="form-control">
						</div>
					</div>	
					
				    
				<hr size=2 noshade >
				<div class="form-group">
						<label for="email" class="col-sm-3 control-label"><h4>Skills </h4> </label>
						
						<div class="col-sm-5">
							<input type="text" name="jobSeekerSkillInput" id="jobSeekerSkillInput" placeholder="Enter a skill" class="form-control">
						</div>
						
						<div class="col-sm-3">
							<input type="button" class="btn btn-default" id="skillAddButton" onclick="skillAddingFunction()" value="Add Skill"></button>
						</div>
					</div>
					
					 <div id="skillsList" class="col-sm-6" >
						<p>your skill/skills list :</p>
				
						   <select id="jobSeekerSkillsList" name="jobSeekerSkillsList" class="mdb-select md-form" multiple searchable="Search here..">							  
							</select>
						  
					</div>
					
				   
				<hr size=2 noshade >	
				    <div class="form-group">
						<label for="jobSeekerActivityInput" class="col-sm-3 control-label"><h4>Activities </h4> </label>
						
						<div class="col-sm-5">
							<input type="text" name="jobSeekerActivityInput" id="jobSeekerActivityInput" placeholder="Enter a activity" class="form-control">
						</div>
						
						<div class="col-sm-3">
							<input type="button" class="btn btn-default" id="activityAddButton" onclick="activityAddingFunction() ; " value="Add Skill"></button>
						</div>
					</div>
					
					 <div id="activityList" class="col-sm-6" >
						<p>your activity list :</p>
				
						   <select id="jobSeekeractivityList" name="jobSeekerActivityLists" class="mdb-select md-form" multiple searchable="Search here..">							  
						   </select>
						  
					</div>
					
				  
				<hr size=2 noshade >
				 <div class="form-group">
						<label for="email" class="col-sm-3 control-label"><h4> Interests </h4> </label>
						
						<div class="col-sm-5">
							<input type="text" name="jobSeekerInterestInput" id="jobSeekerInterestInput" placeholder="Enter an interest" class="form-control">
						</div>
						
						<div class="col-sm-3">
							<input type="button" class="btn btn-default" id="interestAddButton" onclick="interestAddingFunction()" value="Add Skill"></button>
						</div>
					</div>
					
					 <div id="interestsList" class="col-sm-6"  style="border-style:none ;  width:400px ; background-color:linen ; " >
						<p>your interests list :</p>
				
						   <select id="jobSeekerInterestsList" name="jobSeekerInterestsList"  multiple style="border-style:none ;border:none ;   width:400px ;height:300px ;"> 
						   </select>
						  
					</div>
					
				   
					
					<hr size=2 noshade >
					
					<div class="col-sm-5 col-sm-offset-3">	
						<h3>Upload Your Picture</h3>
					</div>
					
							<div class="form-group">
									<div class="col-sm-5 col-sm-offset-3">			
										<p><input type="file"  accept="image/*" name="image" id="file"  name="imageInput" onchange="loadFile(event)" style="display: none;background-color:linen ; "></p>
										<p><label for="file" style="cursor: pointer;background-color:linen ;">Upload Image</label></p>
										<p><img id="output" width="200" /></p>
									</div>
							</div>
						
							<script>
								var loadFile = function(event) {
									var image = document.getElementById('output');
									image.src = URL.createObjectURL(event.target.files[0]);
								};
							</script>	
							
					<div class="form-group">
						<label for="email" class="col-sm-5 control-label">Tell Something About Yourself </label>
						
						 <div class="col-sm-5">
							<textarea type="text" id="candidateSummary"   name="jobSeekerSummary" placeholder="Sell Yourself" class="form-control" ></textarea>
						</div>					
					</div>					 				 			 									   
					
					<div class="form-group">
						<div class="col-sm-5 col-sm-offset-3">
							<input type="submit" class="btn btn-default" id="submitButton" value="Update"></button>
						</div>
					</div>
					
				</form> <!-- /form -->
			</div> <!-- ./container -->
		</div>
    
  </div>
</div>		

		
		
	
		
		
</body>
	
</html>
