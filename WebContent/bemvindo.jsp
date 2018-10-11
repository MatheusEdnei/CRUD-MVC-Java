<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Bem vindo!</title>
	</head>
	<body>
		<%-- comentário em jsp aqui: nossa primeira página jsp --%>
		<%
			String mensagem = "Bem vindo ao sistema de emissão de documentos do Coren-BA!";
		%>
		<% out.println(mensagem); %>
		<br />
		<%
			String desenvolvido = "Desenvolvido por Matheus Ednei";
		%>
		<%= desenvolvido %>
		<%
			System.out.println("Tudo foi executado!");
		%>
	</body>
</html>