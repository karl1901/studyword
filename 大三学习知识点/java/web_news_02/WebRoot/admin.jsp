<%@page import="com.entity.News"%>
<%@page import="com.bizimpl.NewsBiz"%>
<%@page import="com.biz.INewsBiz"%>
<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>添加主题--管理后台</title>
<link href="CSS/admin.css" rel="stylesheet" type="text/css" />
<%-- <%@include file="kp.jsp"%> --%>
</head>
<body>
	<div id="header">
		<div id="welcome">欢迎使用新闻管理系统！</div>
		<div id="nav">
			<div id="logo">
				<img src="images/logo.jpg" alt="新闻中国" />
			</div>
			<div id="a_b01">
				<img src="images/a_b01.gif" alt="" />
			</div>
		</div>
	</div>
	<div id="admin_bar">
		<div id="status">
			管理员：
			<%=session.getAttribute("token")%>
			&#160;&#160;&#160;&#160; <a href="loginout.jsp">login out</a> 访问量：
			<%
 	// 获取application中的内容
 	ArrayList<String> myl = (ArrayList<String>) application.getAttribute("fwl");
 	if (myl != null) { // 有人访问
 		out.print(myl.size());
 	} else {
 		out.print(0);
 	}
 %>
		</div>
		<div id="channel"></div>
	</div>
	<div id="main">
		<div id="opt_list">
			<ul>
				<li><a href="#">添加新闻</a></li>
				<li><a href="#">编辑新闻</a></li>
				<li><a href="#">查找新闻</a></li>
				<li><a href="#">添加主题</a></li>
				<li><a href="#">编辑主题</a></li>
			</ul>
		</div>
		<div id="opt_area">
			<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
			<script language="javascript">
				function clickdel() {
					return confirm("删除请点击确认");
				}
			</script>
			<%
				//获取模糊查询的数据
				request.setCharacterEncoding("UTF-8");
				String ntitle = request.getParameter("ntitle");
				//System.out.print(ntitle);
			%>

			<form action="admin.jsp" method="post">
				新闻标题：<input type="text" name="ntitle"
					value="<%=ntitle == null ? "" : ntitle%>" /> <input type="submit"
					value="搜索" />
			</form>
			<ul class="classlist">
				<%
					//获取用户选择的页面
					request.setCharacterEncoding("UTF-8");
					String indexpage = request.getParameter("pa"); //获取传过来的参数

					int pa = 0; // 初始情况
					int sel = 4; // 每页四条
					if (indexpage != null) { // 点击上一页或下一页
						pa = Integer.parseInt(indexpage);
					}

					// 调用查询所有的方法
					INewsBiz inb = new NewsBiz();
					List<News> myn = inb.getAll(pa, sel);
					// 获取新闻总行数
					int max = inb.getMax();
					// 获取最大页码数
					int maxpage = max / sel;
					if (max % sel != 0) {
						maxpage = max / sel + 1;
					}

					for (int i = 0; i < myn.size(); i++) {
				%>
				<li><a href="readnews.do?nid=<%=myn.get(i).getNid()%>"><%=myn.get(i).getNtitle()%></a><span>
						作者：<%=myn.get(i).getNauthor()%> &#160;&#160;&#160;&#160; <a
						href='selectnews.do?nid=<%=myn.get(i).getNid()%>'>修改</a>
						&#160;&#160;&#160;&#160; <a
						href='del.do?nid=<%=myn.get(i).getNid()%>'
						onclick='return clickdel()'>删除</a>
				</span></li>
				<%
					}
				%>
				<p align="right">
					<a href="admin.jsp?pa=<%=0%>">首页</a> <a
						href="admin.jsp?pa=<%=(pa - sel) < 0 ? 0 : pa - sel%>">上一页</a>
					当前页数:[<%=(pa + sel) / sel%>/<%=maxpage%>]&nbsp; <a
						href="admin.jsp?pa=<%=(pa + sel) >= max ? pa : pa + sel%>">下一页</a>
					<a href="admin.jsp?pa=<%=maxpage * sel - sel%>">末页</a>
				</p>
			</ul>
		</div>
	</div>
	<div id="site_link">
		<a href="#">关于我们</a><span>|</span> <a href="#">Aboue Us</a><span>|</span>
		<a href="#">联系我们</a><span>|</span> <a href="#">广告服务</a><span>|</span>
		<a href="#">供稿服务</a><span>|</span> <a href="#">法律声明</a><span>|</span>
		<a href="#">招聘信息</a><span>|</span> <a href="#">网站地图</a><span>|</span>
		<a href="#">留言反馈</a>
	</div>
	<div id="footer">
		<p class="">
			24小时客户服务热线：010-68988888 &#160;&#160;&#160;&#160; <a href="#">常见问题解答</a>
			&#160;&#160;&#160;&#160; 新闻热线：010-627488888<br />
			文明办网文明上网举报电话：010-627488888 &#160;&#160;&#160;&#160; 举报邮箱：<a href="#">jubao@jb-aptech.com.cn</a>
		</p>
		<p class="copyright">
			Copyright &copy; 1999-2009 News China gov, All Right Reserver<br />
			新闻中国 版权所有
		</p>
	</div>
</body>
</html>