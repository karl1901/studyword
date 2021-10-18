<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>购物系统-购物车</title>

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

	<div>
		<h2>商品购物车</h2>
	</div>

	<table border="1" align="center" width="700px">
		<tr>
			<td>商品编号</td>
			<td>商品名称</td>
			<td>商品价格</td>
			<td>商品描述</td>
			<td>商品图片</td>
			<td>商品数量</td>
			<td>总价</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${getlist }" var="g">
			<tr>
				<td>${g.bid }</td>
				<td>${g.bname }</td>
				<td>${g.bprice }</td>
				<td>${g.binfo }</td>
				<td><img alt="" src="${g.bimage }" width="120px" height="80px"></td>
				<td>商品数量</td>
				<td>总价</td>
				<td>操作</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
