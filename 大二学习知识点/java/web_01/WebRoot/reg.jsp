<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'reg.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>

	<body>
		<form action="doreg.jsp" " method="post">
			用户名：
			<input type="text" name="uname">
			<br>
			密码：
			<input type="password" name="upwd">
			<br>
			年龄：
			<input type="text" name="age">
			<br>
			性别：
			<input type="radio" name="sex" value="男" checked="checked">
			男
			<input type="radio" name="sex" value="女">
			女
			<br>
			<input type="submit" value="注册">
		</form>
	</body>
</html>
