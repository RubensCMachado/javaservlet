<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- comentario jsp --%>
<!-- Comentario html -->
<% String mensagem = "Bem Vindo safffffffffo JSP!!"; %>
<% out.println(mensagem); %> <br /><br /> <%-- Variaavel implicita --%>
<!-- variavel out do tipo JSPWritter que possui o metodo print -->
<!-- imprimirmos utilizando scriptles JSP -->
<h1>Seja bem vindo ao JavaServer Pages</h1>
<%= mensagem %>  <br /><br />
<!-- imprimirmos utilizando expressoes  JSP -->
<% System.out.println("Onde vai sair esta mensagem???"); %>
</body>
</html>