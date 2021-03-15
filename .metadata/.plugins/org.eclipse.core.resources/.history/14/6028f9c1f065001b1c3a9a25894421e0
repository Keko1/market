function validate(){
	var fname = document.getElementById("fname").value;
	//var lname = document.getElementById("lname");
	var email = document.getElementById("email").value;
	var pass1 = document.getElementById("pass1").value;
	var pass2 = document.getElementById("pass2").value;
	
	
	if (fname == null || fname == "" || email == null || email == ""
			|| pass1 == null || pass1 == "" || pass2 == null || pass2 == "") {
		alert("Please fill all mandatory fields");
		return false;
	} else if (pass1 != pass2){
		alert("Passwords do not match");
		return false;
	} else if (pass1.length < 6){
		alert("Password should not be less than 6 characters");
		return false;
	}
}