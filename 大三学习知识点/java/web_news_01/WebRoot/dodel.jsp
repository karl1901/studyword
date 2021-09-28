<%@page import="com.bizimpl.NewsBiz"%>
<%@page import="com.biz.INewsBiz"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%
	//删除数据处理
	//获取主页面传过来的新闻编号nid
	request.setCharacterEncoding("UTF-8");
	int nid = Integer.parseInt(request.getParameter("nid"));
	//out.print("新闻编号:"+nid);
	INewsBiz inb = new NewsBiz();
	int n = inb.delNews(nid);
	if (n > 0) { //删除成功
		out.print("<script>alert('删除成功！');</script>");
		out.print("<script>location.href='admin.jsp';</script>");
	} else {
		out.print("<script>alert('删除失败！');</script>");
		out.print("<script>location.href='admin.jsp';</script>");
	}
%>