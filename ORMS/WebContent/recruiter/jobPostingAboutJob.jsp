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
	
<div class="card-header">
    <ul class="nav nav-tabs card-header-tabs">
      <li class="nav-item">
      
      	<progress value="40" max="100" style="width:700px;" >
        </progress>
      	
      </li>
         
    </ul>
  </div>
				
     <div id="" >
			<div class="container">
				<form class="form-horizontal"   role="form"  action="../JobPostingAboutJobServlet" method="post" >
						
					<div class="form-group">
						<label for="register" class="col-sm-3 control-label"><h4>About the Job</h4></label>
					</div>
					
					<div class="form-group">
						<label for="email" class="col-sm-3 control-label">Job Title</label>
						<div class="col-sm-5">
						<!-- Before submitting test the validity by javaScript -->
							<input type="text" id="email"  name="jobPostingJobTitle" placeholder="Job Title" class="form-control" required="required"  >
						</div>
					</div>
					
					<div class="form-group">
						<label for="firstName" class="col-sm-3 control-label">Company Name</label>
						<div class="col-sm-5">
							<input type="text" id="name" name="jobPostingCompanyName"  placeholder="Company Name" class="form-control" autofocus required="required">
 						</div>
					</div>
					
					 <div class="form-group">
						<label for="firstName" class="col-sm-3 control-label">Job Location</label>
						<div class="col-sm-5">
							<input type="text" id="name" name="jobPostingJobLocation"  placeholder="Job Location" class="form-control" autofocus  >
 						</div>
				 	</div>
					
					 <div class="form-group">
						<label for="firstName" class="col-sm-3 control-label">Job Description</label>
						<div class="col-sm-5"  >
							<textarea rows="8" type="password" id="name" name="jobPostingJobDescription"  placeholder="Job Description" class="form-control" autofocus  > </textarea>
 						</div>
				 	</div>
					 
					
					<div class="form-group" >
						 <div class="col-sm-5"  >
							 <input class="col-sm-5" type="text" id="jobPostingKeySkillInput" name="jobPostingKeySkillInput"  placeholder=""   autofocus  >
							 <input type="button" class="btn btn-default" id="keySkillAddButton" value="Add Skill" onclick="keySkillAddingFunction();"></button>
						</div>
						 
						 <div  class="col-sm-6" >
							<p>Key Skills :</p>			
						   <select id="jobPosterKeySkillsSelection" name="jobPosterKeySkillsSelection"   multiple  style="width:400px ; ">							  						  
						   </select>
						  
					     </div>
					
 				 	</div>
					 
					
				   <div class="form-group">
						<div class="col-sm-8 col-sm-offset-5">
							<input type="submit" class="btn btn-default" id="submitButton" style="width:200px;" value="Next"> 
						</div>
					</div>
					
				</form> <!-- /form -->
			</div> <!-- ./container -->
		</div>
		
</body>
</html>
		