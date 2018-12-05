<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Job Description</title>

<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">

<style>
			 td{
				 padding-top:10px ; 
				 }				 
			
				p{
					margin-left: 50px ; 
				}	
		</style>

</head>
<body>
<c:remove var="jobSeeker"/>

<div class="card text-center">
  <div class="card-header">
    <ul class="nav nav-tabs card-header-tabs">
      <li class="nav-item">
        <a class="nav-link " href="recruiterDashBoard.jsp">Dashboard</a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="applications.jsp">Applicants application</a>
      </li>
      <li class="nav-item">
        <a class="nav-link " href="..\JobPostingStartingServlet"> Post a Job</a>
      </li>
       <li class="nav-item">
        <a class="nav-link active" href="..\JobPostingGetAllPostedJobsServlet"> My Posted Jobs</a>
      </li>
       <li class="nav-item">
        <a class="nav-link" href="..\RecruiterLogOutServlet">Log Out</a>
      </li>
    </ul>
  </div>
</div>		

	<div class="card text-center" style="width:700px;margin:50px ; " >
  <div class="card-header">
    <ul class="nav nav-tabs card-header-tabs">
      <li class="nav-item">
        <a class="nav-link active" href="#">Job Details</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="jobStatistics.jsp">Statistics</a>
      </li>
    </ul>
  </div>
  <div class="card-body">
  
    <div id="jobDescriptionA" style="text-align:left;" >
					<div>
						<table border="0" cellpadding="0" cellspacing="0" align="center" width="750">
							<tbody>
									<tr>
										<td colspan="6">
										<table border="0" align="center" cellpadding="0" cellspacing="0" width="100%">
											<tbody><tr>
													<td width="73%" height="" align="left" valign="bottom" class="BDJApplicantsName">
														<!--Job Title Name:-->
														<h4>${job.title}</h4>
													</td>
												 
											</tr>
									
											<tr>
												<td class="BDJNormalText04" align="left" valign="middle">
												<!--Comapany Name:-->										
													<div style="margin-left:50px ; " >${job.companyName} </div>		 
												</td>
											</tr>
											</tbody>
										  </table>
										</td>
									</tr>
							</tbody>
						</table>
					</div>
					
					
					<br>
					<!-- 
					<hr size=2 noshade >
					<div id="vacancyA" class="divInfo" >
						<h5>Vacancy</h5>
						 <p>2</p>
					</div>
					
					<hr size=2 noshade >
					
					<div id="jobResponsibilitiesA" class="divInfo" >
						<h5>Job Responsibilities</h5>
						<div id="jobResponsibilitiesDescriptionA"  >

							hjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj
							hjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjhkkkkkkkk
							hkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk						 
							hjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjhkkkkkkkk
							hkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
							hjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj
							hjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjhkkkkkkkk
							hkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
							hjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj
							hjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjhkkkkkkkk
							hkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
							hjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj
							hjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjhkkkkkkkk
							hkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
						</div>
					</div>
					 -->
					<c:if test="${job.description!=null}" >					
					<hr size=2 noshade >
					
					<div id="jobRequirementDivA" class="divInfo" >
						<h5>Job Descriptions</h5>
							<div id="jobRequirementDescriptionA"  style="margin-left:50px ; " >
								 ${job.description}
							</div>
					</div>
					</c:if>
					
					 
					
					
					<hr size=2 noshade >
					
					<div id="educationalRequirementA" class="divInfo" >
						<h5>Educational Requirements</h5>
							<p>${job.educationLevel}</p>
					</div>
					
					<hr size=2 noshade >
					
					<div id="ExperienceRequirementA" class="divInfo" style="margin-left:10px;" >
						<h5>Experience Requirements</h5>
						<!-- Here the loop will go-->
						<!-- now just a single string for experience ,but later string array -->
							<p> ${job.experience } </p>
					</div>
					
					<c:if test="${job.additionalRequirement!=null}">				
					<hr size=2 noshade >
					
					<div id="additionalRequirementsA" class="divInfo" >
					
						<h5>Additional Requirements</h5>
						<!-- Here the loop will go-->
						<div id="additionalRequirementsPointA" >
							 <ul style="margin-left:50px ; " >
								<li>${job.additionalRequirement}</li>
							 </ul>
						</div>
						
					</div>
					 </c:if>
					 
					 <c:if test="${job.skills!=null}">
						 <hr size=2 noshade >
						
						<div id="employementStatusA" class="divInfo" >
							<h5>Skills</h5>
							<c:forEach var="skill" items="${job.skills}">
								<p>${skill}</p>
							</c:forEach>	
								
						</div>
					 </c:if>
					 
					 
					 <c:if test="${job.facilities!=null}">
						 <hr size=2 noshade >
						
						<div id="employementStatusA" class="divInfo" >
							<h5>Facility</h5>
							<c:forEach var="facility" items="${job.facilities}">
								<p>${facility}</p>
							</c:forEach>	
								
						</div>
					 </c:if>
					 
					 
					 <c:if test="${job.jobType!=null}">
						 <hr size=2 noshade >
						
						<div id="employementStatusA" class="divInfo" >
							<h5>Job Types</h5>
							<c:forEach var="type" items="${job.jobType}">
								<p>${type}</p>
							</c:forEach>	
								
						</div>
					 </c:if>
					 
					<c:if test="${job.location != null }"> 
					<hr size=2 noshade >					
					<div id="jobLocationA" class="divInfo" >
						<h5>Job Location</h5>
							<p style="margin-left:50px ; "  >${job.location}</p>
					</div>
					</c:if>
					
					
					<hr size=2 noshade >
					
					<div id="" class="divInfo" >
						<h5>Salary</h5>
							<p style="margin-left:50px ; "  >${job.salary}</p>
					</div>
					
					<hr size=2 noshade >
					<hr size=2 noshade >
					
					<div id="" class="divInfo" >
						<h5>Company Information</h5>
							<p style="margin-left:50px ; "  >${job.companyName}</p>
							<p style="margin-left:50px ; "  >${job.companyEmail}</p>	
							<c:if test="${job.companyCellPhoneNumber != null}" > <p style="margin-left:50px ; "  >${job.companyCellPhoneNumber} </p></c:if>												
							<c:if test="${job.companyAddress != null}" > <p style="margin-left:50px ; "  >${job.companyAddress} </p></c:if>
						    <c:if test="${job.website != null}" >  <p style="margin-left:50px ; "  >Website : <a href="${job.website }"> ${job.website} </a> </p></c:if>
					</div>
			</div>
  </div>
   
</div>
</body>
</html>