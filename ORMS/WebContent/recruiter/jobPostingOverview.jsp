<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<title> Job Post Overview </title>
		<link rel="stylesheet" type="text/css" href="..\bootstrap\css\bootstrap.css">
	    <link rel="stylesheet" type="text/css" href="jobDescription.css">

	<style>
			 
					
	</style>
						
			<script> 
			</script>	
	</head>	
	
	 <body>	
	 
	             <div >
					 <a href="..\index.jsp"><h1>Home page</h1></a>
				</div>
	 			
	 			 <div >
					 <a href="jobPosterDashBoard.jsp"><h1>Your Dash board</h1></a>
				</div>
	 			
<div id="jobDescriptionA" >
					<div>
						<table border="0" cellpadding="0" cellspacing="0" align="center" width="750">
							<tbody>
									<tr>
										<td colspan="6">
										<table border="0" align="center" cellpadding="0" cellspacing="0" width="100%">
											<tbody><tr>
													<td width="73%" height="" align="left" valign="bottom" class="BDJApplicantsName">
														<!--Job Title Name:-->
														<h4>${jobPostingGeneralObj.jobPostingJobTitle}</h4>
													</td>
												 
											</tr>
									
											<tr>
												<td class="BDJNormalText04" align="left" valign="middle">
												<!--Comapany Name:-->										
													<div style="margin-left:50px ; " >${jobPostingGeneralObj.jobPostingCompanyName} </div>		 
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
					<c:if test="${jobPostingGeneralObj.jobPostingJobDescription!=null}" >					
					<hr size=2 noshade >
					
					<div id="jobRequirementDivA" class="divInfo" >
						<h5>Job Descriptions</h5>
							<div id="jobRequirementDescriptionA"  >
								 ${jobPostingGeneralObj.jobPostingJobDescription}
							</div>
					</div>
					</c:if>
					
					 
					<hr size=2 noshade >
					
					<div id="employementStatusA" class="divInfo" >
						<h5>Employee</h5>
						<c:forEach var="type" items="${jobPostingGeneralObj.jobPostingJobType}">
							<p>${type}</p>
						</c:forEach>	
							
					</div>
					
					<hr size=2 noshade >
					
					<div id="educationalRequirementA" class="divInfo" >
						<h5>Educational Requirements</h5>
							<p>${jobPostingGeneralObj.jobPostingEmployeeEducationLevel}</p>
					</div>
					
					<hr size=2 noshade >
					
					<div id="ExperienceRequirementA" class="divInfo" style="margin-left:10px;" >
						<h5>Experience Requirements</h5>
						<!-- Here the loop will go-->
						<!-- now just a single string for experience ,but later string array -->
							<p> ${jobPostingGeneralObj.jobPostingEmployeeExperience } </p>
					</div>
					
					<c:if test="${jobPostingGeneralObj.jobPostingAdditionalRequirementsinput!=null}">				
					<hr size=2 noshade >
					
					<div id="additionalRequirementsA" class="divInfo" >
					
						<h5>Additional Requirements</h5>
						<!-- Here the loop will go-->
						<div id="additionalRequirementsPointA" >
							 <ul style="margin-left:50px ; " >
								<li>${jobPostingGeneralObj.jobPostingAdditionalRequirementsinput}</li>
							 </ul>
						</div>
						
					</div>
					 </c:if>
					 
					 <c:if test="${jobPostingGeneralObj.jobPosterKeySkillsSelection!=null}">
						 <hr size=2 noshade >
						
						<div id="employementStatusA" class="divInfo" >
							<h5>Skills</h5>
							<c:forEach var="skill" items="${jobPostingGeneralObj.jobPosterKeySkillsSelection}">
								<p>${skill}</p>
							</c:forEach>	
								
						</div>
					 </c:if>
					 
					 
					 <c:if test="${jobPostingGeneralObj.jobPostingFacilities!=null}">
						 <hr size=2 noshade >
						
						<div id="employementStatusA" class="divInfo" >
							<h5>Facility</h5>
							<c:forEach var="facility" items="${jobPostingGeneralObj.jobPostingFacilities}">
								<p>${facility}</p>
							</c:forEach>	
								
						</div>
					 </c:if>
					 
					 
					 <c:if test="${jobPostingGeneralObj.jobPostingJobType!=null}">
						 <hr size=2 noshade >
						
						<div id="employementStatusA" class="divInfo" >
							<h5>Job Types</h5>
							<c:forEach var="type" items="${jobPostingGeneralObj.jobPostingJobType}">
								<p>${type}</p>
							</c:forEach>	
								
						</div>
					 </c:if>
					 
					<c:if test="${jobPostingGeneralObj.jobPostingJobLocation != null }"> 
					<hr size=2 noshade >					
					<div id="jobLocationA" class="divInfo" >
						<h5>Job Location</h5>
							<p style="margin-left:50px ; "  >${jobPostingGeneralObj.jobPostingJobLocation}</p>
					</div>
					</c:if>
					
					
					<hr size=2 noshade >
					
					<div id="" class="divInfo" >
						<h5>Salary</h5>
							<p style="margin-left:50px ; "  >${jobPostingGeneralObj.jobPostingSalary}</p>
					</div>
					
					<hr size=2 noshade >
					<hr size=2 noshade >
					
					<div id="" class="divInfo" >
						<h5>Company Information</h5>
							<p style="margin-left:50px ; "  >${jobPostingGeneralObj.jobPostingCompanyName}</p>
							<p style="margin-left:50px ; "  >${jobPostingGeneralObj.jobPostingCompanyEmail}</p>	
							<c:if test="${jobPostingGeneralObj.jobPostingCompanyCellPhoneNumber != null}" > <p style="margin-left:50px ; "  >${jobPostingGeneralObj.jobPostingCompanyCellPhoneNumber} </p></c:if>												
							<c:if test="${jobPostingGeneralObj.jobPostingCompanyAdress != null}" > <p style="margin-left:50px ; "  >${jobPostingGeneralObj.jobPostingCompanyAdress} </p></c:if>
						    <c:if test="${jobPostingGeneralObj.jobPostingCompanyWebsite != null}" >  <p style="margin-left:50px ; "  >Website : <a href="${jobPostingGeneralObj.jobPostingCompanyWebsite }"> ${jobPostingGeneralObj.jobPostingCompanyWebsite} </a> </p></c:if>
					</div>
			</div>				
		 </body>	
</html>	