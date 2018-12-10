<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
	
		<meta charset="ISO-8859-1">
		<title>Login</title>
		<link href="css/style.css" rel="stylesheet">
		
	</head>
	<body>
		<c:import url="cabecalho.jsp"/>
		
		<h3>Autenticação de usuário</h3>
		<form method="post">
			<table>
				<tr>
					<th>Login</th>
					<td><input type="text" name="login"/></td>
				</tr>
				<tr>
					<th>Senha: </th>
					<td><input type="password" name="senha"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" name="OK" value="Entrar"/>
					</td>
				</tr>
			</table>
		</form>
		
		<c:import url="rodape.jsp"/>
	</body>
</html>
