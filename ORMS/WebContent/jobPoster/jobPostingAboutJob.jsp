<div id="registrationForm" >
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
							<input type="submit" class="btn btn-default" id="submitButton" style="width:200px;" value="Save and Next"> 
						</div>
					</div>
					
				</form> <!-- /form -->
			</div> <!-- ./container -->
		</div>