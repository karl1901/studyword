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
<title>新闻中国</title>
<link href="CSS/read.css" rel="stylesheet" type="text/css" />
<script type="text/javascript">
	function check() {
		var cauthor = document.getElementById("cauthor");
		var content = document.getElementById("ccontent");
		if (cauthor.value == "") {
			alert("用户名不能为空！！");
			return false;
		} else if (content.value == "") {
			alert("评论内容不能为空！！");
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<div id="header">
		<div id="top_login">
			<label> 登录名 </label> <input type="text" id="uname" value=""
				class="login_input" /> <label> 密&#160;&#160;码 </label> <input
				type="password" id="upwd" value="" class="login_input" /> <input
				type="button" class="login_sub" value="登录" onclick="login()" /> <label
				id="error"> </label> <a href="../index.html" class="login_link">返回首页</a>
			<img src="images/friend_logo.gif" alt="Google" id="friend_logo" />
		</div>
		<div id="nav">
			<div id="logo">
				<img src="images/logo.jpg" alt="新闻中国" />
			</div>
			<div id="a_b01">
				<img src="images/a_b01.gif" alt="" />
			</div>
			<!--mainnav end-->
		</div>
	</div>
	<div id="container">
		<div class="sidebar">
			<h1>
				<img src="images/title_1.gif" alt="国内新闻" />
			</h1>
			<div class="side_list">
				<ul>
					<li><a href='#'><b> 重庆涉黑富豪黎强夫妇庭审答辩言辞相互矛盾 </b></a></li>
					<li><a href='#'><b> 发改委：4万亿投资计划不会挤占民间投资空间 </b></a></li>
					<li><a href='#'><b> 河南2个乡镇政绩报告内容完全一致引关注 </b></a></li>
				</ul>
			</div>
			<h1>
				<img src="images/title_2.gif" alt="国际新闻" />
			</h1>
			<div class="side_list">
				<ul>
					<li><a href='#'><b> 日本首相鸠山首次全面阐述新政府外交政策 </b></a></li>
					<li><a href='#'><b> 黎巴嫩以色列再次交火互射炮弹 </b></a></li>
					<li><a href='#'><b> 伊朗将于30日前就核燃料供应方案作出答复 </b></a></li>
					<li><a href='#'><b> 与基地有关组织宣称对巴格达连环爆炸负责 </b></a></li>
				</ul>
			</div>
			<h1>
				<img src="images/title_3.gif" alt="娱乐新闻" />
			</h1>
			<div class="side_list">
				<ul>
					<li><a href='#'><b> 施瓦辛格启动影视业回迁计划 推进加州经济复苏 </b></a></li>
					<li><a href='#'><b> 《沧海》导演回应观众质疑 自信能超越《亮剑》 </b></a></li>
					<li><a href='#'><b> 《海角七号》导演新片开机 吴宇森等出席 </b></a></li>
					<li><a href='#'><b> 《四大名捕》敦煌热拍 八主演飙戏火花四溅 </b></a></li>
				</ul>
			</div>
		</div>
		<div class="main">
			<div class="class_type">
				<img src="images/class_type.gif" alt="新闻中心" />
			</div>
			<div class="content">
				<ul class="classlist">
					<table width="80%" align="center">
						<%
							//获取主页面跳过来的nid--新闻编号
							request.setCharacterEncoding("UTF-8");
							int nid = Integer.parseInt(request.getParameter("nid"));
							System.out.println("新闻编号：" + nid);
							INewsBiz inb = new NewsBiz();
							News news = inb.getNews(nid);
						%>
						<tr width="100%">
							<td colspan="2" align="center"><%=news.getNtitle()%></td>
						</tr>
						<tr>
							<td colspan="2"><hr /></td>
						</tr>
						<tr>
							<td align="center"><%=news.getNtime()%></td>
							<td align="left"><%=news.getNauthor()%></td>
						</tr>
						<tr>
							<td colspan="2" align="center"></td>
						</tr>
						<tr>
							<td colspan="2"><%=news.getNabuut()%></td>
						</tr>
						<tr>
							<td colspan="2"><hr /></td>
						</tr>
					</table>
				</ul>
				<ul class="classlist">
					<table width="80%" align="center">
						<td colspan="6">暂无评论！</td>
						<tr>
							<td colspan="6"><hr /></td>
						</tr>
					</table>
				</ul>
				<ul class="classlist">
					<form action="#" method="post" onsubmit="return check()">
						<table width="80%" align="center">
							<tr>
								<td>评 论</td>
							</tr>
							<tr>
								<td>用户名：</td>
								<td><input id="cauthor" name="cauthor" value="这家伙很懒什么也没留下" />
									IP： <input name="cip" value="127.0.0.1" readonly="readonly" />
								</td>
							</tr>
							<tr>
								<td colspan="2"><textarea name="ccontent" cols="70"
										rows="10"></textarea></td>
							</tr>
							<td><input name="submit" value="发  表" type="submit" /></td>
						</table>
					</form>
				</ul>
			</div>
		</div>
	</div>
	<div id="friend">
		<h1 class="friend_t">
			<img src="images/friend_ico.gif" alt="合作伙伴" />
		</h1>
		<div class="friend_list">
			<ul>
				<li><a href="#">中国政府网</a></li>
				<li><a href="#">中国政府网</a></li>
				<li><a href="#">中国政府网</a></li>
				<li><a href="#">中国政府网</a></li>
				<li><a href="#">中国政府网</a></li>
				<li><a href="#">中国政府网</a></li>
				<li><a href="#">中国政府网</a></li>
			</ul>
		</div>
	</div>
	<div id="footer">
		<p class="">
			24小时客户服务热线：010-68988888 &#160;&#160;&#160;&#160; <a href="#">常见问题解答</a>
			&#160;&#160;&#160;&#160; 新闻热线：010-627488888 <br />
			文明办网文明上网举报电话：010-627488888 &#160;&#160;&#160;&#160; 举报邮箱： <a href="#">jubao@jb-aptech.com.cn</a>
		</p>
		<p class="copyright">
			Copyright &copy; 1999-2009 News China gov, All Right Reserver <br />
			新闻中国 版权所有
		</p>
	</div>
</body>
</html>