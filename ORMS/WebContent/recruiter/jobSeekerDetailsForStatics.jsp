<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<<c:if test="${jobSeeker!=null}">
<div class="col-sm-6" style="">
    <div class="card">
      <div class="card-body">
        <div id="profileView">
			
	<div>
				<table border="0" cellpadding="0" cellspacing="0" align="center" width="">



					<tbody>
					<tr>
						<td colspan="6">
							<table border="0" align="center" cellpadding="0" cellspacing="0" width="100%">
								<tbody>
									<tr>
											<td width="73%" height="" align="left" valign="bottom" class="BDJApplicantsName">
											
												<!--Applicant's Name:-->
												  ${jobSeeker.fullName }
												
											</td>
										
										<td width="27%" rowspan="2" align="right" valign="bottom">
										<!--Photograph:-->
									
											<table width="140" height="140" border="0" align="center" cellpadding="0" cellspacing="7" bgcolor="#dadce1">
												<tbody><tr> 
												<td width="126" height="135" align="center" bgcolor="#e2e4e5" valign="middle"> 
												<img src="https://my.bdjobs.com/photos/3125001-3150000/1263146407l5g6j.jpg?var=2410201856" width="124" height="135">
												</td>
												</tr>
											</tbody></table>
									
										</td>
									</tr>
							
									<tr>
										<td class="BDJNormalText04" align="left" valign="middle">
										<!--Home Address:-->
											<c:if test="${jobSeeker.adress != null}">										
												Address : ${jobSeeker.adress}
											</c:if>	
											  
										<!--Home Phone:-->
										
										 <c:if test="${jobSeeker.cellPhoneNumber!=null and (not empty jobSeeker.cellPhoneNumber)}"> 
										 	<br> Hello :
										 	<c:forEach var="cell" items="${jobSeeker.cellPhoneNumber}" >
										 		${cell} 
										 	</c:forEach>
										 </c:if>	 
											 
											 
										<!--Email:-->
											 
											 <br>		
											 E-mail : ${jobSeeker.email }
											 
											
										</td>
									</tr>
								</tbody>
							  </table>
							</td>
							</tr>
					</tbody>
				</table>
			</div>			
					
 				<c:if test="${jobSeeker.objective != null }" >
 					<c:if test="${not empty jobSeeker.objective}">
						<hr size=2 noshade >
						<div id="careerObjective">
							<div id="careerObjectiveInfoHeader">
									<table>
										<tr>
											<td  class="BDJHeadline01"><u>Career Objective :</u></td>
										</tr>														
									</table>
							</div>
							
							
							<table id="careerObjectiveInfo" >
								<tr>
									<td>  ${jobSeeker.objective} </td>
								</tr>
								
								 
							</table>
							
						</div>
						</c:if>
					</c:if>				
					
					
						
				<c:if test="${jobSeeker.experience!=null && (not empty jobSeeker.experience)}">
						<hr size=2 noshade >
						
						<div id="experience">
							<div id="experienceInfoHeader">
									<table>
										<tr>
											<td  class="BDJHeadline01"><u>Experience:</u></td>
										</tr>														
									</table>
							</div>
							
			<c:forEach var="jobSeekerExperienceObj" items="${jobSeeker.experience}">
							
							<table id="experienceInfo" >
								<c:if test="${jobSeekerExperienceObj.jobSeekerOrganizationName != null }" >
									<tr>
										<td> Company Name : ${jobSeekerExperienceObj.jobSeekerOrganizationName }</td>
									</tr>
								</c:if>
								<c:if test="" ></c:if>
								
								<c:if test="${jobSeekerExperienceObj.jobSeekerDesignation != null}" >
									<tr>
										<td> Designation : ${jobSeekerExperienceObj.jobSeekerDesignation} </td>
									</tr>
								</c:if>	
								
								 <c:if test="${jobSeekerExperienceObj.jobSeekerEmploymentDuration!=null}" >							
									<tr>
										<td> Years : ${jobSeekerExperienceObj.jobSeekerEmploymentDuration} years </td>
									</tr>
								 </c:if>
								 
								<c:if test="${jobSeekerExperienceObj.jobSeekerProjectName != null}" >
									<tr> 
										<td><p>Project Name : ${jobSeekerExperienceObj.jobSeekerProjectName}</p></td>
									</tr>
								</c:if>
							</table>
							</c:forEach>
						</div>
					</c:if>											
											
											
												
 	<c:if test="${jobSeeker.education!=null && not empty jobSeeker.education}" >
					<hr size=2 noshade>
					
					<div id="educationSection">
						<div id="InfoHeader">
								<table>
									<tr>
										<td  class="BDJHeadline01"><u>Education :</u></td>
									</tr>														
								</table>
						</div>
					
						<table>
							<tr>
								  <td colspan="6" align="left" style="padding-left:5px;" class="BDJNormalText01">
										<table border="0" cellpadding="0" cellspacing="0" align="center" width="100%" style="border:1px solid #666666">
											 <c:forEach var="jobSeekerEducationObj" items="${jobSeeker.education}">
												<tbody>
														  <tr class="BDJNormalText02" >
															  <td width="25%" align="center" style="border-right:1px solid #666666"><strong>Education Level</strong></td>
															  <td width="25%" align="center" style="border-right:1px solid #666666"><strong>Instituition </strong></td>
															  <td width="25%" align="center" style="border-right:1px solid #666666"><strong>Department</strong></td>
	 														  <td width="25%" align="center" style="border-right:1px solid #666666"><strong>Duration</strong></td> 				   													  
														  </tr>			 
												  
														<tr class="BDJNormalText02">
														<!--Exam Title:-->
															<td width="25%" align="center" style="border-right:1px solid #666666;border-top:1px solid #666666;">
															   ${jobSeekerEducationObj.jobSeekerEducationLevel }
	 														&nbsp;
															</td>
															<!--Concentration/Major:-->
															<td width="25%" align="center" style="border-right:1px solid #666666;border-top:1px solid #666666;">
																${jobSeekerEducationObj.jobSeekerEducationalInstituition}															&nbsp;
															</td>
															<!--Institute:-->
															<td width="25%" align="center" style="border-right:1px solid #666666;border-top:1px solid #666666;">
															&nbsp;		${jobSeekerEducationObj.jobSeekerEducationalDepartment}	
															</td>
				 										
				 										 <!--Duration:-->
															 <td width="25%" style="border-top:1px solid #666666" align="center">
																 ${jobSeekerEducationObj.jobSeekerDuration}
															 &nbsp;					
															</td>
															 
														</tr>
												</tbody>
											</c:forEach> 
										</table> 
									 </td>
							</tr>
						</table>
					</div>
					</c:if>					
					
 					
					
					<c:if test="${jobSeeker.skills !=null && not empty jobSeeker.skills}">
						<hr size=2 noshade>
					
						<div id="skillsSection">
						
							<div id="InfoHeader" >
									<table>
										<tr>
											<td colspan="6" class="BDJHeadline01"><u>Skills/Specialization:</u></td>
										</tr>
									</table>
							</div>
						
							<table border="0" cellpadding="0" cellspacing="0" align="" width="" style="margin-top:3px;">
									<tbody>
									 <tr>
										 <td colspan="6" align="left" style="padding-left:5px;" class="BDJNormalText01">
										 <table border="0" cellpadding="0" cellspacing="0" align="center" width="750" style="border:1px solid #666666">
											<tbody><tr>
											
												 <td width="40%" class="BDJNormalText02" align="center" style="border-bottom:1px solid #666666;">
												 <strong>Fields of Specialization</strong>
												 </td>
											
											</tr>
											
											<tr>
											
												 <td width="40%" align="left" class="BDJNormalText03">
													  <ul>
													  <!-- Run the for loop here -->
													  
														  <c:forEach var="skill" items="${jobSeeker.skills}"> 
															  <li> ${skill }</li>														   
														  </c:forEach>
													  </ul>
													  <br> 
													  &nbsp;
												</td>
													  
											</tr>		
										 </tbody></table>	
										 </td>
										 </tr>
									
							</tbody></table>
						</div>
				</c:if>
				
				<c:if test="${jobSeeker.activities!=null && not empty jobSeeker.activities}">
						<hr size=2 noshade>
					
						<div id="skillsSection">
						
							<div id="InfoHeader" >
									<table>
										<tr>
											<td colspan="6" class="BDJHeadline01"><u>Activities:</u></td>
										</tr>
									</table>
							</div>
						
							<table border="0" cellpadding="0" cellspacing="0" align="" style="margin-top:3px;">
									<tbody>
									 <tr>
										 <td colspan="6" align="left" style="padding-left:5px;" class="BDJNormalText01">
										 <table border="0" cellpadding="0" cellspacing="0" align="center" width="750" style="border:1px solid #666666">
											<tbody><tr>
											
												 <td width="40%" class="BDJNormalText02" align="center" style="border-bottom:1px solid #666666;">
												 <strong>Fields of Activities</strong>
												 </td>
											
											</tr>
											
											<tr>
											
												 <td width="40%" align="left" class="BDJNormalText03">
													  <ul>
													  <!-- Run the for loop here -->
													  
														  <c:forEach var="activity" items="${jobSeeker.activities}"> 
															  <li> ${activity }</li>														   
														  </c:forEach>
														  
													  </ul>
													  <br> 
													  &nbsp;
												</td>
													  
											</tr>		
										 </tbody></table>	
										 </td>
										 </tr>
									
							</tbody></table>
						</div>
					</c:if>
					
				
					<c:if test="${jobSeeker.interests!=null && not empty jobSeeker.interests}">
						<hr size=2 noshade>
					
						<div id="skillsSection">
						
							<div id="InfoHeader" >
									<table>
										<tr>
											<td colspan="6" class="BDJHeadline01"><u>Interests:</u></td>
										</tr>
									</table>
							</div>
						
							<table border="0" cellpadding="0" cellspacing="0" align="" width="750" style="margin-top:3px;">
									<tbody>
									 <tr>
										 <td colspan="6" align="left" style="padding-left:5px;" class="BDJNormalText01">
										 <table border="0" cellpadding="0" cellspacing="0" align="center" width="750" style="border:1px solid #666666">
											<tbody><tr>
											
												 <td width="40%" class="BDJNormalText02" align="center" style="border-bottom:1px solid #666666;">
												 <strong>Fields of Interests</strong>
												 </td>
											
											</tr>
											
											<tr>
											
												 <td width="40%" align="left" class="BDJNormalText03">
													  <ul>
													  <!-- Run the for loop here -->
													  
														  <c:forEach var="interest" items="${jobSeeker.interests}"> 
															  <li> ${interest }</li>														   
														  </c:forEach>
														  
													  </ul>
													  <br> 
													  &nbsp;
												</td>
													  
											</tr>		
										 </tbody></table>	
										 </td>
										 </tr>
									
							</tbody></table>
						</div>
					</c:if>
					
			</div>

      </div>
    </div>
  </div></c:if>