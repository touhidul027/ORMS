<div id="registrationForm" >
				<div class="container">
				<form class="form-horizontal"   role="form"  action="../JobPostingBenefits" method="post" >
						
					
						
					<div class="form-group">
						<label for="register" class="col-sm-6 control-label"><h4>Compensation & Benefits </h4></label>
					</div>
					
					<div class="form-group">
						<label for="email" class="col-sm-3 control-label">Salary</label>
						<div class="col-sm-5">
						<!-- Before submitting test the validity by javaScript -->
							<input type="text" id="email"  name="jobPostingSalary" placeholder="e.g. Negotiable" class="form-control" required="required"  >
						</div>
					</div>
					
					<div class="form-group">

						<label for="firstName" class="col-sm-3 control-label">Salary Review</label>
						<div class="col-sm-5">
							<select  name="jobPostingSalaryReview"  style="width:400px ;height:40px;" >							  
							  <option value="Based on Experience" > Based on Experience </option>
							  <option value="Yearly" > Yearly</option>
							  <option value="Half Yearly" >Half Yearly</option>	
							  <option value="Quarter Yearly" >Quarter Yearly</option>							  
							</select>
 						</div>	
					</div>
					   
					 
					
					<div class="form-group" >
							<p style="margin-top:50px;" > Benefits</p>
						 
						 <div class="col-sm-5" id="facilities" >
							  <input type="checkbox" name="jobPostingFacilities" value="Lunch Facilities: Full Subsidize" />Lunch Facilities: Full Subsidize<br>
							  <input type="checkbox" name="jobPostingFacilities" value="Health Insurance " /> Health Insurance  <br>
							  <input type="checkbox" name="jobPostingFacilities" value="Salary Review: Yearly" />Salary Review: Yearly <br>
							  <input type="checkbox" name="jobPostingFacilities" value="Festival Bonus: 2 Times" />Festival Bonus: 2 Times <br>
							  <input type="checkbox" name="jobPostingFacilities" value="Yearly Official Tour" />Yearly Official Tour <br>
							  <input type="checkbox" name="jobPostingFacilities" value="Friendly work environment" />Friendly work environment <br>
							  <input type="checkbox" name="jobPostingFacilities" value="Competitive salary & benefits" />Competitive salary & benefits <br>
							  <input type="checkbox" name="jobPostingFacilities" value="Opportunity for Career Growth" />Opportunity for Career Growth. <br>
							  <input type="checkbox" name="jobPostingFacilities" value="Provident fund" />Provident fund <br>
							  <input type="checkbox" name="jobPostingFacilities" value="Friendly environment" />Friendly environment <br>
 						 </div>		
 				 	</div>
					 
					
				   <div class="form-group">
						<div class="col-sm-5 col-sm-offset-3">
							<input type="submit" class="btn btn-default" id="submitButton" value="Save and Next"> 
						</div>
					</div>
					
				</form> <!-- /form -->
			</div> <!-- ./container -->
		</div>