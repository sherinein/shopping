<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="Second.jsp">Second</a>
<table align="center">
		<tr>
			<td><a href="${pageContext.request.contextPath}/signin.jsp">SignIn</a></td>
			<td><a href="signup">Register</a></td>
		</tr>
	</table>
</body>
</html>