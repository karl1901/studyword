<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	// 注销
	// 先要把用户的session移除
	session.invalidate();
	// 返回登录页面
	response.sendRedirect("login.html");
%>
