<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport"    content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author"      content="Sergey Pozhilov (GetTemplate.com)">
	
	<title>Painel de legendas</title>

	<link rel="shortcut icon" href="resources/images/gt_favicon.png">
	<link rel="stylesheet" media="screen" href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,700">
	<link rel="stylesheet" href="resources/css/bootstrap.min.css">
	<link rel="stylesheet" href="resources/css/font-awesome.min.css">
	<link rel="stylesheet" href="resources/css/bootstrap-theme.css" media="screen" >
	<link rel="stylesheet" href="resources/css/main.css">
	<link rel="stylesheet" href="resources/css/mycss.css">
</head>

<body class="home" id="container">

	<!-- Modal to login -->
	<div class="modal fade" id="loginModal" role="dialog" tabindex="-1">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Login</h4>
				</div>
				<div class="modal-body">
					<form method="POST" action="login">
						<p><input type="text" name="nick" required class="myInput" placeholder="Nome de usuário"></p>
						<p><input type="password" name="password" required class="myInput" placeholder="Senha"></p>
						<br />
						<p><input type="submit" class="btn btn-success" value="Entrar"></p>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- /Modal to login -->
	
	<!-- Fixed navbar -->
	<div class="navbar navbar-inverse navbar-fixed-top" >
		<div class="container">
			<div class="navbar-header">
				<!-- Button for smallest screens -->
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
				<a class="navbar-brand" href="../index.jsp"><img src="resources/images/logo.png" alt="Progressus HTML5 template"></a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav pull-right">
					<li class="active"><a href="#">Página inicial</a></li>
					<li><a href="about.html">Equipes cadastradas</a></li>
					<li><a href="contact.html">Sobre o site</a></li>
					<li><a href="login.jsp" class="btn" >ENTRAR</a></li>
					<!-- <li><a class="btn" data-toggle="modal" data-target="#loginModal">ENTRAR</a></li> -->
				</ul>
			</div><!--/.nav-collapse -->
		</div>
	</div> 
	<!-- /.navbar -->

	<!-- Header -->
	<header id="head">
		<div class="container">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Criar conta</h4>
				</div>
				<div class="modal-body">
					<form method="POST" action="../register">
						<p><input type="text" name="nick" required class="myInput" placeholder="Nome de usuário"></p>
						<p><input type="email" name="email" required class="myInput" placeholder="E-mail"></p>
						<p><input type="password" required class="myInput" id="primeiraSenha" placeholder="Senha"></p>
						<p><input type="password" name="password" required class="myInput" placeholder="Confirme sua senha" oninput="validarSenha(this)"></p>
						<br />
						<p><input type="submit" class="btn btn-success" id="submitButton" value="Cadastrar-se"></p>
					</form>
				</div>
			</div>
		</div>
	</header>
	<!-- /Header -->

	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
	<script src="resources/js/headroom.min.js"></script>
	<script src="resources/js/jQuery.headroom.min.js"></script>
	<script src="resources/js/template.js"></script>
</body>
</html>
