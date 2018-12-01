 <!-- Make this word a little bit larger  , anchor to home page . -->
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
			
		
			
			<div class="row" id="companyName" >
				<div class="col-md-12">
				  Get Jobs
				</div>
			</div>			
					
		<div class="container">
			<div class="row">									
			<div class="col-sm-4">
				 
				 <div class="dropdown">
					<button onclick="myFunction()" class="dropbtn"> ${jobSeeker.fullName }</button>
					  <div id="myDropdown" class="dropdown-content">
					  
	 					<form action="../ProfileCreationJobSeekerServlet" method="post" >
							<input type="submit" id="signInEmailSubmitButton" value="Update Profile" >
						</form>
							
						<a href="profileOverview.jsp">Profile Overview</a>
						<a href="jobSeekerDashBoard.jsp">Dashboard</a>						
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
				
			<div class="col-sm-4" > 
				<div class="dropdown">
				<button onclick="notification()" class="dropbtn">Job  Notifications</button>
				  <div id="notify" class="dropdown-content">
				    <input type="text" placeholder="Search.." id="key" onkeyup="notificationFilter()">
				    
				    <c:forEach var="recruiterNotificaion" items="${jobSeeker.recruiterNotificaions}"> 
				         <a href="..\AcceptInvitationServlet?jobId=${recruiterNotificaion.job.jobId}" >
				         		<c:choose>
				         		<c:when test="${recruiterNotificaion.hasSeenStatus==1}"> 
				         			<b>${recruiterNotificaion}</b>
				         		</c:when>
				         		 <c:otherwise>
          						 	${recruiterNotificaion}
         						</c:otherwise>
				         		</c:choose>
				         </a>
				    </c:forEach>
			    </div>
				</div>				
			</div>

<script>
/* When the user clicks on the button,
toggle between hiding and showing the dropdown2 content */
function notification() {
    document.getElementById("notify").classList.toggle("show");
}

function notificationFilter() {
    var input, filter, ul, li, a, i;
    input = document.getElementById("key");
    filter = input.value.toUpperCase();
    div = document.getElementById("notify");
    a = div.getElementsByTagName("a");
    for (i = 0; i < a.length; i++) {
        if (a[i].innerHTML.toUpperCase().indexOf(filter) > -1) {
            a[i].style.display = "";
        } else {
            a[i].style.display = "none";
        }
    }
}
</script>
			
				
			</div>
			
			
			
				
		</div>
		
		

		
		