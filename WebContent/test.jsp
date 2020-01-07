<%@page import="com.chinasoft.service.impl.DBServerImpl"%>
<%@page import="com.chinasoft.service.DBServer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	    DBServer dbServer = new DBServerImpl();
		String sql = "insert into RPMS_user values (chen,0123456789,1);";
		int cont = dbServer.jdbcInsUpDelServer(sql);
		if(cont > 0)
			out.print("增加成功");
		else
			out.print("增加失败");
	%>
</body>	
</html>