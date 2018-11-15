<!-- 
<!doctype html>

<html>

	<head>
		<title> Profile Job seekers </title>
	    <meta charset="utf-8" >
	<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">
	<link rel="stylesheet" type="text/css" href="..\css\profileCreationJobSeekerSummary.css">

			<style>
					 
			</style>	
			
				
	</head>	
	
	<body>			
	<!-- make it at center  -->
-->
	
		<div id="profileOfJobSeekerForm" class=" " >
			<div class="container">
				<form action="../ProfileCreationJobSeekerSummaryServlet" method="post" class="form-horizontal" role="form"  id="jobSeekerProfile"   enctype="multipart/form-data">	
				
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