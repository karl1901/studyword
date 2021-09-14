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
	//加载MYSQL运行包
	Class.forName("com.mysql.cj.jdbc.Driver");
	//需要连接数据库名称
	String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=GMT%2b8";
	//获取数据连接
	Connection con = DriverManager.getConnection(url, "root", "010928");
	//需要执行的sql语句
	String sql = "delete from news where nid=?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setInt(1, nid);
	int n = ps.executeUpdate();
	if (n > 0) { //删除成功
		out.print("<script>alert('删除成功！');</script>");
		out.print("<script>location.href='admin.jsp';</script>");
	} else {
		out.print("<script>alert('删除失败！');</script>");
		out.print("<script>location.href='admin.jsp';</script>");
	}
%>