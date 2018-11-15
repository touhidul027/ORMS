		
function skillAddingFunction()
{
		var select = document.getElementById("jobSeekerSkillsList") ; 
		var skillName = document.getElementById("jobSeekerSkillInput").value ; 
		
		var option = document.createElement("option") ;
			option.text = skillName ; 
			option.value = skillName ; 		
			option.selected=true ; 		
			// select.appendChild(option) ;  
			select.add(option) ; 
			
	// clear the value of textInput
	document.getElementById("jobSeekerSkillInput").value="" ;  	
}


function activityAddingFunction()
{
		var select = document.getElementById("jobSeekeractivityList") ; 
		var activityName = document.getElementById("jobSeekerActivityInput").value ; 
		
		var option = document.createElement("option") ;
			option.text = activityName ; 
			option.value = activityName ; 		
			option.selected=true ; 		
			// select.appendChild(option) ;  
			select.add(option) ; 
			
	// clear the value of textInput
	document.getElementById("jobSeekerActivityInput").value="" ;  	
}


function interestAddingFunction()
{
		 
	   var select = document.getElementById("jobSeekerInterestsList") ; 
		var interestName = document.getElementById("jobSeekerInterestInput").value ; 
		
		var option = document.createElement("option") ;
			option.text = interestName ; 
			option.value = interestName ; 		
			option.selected=true ; 		
			// select.appendChild(option) ;  
			select.add(option) ;
	// clear the value of textInput
	document.getElementById("jobSeekerInterestInput").value="" ;  	
}

function keySkillAddingFunction()
{
	
		var select = document.getElementById("jobPosterKeySkillsSelection") ; 
		var skillName = document.getElementById("jobPostingKeySkillInput").value ; 

		var option = document.createElement("option") ;
			option.text = skillName ; 
			option.value = skillName ; 		
			option.selected=true ; 		
			// select.appendChild(option) ;  
			select.add(option) ; 
			
	// clear the value of textInput
	document.getElementById("jobPostingKeySkillInput").value="" ;  	
	
}
