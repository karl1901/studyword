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
	//获取时间类的对象
	Date date = new Date();
	//获取系统当前时间
	String ntime = date.toLocaleString();

	//加载MYSQL运行包
	Class.forName("com.mysql.cj.jdbc.Driver");
	//需要连接数据库名称
	String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=GMT%2b8";
	//获取数据连接
	Connection con = DriverManager.getConnection(url, "root", "010928");
	//修改的sql语句
	String sql = "update news set ntype=?,ntitle=?,nabuut=?,nimage=?,nauthor=?" + ",ntime=? where nid=?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setInt(1, ntype);
	ps.setString(2, ntitle);
	ps.setString(3, nabuut);
	ps.setString(4, nimage);
	ps.setString(5, nauthor);
	ps.setString(6, ntime);
	ps.setInt(7, nid);
	int n = ps.executeUpdate();
	if (n > 0) { //修改成功！
		out.print("<script>alert('修改成功！');</script>");
		out.print("<script>location.href='admin.jsp';</script>");
	} else {
		out.print("<script>alert('修改失败！');</script>");
		out.print("<script>location.href='updatenews.jsp';</script>");
	}
%>