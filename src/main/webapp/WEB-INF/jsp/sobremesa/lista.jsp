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
<title>Sobremesa lista</title>
</head>
<body>
	<div class="container">
	 <br>
  <h2>	LLista de sobremesas  </h2>
   <br>
  <ul class="list-group">
	<c:forEach var="sobremesa" items="${sobremesasLista}">
    <li class="list-group-item">${sobremesa.tamanho} <a href="/sobremesa/excluir/${sobremesa.id}">excluir</a> </li>
    </c:forEach>  
    <ul>
     <br>
    <a href="/home" class="btn btn-secondary">Voltar</a>
    </div>	
</body>
</html>