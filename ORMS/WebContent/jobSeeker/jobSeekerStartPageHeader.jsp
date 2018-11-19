 <!-- Make this word a little bit larger  , anchor to home page . -->
			
		
			
			<div class="row" id="companyName" >
				<div class="col-md-12">
				  Get Jobs
				</div>
			</div>			
					
		<div class="container">
			<div class="row">
			<div class="col-sm">
				Find jobs
			</div>
			<div class="col-sm">
				Post a job
			</div>
			
			<div class="col-sm">
				
			</div>
			<div class="col-sm">
				
			</div>
			
			<div class="col-sm">
				
			</div>
			
			<div class="col-sm">
				
			</div>
			
			<div class="col-sm">
				 
			</div>
			
			<div class="col-sm-4">
				 
				 <div class="dropdown">
					<button onclick="myFunction()" class="dropbtn"> ${jobSeeker.fullName }</button>
					  <div id="myDropdown" class="dropdown-content">
					  
	 					<form action="../ProfileCreationJobSeekerServlet" method="post" >
							<input type="submit" id="signInEmailSubmitButton" value="Update Profile" >
						</form>
							
						<a href="profileOverview.jsp">Profile Overview</a>
						<a href="#about">Dashboard</a>						
						<a href="../JobSeekerLogOutServlet">Log out</a>
					  </div>
					</div>
					
					 <script>
						/* When the user clicks on the button, 
						toggle between hiding and showing the dropdown content */
						function myFunction() {
							document.getElementById("myDropdown").classList.toggle("show");
						}

						// Close the dropdown if the user clicks outside of it
						window.onclick = function(event) {
						  if (!event.target.matches('.dropbtn')) {

							var dropdowns = document.getElementsByClassName("dropdown-content");
							var i;
							for (i = 0; i < dropdowns.length; i++) {
							  var openDropdown = dropdowns[i];
							  if (openDropdown.classList.contains('show')) {
								openDropdown.classList.remove('show');
							  }
							}
						  }
						}
					</script>
									
				</div>
			</div>
		</div>
		
		