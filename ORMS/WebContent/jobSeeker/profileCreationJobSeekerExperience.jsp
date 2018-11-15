
<!--  
<!doctype html>

<html>

	<head>
		<title> Profile Job seekers </title>
	    <meta charset="utf-8" >
		<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">
		<link rel="stylesheet" type="text/css" href="..\css\profileCreationJobSeekerExperience.css">

 
			<style>
					
			</style>	
			
				
	</head>	
	
	<body>			
	-->
	<!-- make it at center  -->
 		 ${jobSeekerPersonalInfoObj} <br>
 		 ${jobSeekerEducation } <br>
 		 
		<div id="profileOfJobSeekerForm" class=" " >
			<div class="container">
				<form action="../ProfileCreationJobSeekerExperienceServlet" method="post" class="form-horizontal" role="form"  id="jobSeekerProfile" >
										
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
					
				   <div class="form-group">
						<div class="col-sm-5 col-sm-offset-3">
							<input type="submit" class="btn btn-default" id="submitButton" value="Next Page"></button>
						</div>
					</div>
					
				</form> <!-- /form -->
			</div> <!-- ./container -->
		</div>
<!-- 	
	</body>
	
</html>
 -->