<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
  <title>Login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container"  style="    left: 250px;    top: 200px;    position: relative;">
  <h2>LOGIN</h2>
   <p>	<font color="red">${msg}</font></p>
  <form class="form-inline" action="/login" method="post">
    <label for="email2" class="mb-2 mr-sm-2">Login:</label>
    <input type="text" class="form-control mb-2 mr-sm-2" id="login" placeholder="Digitar login" name="login" required>
    <label for="pwd2" class="mb-2 mr-sm-2">Senha:</label>
    <input type="text" class="form-control mb-2 mr-sm-2" id="senha" placeholder="Digitar senha" name="senha" required>
	<input type="submit"  class="btn btn-primary mb-2" value="Acessar">
  
  </form>
</div>

</body>
</html>


