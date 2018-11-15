<!-- 
<!doctype html>

<html>

	<head>
		<title> Profile Job seekers </title>
	    <meta charset="utf-8" >
		
			<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">
			<link rel="stylesheet" type="text/css" href="..\css\profileOfJobSeeker.css">

			<style>
					
			</style>	
			
				
	</head>	
	
	<body>	
 -->	
			
	<!-- make it at center  -->
		<div id="profileOfJobSeekerForm" class=" " >
			<div class="container">
				<form action="../ProfileCreationJobSeekerInterestServlet" method="post" class="form-horizontal" role="form"  id="jobSeekerProfile" >					
					
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