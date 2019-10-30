<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>The time on the server is ${serverTime}.</p>
Sign In Progress
<form action="SignInProcess" method="post">
		<table align="center">
			<tr>
				<td><label name="username">Username:</label></td>
				<td><input type="text" name="username" id="username" /></td>
			</tr>
			<tr>
				<td><label name="password">Password:</label></td>
				<td><input type="password" name="password" id="password" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><button type="submit" name="login">SignIn</button></td>
			</tr>

			<tr></tr>
			<tr>
				<td></td>
				<td><a href="home.jsp">Home</a></td>
			</tr>
		</table>
	</form>
	
</body>
</html>