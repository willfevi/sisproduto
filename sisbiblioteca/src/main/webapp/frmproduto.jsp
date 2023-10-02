<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<title> Registrar Produto</title>
</head>
<body>
<form action="/sisvenda/ProdutoAdd" method="get">
	Nome: <input type="text" name="nome">
	R$: <input type="text" name="valor">
	Categoria: 	<select name="idCategoria">
					<c:forEach var="categoria" items="${categorias}"> 
						<option value="${categoria.id}"> ${categoria.nome}
						</option> 	
					</c:forEach>
				</select>
	<input type="submit">
</form>
</body>
</html>