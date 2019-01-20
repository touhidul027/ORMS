<div id="registrationForm" >
				<div class="container">
				<form class="form-horizontal"   role="form"  action="../JobPostingCompanyInfoServlet" method="post" >
						
					<div class="form-group">
						<label for="register" class="col-sm-6 control-label"><h4>Company Information</h4></label>
					</div>
					
					<div class="form-group">
						<label for="email" class="col-sm-3 control-label">Company Address </label>
						<div class="col-sm-5">
						<!-- Before submitting test the validity by javaScript -->
							<input type="text" id="email"  name="companyAddress" placeholder="e.g.Jahanara Gardens (1st Fl), Green Road, Dhaka - 1207" class="form-control"    >
						</div>
					</div>
					
					<div class="form-group">
						<label for="firstName" class="col-sm-3 control-label">Email</label>
						<div class="col-sm-5">
							<input type="email" id="name" name="jobPostingCompanyEmail"  placeholder=" " class="form-control" autofocus required="required">
 						</div>
					</div>
					
					<div class="form-group">
						<label for="firstName" class="col-sm-3 control-label">Cell phone Number</label>
						<div class="col-sm-5">
							<input type="text" id="name" name="jobPostingCompanyCellPhoneNumber"  placeholder="" class="form-control" autofocus >
 						</div>
					</div>
					
					<div class="form-group">
						<label for="firstName" class="col-sm-3 control-label">WebSite</label>
						<div class="col-sm-5">
							<input type="text" id="name" name="jobPostingCompanyWebsite"  placeholder=" " class="form-control" autofocus >
 						</div>
					</div>
					
				   <div class="form-group">
						<div class="col-sm-5 col-sm-offset-3">
							<input type="submit" class="btn btn-default" id="submitButton" value="Submit"> 
						</div>
					</div>
					
				</form> <!-- /form -->
			</div> <!-- ./container -->
		</div>