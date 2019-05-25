<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teste Jstl</title>
</head>
<body>
		<!-- <jsp:useBean id="dao" class="dao.ClienteDao"></jsp:useBean> -->
	
	<!-- Estudo de TagLib -->
	
		<table>
			<th>Nome:</th>
			<th>Email:</th>
			<th>Endereco:</th>
			
			<c:forEach items="${clientes}" var="cliente">
				<tr>
				<td>${cliente.nome}</td>
				<td>
					<c:if test="${not empty cliente.email}">
						<a href="mailto:${cliente.email}">${cliente.email}</a>					
					</c:if>
					<c:if test="${empty cliente.email}">
						E-mail não informado					
					</c:if>
				</td>
				<td>${cliente.endereco}</td>
				<td><a href="mvc?regra=RegraDeleteClientes&id=${cliente.id}">Excluir</a></td>
				</tr>
			</c:forEach>
			
		</table>
		<br/>
		<a href="insert2.jsp">Novo</a>

</body>
</html>
