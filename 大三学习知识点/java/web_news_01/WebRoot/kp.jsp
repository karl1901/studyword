<%@ page language="java" import="java.util.*,java.sql.*"
	pageEncoding="UTF-8"%>
<%
	// 获取session(返回值：对象)
	 Object obj = session.getAttribute("token");
	 if (obj == null) { // 客户端没有通行证
	 	 response.sendRedirect("login.html");
	 }

	// 获取Cookie
	//Cookie[] cs = request.getCookies();
	//boolean f = false;
	//if (cs != null) {
	//	for (int i = 0; i < cs.length; i++) {
	//		if (cs[i] != null && cs[i].getName().equals("tokens")) {
	//			f = true;
	//		}
	//	}
	//	if (!f) {
	//		response.sendRedirect("login.html");
	//	}
     //}
%>