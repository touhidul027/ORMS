<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Job Description</title>
<link rel="stylesheet" type="text/css" href="bootstrap\css\bootstrap.css">

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
	<div class="card text-center" style="width:700px;margin:50px ; " >
  <div class="card-header">
    <ul class="nav nav-tabs card-header-tabs">
      <li class="nav-item">
        <a class="nav-link active" href="#">Active</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="company/company.jsp?companyId=${singleJobDescriptionForApply.companyId}">Company Details</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#">Disabled</a>
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
														<h4>${singleJobDescriptionForApply.title}</h4>
													</td>
												 
											</tr>
									
											<tr>
												<td class="BDJNormalText04" align="left" valign="middle">
												<!--Comapany Name:-->										
													<div style="margin-left:50px ; " >${singleJobDescriptionForApply.companyName} </div>		 
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
					<c:if test="${singleJobDescriptionForApply.description!=null}" >					
					<hr size=2 noshade >
					
					<div id="jobRequirementDivA" class="divInfo" >
						<h5>Job Descriptions</h5>
							<div id="jobRequirementDescriptionA"  style="margin-left:50px ; " >
								 ${singleJobDescriptionForApply.description}
							</div>
					</div>
					</c:if>
					
					 
					
					
					<hr size=2 noshade >
					
					<div id="educationalRequirementA" class="divInfo" >
						<h5>Educational Requirements</h5>
							<p>${singleJobDescriptionForApply.educationLevel}</p>
					</div>
					
					<hr size=2 noshade >
					
					<div id="ExperienceRequirementA" class="divInfo" style="margin-left:10px;" >
						<h5>Experience Requirements</h5>
						<!-- Here the loop will go-->
						<!-- now just a single string for experience ,but later string array -->
							<p> ${singleJobDescriptionForApply.experience } </p>
					</div>
					
					<c:if test="${singleJobDescriptionForApply.additionalRequirement!=null}">				
					<hr size=2 noshade >
					
					<div id="additionalRequirementsA" class="divInfo" >
					
						<h5>Additional Requirements</h5>
						<!-- Here the loop will go-->
						<div id="additionalRequirementsPointA" >
							 <ul style="margin-left:50px ; " >
								<li>${singleJobDescriptionForApply.additionalRequirement}</li>
							 </ul>
						</div>
						
					</div>
					 </c:if>
					 
					 <c:if test="${singleJobDescriptionForApply.skills!=null}">
						 <hr size=2 noshade >
						
						<div id="employementStatusA" class="divInfo" >
							<h5>Skills</h5>
							<c:forEach var="skill" items="${singleJobDescriptionForApply.skills}">
								<p>${skill}</p>
							</c:forEach>	
								
						</div>
					 </c:if>
					 
					 
					 <c:if test="${singleJobDescriptionForApply.facilities!=null}">
						 <hr size=2 noshade >
						
						<div id="employementStatusA" class="divInfo" >
							<h5>Facility</h5>
							<c:forEach var="facility" items="${singleJobDescriptionForApply.facilities}">
								<p>${facility}</p>
							</c:forEach>	
								
						</div>
					 </c:if>
					 
					 
					 <c:if test="${singleJobDescriptionForApply.jobType!=null}">
						 <hr size=2 noshade >
						
						<div id="employementStatusA" class="divInfo" >
							<h5>Job Types</h5>
							<c:forEach var="type" items="${singleJobDescriptionForApply.jobType}">
								<p>${type}</p>
							</c:forEach>	
								
						</div>
					 </c:if>
					 
					<c:if test="${singleJobDescriptionForApply.location != null }"> 
					<hr size=2 noshade >					
					<div id="jobLocationA" class="divInfo" >
						<h5>Job Location</h5>
							<p style="margin-left:50px ; "  >${singleJobDescriptionForApply.location}</p>
					</div>
					</c:if>
					
					
					<hr size=2 noshade >
					
					<div id="" class="divInfo" >
						<h5>Salary</h5>
							<p style="margin-left:50px ; "  >${singleJobDescriptionForApply.salary}</p>
					</div>
					
					<hr size=2 noshade >
					<hr size=2 noshade >
					
					<div id="" class="divInfo" >
						<h5>Company Information</h5>
							<p style="margin-left:50px ; "  >${singleJobDescriptionForApply.companyName}</p>
							<p style="margin-left:50px ; "  >${singleJobDescriptionForApply.companyEmail}</p>	
							<c:if test="${singleJobDescriptionForApply.companyCellPhoneNumber != null}" > <p style="margin-left:50px ; "  >${singleJobDescriptionForApply.companyCellPhoneNumber} </p></c:if>												
							<c:if test="${singleJobDescriptionForApply.companyAddress != null}" > <p style="margin-left:50px ; "  >${singleJobDescriptionForApply.companyAddress} </p></c:if>
						    <c:if test="${singleJobDescriptionForApply.website != null}" >  <p style="margin-left:50px ; "  >Website : <a href="${singleJobDescriptionForApply.website }"> ${singleJobDescriptionForApply.website} </a> </p></c:if>
					</div>
			</div>



   <a href="ConditionCheckForApplyToJob" class="btn btn-primary">Apply This Job</a>
  </div>
</div>
</body>
</html>