<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 1.jsp
2.model
3.controller(Servlet)
  DBConnection
4.Dao
5.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <%scriplets %> --%>

<%String msg  = (String)request.getAttribute("msg"); %>
<%if(msg!=null){ %>
	<%out.print(msg); %>
<%} %>
	<form action="MyController" method="post">
		<table>
			<tr>
				<td>Name :</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Contact :</td>
				<td><input type="text" name="contact"></td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" name="action" value="register"></td>
			</tr>
		</table>
	</form>
</body>
</html>