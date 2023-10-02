<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Biblicoteca-Menu</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styleindex.css">

</head>
<body>
    <div>
        <h1>Biblioteca</h1>
        <a href="/sisbiblioteca/frmlivro.jsp">Cadastrar Livro</a> <br>
        <a href="/sisbiblioteca/CategoriaListar?next=listarcategoria.jsp">Listar Categoria</a> <br>
        <a href="/sisbiblioteca/CategoriaListar?next=frmproduto.jsp">Registrar Produto</a> <br>
        <a href="/sisbiblioteca/listarproduto.jsp">Listar Produto</a> <br>
        <a href="/sisbiblioteca/frmusuario.jsp">Registrar Usuario</a> <br>
    </div>
</body>
</html>
