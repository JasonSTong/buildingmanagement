<%@page import="com.chinasoft.dao.impl.AdminDaoImpl"%>
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
		request.setCharacterEncoding("utf-8");
		String adminName = request.getParameter("adminName");
		String password = request.getParameter("password");
		AdminDaoImpl adminLogin = new AdminDaoImpl();
		
		if(adminLogin.AdminLogin(adminName, password)==0)
			out.print("账号或密码输入错误");
		else
			out.print("登录成功");
	%>
</body>
</html>