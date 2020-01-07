<%@page import="com.chinasoft.service.impl.DBServerImpl"%>
<%@page import="com.chinasoft.service.DBServer"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
123123123
	<%
	    DBServer dbServer = new DBServerImpl();
		String sql = "insert into RPMS_user (userName,userpass,ownerId)values ('chen',0123456789,1);";
		
		if(dbServer.jdbcInsUpDelServer(sql) > 0)
			out.print("增加成功");
		else
			out.print("增加失败"); 
	%>
</body>	
</html>