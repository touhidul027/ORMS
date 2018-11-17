<!--  
<!doctype html>

<html>

	<head>
		<title> Profile Job seekers </title>
	    <meta charset="utf-8" >
	<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">
	<link rel="stylesheet" type="text/css" href="..\css\profileCreationJobSeekerEducation.css">

			<style>
					 
			</style>	
			
				
	</head>	
	
	<body>		
	
	--------->
 	<!-- make it at center  -->
		<div id="profileOfJobSeekerForm" class=" " >
			<div class="container">
				<form action="../ProfileCreationJobSeekerEducationServlet" method="post" class="form-horizontal" role="form"  id="jobSeekerProfile" >
										
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
							<input type="text" id="organizationName" name="jobSeekerEducationalInstituition"  placeholder="eg. IUBAT,BUET" class="form-control">
						</div>
					</div>
					
					<div class="form-group">
						<label for="firstName" class="col-sm-3 control-label">Department</label>
						<div class="col-sm-5">
							<input type="text" id="department" name="jobSeekerEducationalDepartment" placeholder="Your department eg. CSE department" class="form-control" autofocus>
 						</div>
					</div>
										
					
					<div class="form-group"  >
						<label for="email" class="col-sm-3 control-label">Duration</label>
						<div class="col-sm-5"  >
							<input type="text" id="education" name="jobSeekerEducationalDuration" placeholder="duration" class="form-control">						
						</div>
						 
					</div>					 
				 
					 
					
				   <div class="form-group">
						<div class="col-sm-5 col-sm-offset-3">
							<input type="submit" class="btn btn-default" id="submitButton" value="Next"></button>
						</div>
					</div>
					
				</form> <!-- /form -->
			</div> <!-- ./container -->
		</div>
	
	<!-- 
	</body>
	
</html>
 -->