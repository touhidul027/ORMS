
function showErrorMessage(){
			var p = document.getElementById("errorMessage") ; 
			p.innerHTML = "Password is not same" ; 
		}
		
		function passwordEqualityCheck() {
			var first = document.getElementById("password").value ; 
			var first2 = document.getElementById("confirmPassword").value ;
			
			if(first==first2){
				return true ; 
			}
			else{
				
			    document.getElementById("errorMessage").innerHTML = "password is not same";
					setTimeout(function () {
						document.getElementById("errorMessage").innerHTML = "";  
					}, 1500);
				
					
				document.getElementById("errorMessage2").innerHTML = "password is not same";
					setTimeout(function () {
						document.getElementById("errorMessage2").innerHTML = "";  
					}, 1500);
				
					
				document.getElementById("password").value = "";
				document.getElementById("confirmPassword").value = "";
				
				 return false ; 
			}
	}
	