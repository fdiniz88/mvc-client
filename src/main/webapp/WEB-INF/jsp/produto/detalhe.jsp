<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Produto detalhe</title>
</head>
<body>
	<div class="container">
	 <br>
	  <h2>Cadastrar produto</h2>
	   <br>
	<form action="/produto" method="post">
	    <div class="form-group">
      <label for="tipoProduto">Tipo produto:</label>
      <input type="text" class="form-control" id="tipoProduto" placeholder="Digitar tipo produto" name="tipoProduto" required>
    </div>
	<div class="form-group">
      <label for="nome">Nome:</label>
      <input type="text" class="form-control" id="nome" placeholder="Digitar nome" name="nome" required>
    </div>
    <div class="form-group">
      <label for="preco">Preço:</label>
      <input type="number" class="form-control" id="preco" placeholder="Digitar Preço" name="preco" required>
    </div>
       <div class="form-group">
      <label for="quantidade">Quantidade:</label>
      <input type="number" class="form-control" id="quantidade" placeholder="Digitar quantidade" name="quantidade" required>
    </div>
     <br>
    <input type="submit"  class="btn btn-primary" value="Cadastrar">	
    <a href="/home" class="btn btn-secondary">Voltar</a>				
	</form>
	</div> 
</body>
</html>