<html>
<head> 
<meta charset=utf-8>
<title>Login Page</title>
</head>
<body>
<h1>Welcome to KGeX Market</h1>
<h2>Login</h2>
	<div class="">
		<form method="post" action="LoginController" >
		  <label class="col-md-2">Email:</label class="col-md-2">
  		  <input class="input" type="email" id="email" name="email"><br>
  		  <label class="col-md-2">Password</label class="col-md-2">
  		  <input class="input" type="password" id="pass" name="pass"><br>
  		  <button class="btn btn-success" type="submit">Login</button><br>
  		  
  		  <br>
  		  <h3>If you don't have an account click here to regest </h3>
  		  	<input type=button onClick="location.href='\home.jsp'" value='Sign Up'>
</body>
</html>