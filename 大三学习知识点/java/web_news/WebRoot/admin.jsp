<%@page import="com.entity.News"%>
<%@page import="com.bizimpl.NewsBiz"%>
<%@page import="com.biz.INewsBiz"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
<%@include file="kp.jsp"%>
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
					//获取数据来判定是上一页还是下一页
					String down = request.getParameter("down");
					String up = request.getParameter("up");
					//获取当前页码
					String pagemin = request.getParameter("min");

					int sel = 3;
					int pa = 0; //控制页码
					int count = 0;

					//求最大页码
					int max = 0;
					if (count % sel == 0) {
						max = count / sel;
					} else {
						max = count / sel + 1;
					}
					//求当前页码数
					int min = 1;
					if (pagemin != null) {
						min = Integer.parseInt(pagemin);
					}
					if (up != null) {
						min--;
						if (min <= 1) { //不能超过最小页码
							min = 1;
						}
					}
					if (down != null) {
						min++;
						if (min >= max) { //不能超过最大页码
							min = max;
						}
					}

					//System.out.println("新闻总条数："+count);
					//根据得到新闻的总条数去获取最大页码(尾页)
					int maxpage = 0;
					if (count % sel == 0) {
						maxpage = (count / sel - 1) * sel;
					} else {
						maxpage = count / sel * sel;
					}

					if (indexpage != null) { //参数有内容
						pa = Integer.parseInt(indexpage);
					}

					// 调用查询所有的方法
					INewsBiz inb = new NewsBiz();
					List<News> myn = inb.getAll(pa, sel);

					for (int i = 0; i < myn.size(); i++) {
				%>
				<li><a href="news_read.jsp?nid=<%=myn.get(i).getNid()%>"><%=myn.get(i).getNtitle()%></a><span>
						作者：<%=myn.get(i).getNauthor()%> &#160;&#160;&#160;&#160; <a
						href='updatenews.jsp?nid=<%=myn.get(i).getNid()%>'>修改</a>
						&#160;&#160;&#160;&#160; <a
						href='dodel.jsp?nid=<%=myn.get(i).getNid()%>'
						onclick='return clickdel()'>删除</a>
				</span></li>
				<%
					}
				%>
				<p align="right">
					<a
						href="admin.jsp?pa=<%=0%>&min=<%=1%>&ntitle=<%=ntitle == null ? "" : ntitle%>">首页</a>
					<a
						href="admin.jsp?pa=<%=pa <= 0 ? 0 : pa - sel%>&up=up&min=<%=min%>&ntitle=<%=ntitle == null ? "" : ntitle%>">上一页</a>
					当前页数:[<%=min%>/<%=max%>]&nbsp; <a
						href="admin.jsp?pa=<%=pa >= maxpage ? maxpage : pa + sel%>&down=down&min=<%=min%>&ntitle=<%=ntitle == null ? "" : ntitle%>">下一页</a>
					<a
						href="admin.jsp?pa=<%=maxpage%>&min=<%=max%>&ntitle=<%=ntitle == null ? "" : ntitle%>">末页</a>
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