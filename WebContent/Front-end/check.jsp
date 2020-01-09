<%@page import="com.chinasoft.service.impl.AdminServiceImpl"%>
<%@page import="com.chinasoft.service.AdminService"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		AdminService adminService = new AdminServiceImpl();
	
		request.setCharacterEncoding("utf-8");
		String adminName = request.getParameter("adminName");
		String password = request.getParameter("password");
		if(adminName != null && password != null){
			if (adminService.CheckAdminLoginCheck(adminName, password) == 0){
				out.print("登录失败，请重新登录");
				response.sendRedirect("index.html");
			}else
				out.print("登陆成功,正在跳转.....");
		}else {
			response.sendRedirect("index.html");
		}
	%>
</body>
</html>