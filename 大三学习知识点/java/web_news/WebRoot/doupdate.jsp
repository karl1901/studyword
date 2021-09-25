<%@page import="com.bizimpl.NewsBiz"%>
<%@page import="com.biz.INewsBiz"%>
<%@page import="com.entity.News"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%
	//修改处理页面
	request.setCharacterEncoding("UTF-8");
	int nid = Integer.parseInt(request.getParameter("nid"));
	//out.print(nid);
	//接收修改页面传的所有数据
	int ntype = Integer.parseInt(request.getParameter("ntype"));
	//out.print("新闻类别编号:"+ntype);
	String ntitle = request.getParameter("ntitle"); //新闻标题
	String nabuut = request.getParameter("nabuut"); //新闻内容
	String nimage = request.getParameter("file"); //新闻图片
	String nauthor = request.getParameter("nauthor"); //发布作者
	News news = new News();
	news.setNtitle(ntitle);
	news.setNtype(ntype);
	news.setNabuut(nabuut);
	news.setNimage(nimage);
	news.setNauthor(nauthor);
	INewsBiz inb = new NewsBiz();
	int n = inb.updateNews(nid, news);
	if (n > 0) { //修改成功！
		out.print("<script>alert('修改成功！');</script>");
		out.print("<script>location.href='admin.jsp';</script>");
	} else {
		out.print("<script>alert('修改失败！');</script>");
		out.print("<script>location.href='updatenews.jsp';</script>");
	}
%>