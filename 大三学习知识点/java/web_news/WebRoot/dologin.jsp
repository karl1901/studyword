<%@page import="com.entity.User"%>
<%@page import="com.bizimpl.UserBiz"%>
<%@page import="com.biz.IUserBiz"%>
<%@page import="com.dao.IUser"%>
<%@page import="com.util.DBhelp"%>
<%@page import="sun.print.resources.serviceui"%>
<%@ page language="java" import="java.util.*,java.sql.*"
	pageEncoding="UTF-8"%>
<%
	// 数据处理页面
	request.setCharacterEncoding("UTF-8"); // 设置编码
	// 获取页面提交的数据
	String uname = request.getParameter("uname");
	String upwd = request.getParameter("upwd");

	IUserBiz iub = new UserBiz();
	User user = iub.login(uname, upwd);

	if (user != null) { // 有用户
		// 给登录成功的用户发通行证
		session.setAttribute("token", uname);
		// 给通行证设置时效(单位：秒)
		session.setMaxInactiveInterval(30);

		// COokie-保存用户信息
		// 创建一个Cookie文件
		//Cookie cookie = new Cookie("tokens", uname);
		// 给Cookie设置时效(单位：秒)
		//cookie.setMaxAge(60 * 60 * 24 * 7);
		// 把Cookie放置到response
		//response.addCookie(cookie);

		// 访问量
		// 创建一个用户集合
		List<String> myl = new ArrayList<String>(); // 第一次登录时被创建
		if ((ArrayList<String>) application.getAttribute("fwl") != null) {
			myl = (ArrayList<String>) application.getAttribute("fwl");
		}
		// 把用户的姓名放到集合中
		myl.add(uname);
		application.setAttribute("fwl", myl);

		out.println("登录成功!" + "</br>");
		out.println("<script>location.href='admin.jsp'</script>");

	} else {
		out.println("<script>alert('账号或密码错误!')</script>");
		out.println("<script>location.href='login.html'</script>");
	}
%>