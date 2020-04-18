<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>bebida detalhe</title>
</head>
<body>
	<div class="container">
		<br>
		<h2>Cadastrar bebida</h2>
		<br>
		<form action="/bebida" method="post">
			<div class="form-group">
				<label for="descricao">Descrição:</label> <input type="text"
					class="form-control" placeholder="Digitar descrição"
					name="descricao" required>
			</div>
			<div class="form-group">
				<label for="tipo">Tipo:</label> <input type="text"
					class="form-control" placeholder="Digitar tipo" name="tipo"
					required>
			</div>
			<div class="form-group">
				<label for="marca">Marca:</label> <input type="text"
					class="form-control" placeholder="Digitar marcar" name="marca"
					required>
			</div>
			<div class="form-group">
				<label for="tamanho">Tamanho:</label> <input type="number"
					class="form-control" placeholder="Digitar tamanho" name="tamanho"
					required>
			</div>
			<div class="form-group">
				<label for="preco">Preço:</label> <input type="number"
					class="form-control" placeholder="Digitar preço" name="preco"
					required>
			</div>
			<br> <input type="submit" class="btn btn-primary"
				value="Cadastrar"> <a href="/home" class="btn btn-secondary">Voltar</a>
		</form>
	</div>
</body>
</html>