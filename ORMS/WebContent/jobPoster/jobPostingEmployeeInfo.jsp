<div id="registrationForm" >
				<div class="container">
				<form action="../jobPostingEmployeeInfo" class="form-horizontal"   role="form"  action=" " method="post" >
					<div class="form-group">
						<label for="register" class="col-sm-6 control-label"><h4>Employement Requirement</h4></label>
					</div>
					
					<div class="form-group">
						<label for="email" class="col-sm-3 control-label">Level of Education</label>
						<div class="col-sm-5">
							<select class="col-sm-5" name="jobPostingEmployeeEducationLevel"   style="width:200px ;" >
							  <option value="masterLevel" > Masters</option>
							  <option value="bachelorLevel" > Bachelors</option>	
							  <option value="diplomaLevel" > Diploma</option>							  
							  <option value="highSchoolLevel" > High School</option>							  						
							</select>
 						</div>												
					</div>
					
					<div class="form-group">
						<label for="email" class="col-sm-3 control-label">Job Experience</label>
						<div class="col-sm-5">
							<select class="col-sm-5" name="jobPostingEmployeeExperience"   style="width:200px ;" >
							  <option value="NA" >No Experience</option>
							  <option value="At least 1 Year" > At least 1 Year</option>
							  <option value="At least 2 Year" >At least 2 Year</option>	
							  <option value="At least 3 years" >At least 3 years</option>							  
							  <option value="At least 4 years" >At least 4 years</option>							  						
							</select>
 						</div>												
					</div>
					
					<div class="form-group" style="margin-top:30px;margin-bottom:30px" >
						<label for="email"  class="col-sm-3 control-label">Job Type</label>
						<div class="col-sm-5" >
							  <input type="checkbox" name="jobPostingJobType" checked="checked" value="Full Time Job" />Full Time Job<br>
							  <input type="checkbox" name="jobPostingJobType" value="Part Time Job" />Part Time Job<br>
							  <input type="checkbox" name="jobPostingJobType" value="Contractual Job" />Contractual Job <br>
							  <input type="checkbox" name="jobPostingJobType" value="Remote Job Full Time" />Remote Job Full Time <br>
							  <input type="checkbox" name="jobPostingJobType" value="Remote Job Part Time" />Remote Job Part Time <br>
 						</div>												
					</div>
					
				   <div class="form-group">
						<div class="col-sm-6 col-sm-offset-4">
							<input type="submit" class="btn btn-default" id="submitButton" style="width:200px;" value="Save & Next"> 
						</div>
					</div>
					
				</form> <!-- /form -->
			</div> <!-- ./container -->
		</div>