<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>添加主题--管理后台</title>
<link href="CSS/admin.css" rel="stylesheet" type="text/css" />
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
			管理员： 登录 &#160;&#160;&#160;&#160;<a href="#">login out</a>
		</div>
		<div id="channel"></div>
	</div>
	<div id="main">
		<div id="opt_list">
			<ul>
				<li><a href="news_add.jsp">添加新闻</a></li>
				<li><a href="../admin.jsp">编辑新闻</a></li>
				<li><a href="#">查找新闻</a></li>
				<li><a href="topic_add.jsp">添加主题</a></li>
				<li><a href="#">编辑主题</a></li>
			</ul>
		</div>
		<div id="opt_area">
			<h1 id="opt_type">修改新闻：</h1>
			<form action="update.do" method="post">
				<p>
					<label> 主题 </label> <select name="ntype">
						<!-- 					items:放集合，var:给集合取别名 -->
						<c:forEach items="${newstype}" var="newstype">
							<!-- 							test:判断条件 -->
							<option value="${newstype.ntype}"
								<c:if test="${newstype.ntype==news.ntype}">selected="selected"</c:if>>${newstype.typename}</option>
						</c:forEach>
					</select>
				</p>
				<p>
					<label> 标题 </label> <input value="${news.ntitle}" name="ntitle"
						type="text" class="opt_input" />
				</p>
				<p>
					<label> 作者 </label> <input value="${news.nauthor}" name="nauthor"
						type="text" class="opt_input" />
				</p>
				<p>
					<label> 内容 </label>
					<textarea name="nabuut" cols="70" rows="10">${news.nabuut}</textarea>
				</p>
				<p>
					<label> 上传图片 </label> <input name="file" type="file"
						class="opt_input" />
				</p>
				<input name="nid" type="hidden" value="${news.nid}"><input
					type="submit" value="提交" class="opt_sub" /> <input type="reset"
					value="重置" class="opt_sub" />
			</form>
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