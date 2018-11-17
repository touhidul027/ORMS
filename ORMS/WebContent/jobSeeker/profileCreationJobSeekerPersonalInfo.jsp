<!--
<!doctype html>

<html>

	<head>
		<title> Profile Job seekers </title>
	    <meta charset="utf-8" >
	<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">
	<link rel="stylesheet" type="text/css" href="..\css\profileCreationJobSeekerPersonalInfo.css">
			<style>
					
			</style>				
	</head>	
	<body>			
	<form action="../ProfileCreationJobSeekerPersonalInfoServlet" method="post" class="form-horizontal" role="form"  id="jobSeekerProfile" >
		
	-->
	
			<!-- make it at center  -->
		<div id="registrationForm" class=" " >
			<div class="container">
			<form action="../ProfileCreationJobSeekerPersonalInfoServlet" method="post" class="form-horizontal" role="form"  id="jobSeekerProfile" >
										
					<div class="form-group">
						<label for="register" class="col-sm-3 control-label"><h4>Personal Information</h4></label>
					</div>										
					
					<div class="form-group">
						<label for="firstName" class="col-sm-3 control-label">Name</label>
						<div class="col-sm-5">
							<input type="text" name="fullName" id="name" placeholder="Full Name" value="${jobSeeker.fullName}" readonly class="form-control" autofocus>
 						</div>
					</div>
					
					<div class="form-group">
						<label for="email" class="col-sm-3 control-label">Email</label>
						<div class="col-sm-5">
							<input type="email" name="email" id="email" placeholder="Email" value="${jobSeeker.email}" class="form-control" readonly>
						</div>
					</div>
					
					 
					 
					 <div class="form-group">
						<label for="email" class="col-sm-3 control-label">Adress</label>
						<div class="col-sm-5">
							<input type="text" name="address" id="address" placeholder="e.g Uttara , sector-11" class="form-control">
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
							<input type="text" name="cellPhoneNumber" id="cellPhoneNumber" placeholder="cell - phone number" class="form-control">
						</div>
					</div>
					
					
					<div class="form-group">
						<label for="email" class="col-sm-3 control-label">NID</label>
						<div class="col-sm-5">
							<input type="text" name="nidNumber" id="cell" placeholder="National ID card" class="form-control">
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