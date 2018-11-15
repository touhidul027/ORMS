<!-- 
<!doctype html>

<html>

	<head>
		<title> Profile Job seekers </title>
	    <meta charset="utf-8" >
	<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">
		<link rel="stylesheet" type="text/css" href="..\css\profileCreationJobSeekerActivity.css">

			<style>
					 
			</style>	
			
				
	</head>	
	
	<body>
	
	-->
		 <script>
		
		 
		 </script>
		
	<!-- make it at center  -->
		<div id="profileOfJobSeekerForm" class=" " >
			<div class="container">
				<form action="../ProfileCreationJobSeekerActivityServlet" method="post" class="form-horizontal" role="form"  id="jobSeekerProfile" >					
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