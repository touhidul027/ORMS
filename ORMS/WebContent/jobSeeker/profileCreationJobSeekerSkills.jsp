<!-- 
<!doctype html>

<html>

	<head>
		<title> Profile Job seekers </title>
	    <meta charset="utf-8" >
	<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">
	<link rel="stylesheet" type="text/css" href="..\css\profileCreationJobSeekerSkills.css">

			<style>
					 
			</style>	
			
				
	</head>	
	
	<body>	
	
	-->		
	<!-- make it at center  -->
		<div id="profileOfJobSeekerForm" class=" " >
			<div class="container">
				<form action="../ProfileCreationJobSeekerSkillsServlet" method="post" class="form-horizontal" role="form"  id="jobSeekerProfile" >
					
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