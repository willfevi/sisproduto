<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registrar Livro</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style.css">
</head>
<body>

<form action="/sisbiblioteca/LivroAdd" method="get">
    <h1>Registrar Livro</h1>
    Titulo: <input type="text" name="nome" value="${livro.titulo}"> <br>
    Autor: <input type="text" name="autor" value="${livro.autor}"> <br>
    Genero: 
    <select name="genero">
        <c:forEach var="genero" items="${Genero.values()}">
            <option value="${genero}" ${genero == livro.genero ? 'selected' : ''}>${genero.displayName}</option>
        </c:forEach>
    </select> <br>
    Data de Publicação:<input type="text" name="nome" value="${livro.dataDePublicacao}"> <br>
    <input type="submit">
    <h1> ${msg}</h1>
</form>
</body>
</html>
