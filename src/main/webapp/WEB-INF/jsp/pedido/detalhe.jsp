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
<title>pedido detalhe</title>
</head>
<body>
	<div class="container">
		<br>
		<h2>Cadastrar pedido</h2>
		<br>
		<form action="/pedido" method="post">

			<div class="form-group">
				<label for="descricao">Descrição:</label> <input type="text"
					class="form-control" id="descricao" placeholder="Digitar descrição"
					name="descricao" required>
			</div>
			<div class="form-group">
			<select name="cliente.id" class="form-control" >
				<c:forEach var="cliente" items="${clientesLista}">
					<option value="${cliente.id}">${cliente.nome}</option>
				</c:forEach>
			</select>
			</div>
			 <br> <br>
			 <div class="form-group">
			<c:forEach var="bebida" items="${bebidasLista}">
			${bebida}
			<input type="checkbox"class="form-control" value="${bebida.id}" name="itens">
			</c:forEach>
			</div>
			<br> <br>
			<div class="form-group">
			
			<c:forEach var="petisco" items="${petiscosLista}">
			${petisco} <input type="checkbox" class="form-control" name="itens"
					value="${petisco.id}">
			</c:forEach>
			</div>
			<br> <br>
			
			<div class="form-group">
			<c:forEach var="sobremesa" items="${sobremesasLista}">
			${sobremesa}<input type="checkbox" class="form-control" name="itens"
					value="${sobremesa.id}">
			</c:forEach>


</div>

			<br>
			
			<div class="form-group"> <input type="submit" class="btn btn-primary"
				value="Cadastrar"> <a href="/home" class="btn btn-secondary">Voltar</a>
</div>
		</form>
</body>
</html>