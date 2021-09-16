<%@ page language="java" import="java.util.*,java.sql.*"
	pageEncoding="UTF-8"%>
<%
	// 数据处理页面
	request.setCharacterEncoding("UTF-8"); // 设置编码
	// 获取页面提交的数据
	String uname = request.getParameter("uname");
	String upwd = request.getParameter("upwd");

	// 把获取的数据写入数据库表中
	// 加载MySql运行包
	Class.forName("com.mysql.cj.jdbc.Driver");
	// 需要连接数据库的名称
	String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=GMT%2b8";
	// 获取数据连接
	Connection con = DriverManager.getConnection(url, "karl", "Karl010928...");
	// 需要执行的Sql语句
	String sql = "select * from user_01 where uname=? and upwd=?";
	// 执行Sql语句
	PreparedStatement ps = con.prepareStatement(sql);
	// 写入数据
	ps.setString(1, uname);
	ps.setString(2, upwd);
	// 获取数据库的返回结果
	ResultSet rs = ps.executeQuery();
	int n = 0;
	if (rs.next()) {
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

		n = 1;
	}
	if (n > 0) {
		out.println("登录成功!" + "</br>");
		out.println("<script>location.href='admin.jsp'</script>");
	} else {
		out.println("<script>alert('账号或密码错误!')</script>");
		out.println("<script>location.href='login.html'</script>");
	}
%>