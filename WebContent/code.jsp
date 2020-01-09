<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		.s1{
			cursor:pointer;
		}
	</style>
</head>
<body>
	验证码:<input name="vcode"/>
	<img src="code" onclick="this.src='code?'+Math.random();" class="s1" title="点击更换" />
</body>
</html>