<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agendamento de viagens</title>
<link rel="stylesheet" href="css/estilo.css" type="text/css">
</head>
<body>
	<div id="erro"></div>
	<div class="caixa">
		<form action="Login" method="post">
			<div class="subcaixa">
				<div class="cx">
					<span class="lbl"><label for="user">Username</label></span>
					<span class="ipt"><input type="text" name="user" id="user"></span>
				</div>
				<div class="cx">
					<span class="lbl"><label for="pass">Password</label></span>
					<span class="ipt"><input type="password" name="pass" id="pass"></span>
				</div>
				<div class="sub">
					<button type="submit" id="btnLI">LogIn</button>
				</div>
				<div id="foot">
					<p>Don't you have any account? <a href="registar.html">Click here</a> to create one</p>
				</div>
			</div>
		</form>
	</div>
</body>
</html>