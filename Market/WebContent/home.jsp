<!DOCTYPE html>
<html>
<head>
<meta charset=utf-8>
<title>Welcome to KGeX Market</title>
<link type="text/css" href="bootstrap/css/bootstrap.min.css"
	rel="stylesheet" />
<script src=bootstrap/js/boosted.min.js></script>
<script type="text/javascript" src= "validate.js">
</script>
<h1>Welcome to KGeX Market</h1>
 </head>
<body>
	<div class="">
		<form method="post" action="RegisterController" onsubmit="return validate()">
			<label class="col-md-2">First name: </label class="col-md-2"> <input class="input"
				type="text" required="required" id="fname" name="fname"><br>
			<label class="col-md-2">Last name:</label class="col-md-2"> <input class="input"
				type="text" id="lname" name="lname"><br> <label
				class="col-md-2">Phone:</label class="col-md-2"> <input class="input" type="tel"
				id="telnum" name="telnum"><br> <label class="col-md-2">Email:</label class="col-md-2">
			<input class="input" type="email" required="required" id="email"
				name="email"><br> <label class="col-md-2">Password:</label class="col-md-2">
			<input class="input" type="password" required="required" id="pass1"
				name="pass1"><br> <label class="col-md-2">Confirm
				Password:</label class="col-md-2"> <input class="input" type="password" required="required"
				id="pass2" name="pass2"><br>
			<button class="btn btn-success" type="submit">Sign up</button>
		</form>
	</div>
</body>
</html>
