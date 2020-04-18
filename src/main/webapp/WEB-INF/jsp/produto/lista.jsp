<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>


  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>produtos lista</title>
</head>
<body>
	<div class="container">
	 <br>
  <h2>	Lista de produtos   </h2>
   <br>
  <ul class="list-group">
	<c:forEach var="produto" items="${produtosLista}">
    <li class="list-group-item">${produto.nome} <a href="/produto/excluir/${produto.id}">excluir</a>  </li>
    </c:forEach>  
    <ul>
     <br>
    	<a href="/home" class="btn btn-secondary">Voltar</a>
    </div>	
</body>
</html>