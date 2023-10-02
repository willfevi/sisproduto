<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SisVenda - Listar Categorias</title>
</head>
<body>
	<c:forEach var="categoria" items="${categorias}">
		<p> ${categoria.id} - ${categoria.nome} </p>
	</c:forEach>
</body>
</html>