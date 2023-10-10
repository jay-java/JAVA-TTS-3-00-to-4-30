<%@page import="model.Seller"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Cache-Control", "no-store");
	response.setHeader("Pragma", "no-cache");
	response.setDateHeader("Expires", 0);

	if (session.getAttribute("data") == null)
		response.sendRedirect("login.jsp");
	%>
	<%
	Seller u = null;
	if (session.getAttribute("data") != null) {
		u = (Seller) session.getAttribute("data");
	} else {
		response.sendRedirect("seller-login.jsp");
	}
	%>

	<h1 class="text-center">
		Welcome,
		<%=u.getName()%></h1>
</body>
</html>