<%@ page language="java" import="java.util.*,java.sql.*"
	pageEncoding="UTF-8"%>
<%
	// 数据处理页面
	request.setCharacterEncoding("UTF-8"); // 设置编码
	// 获取页面提交的数据
	String uname = request.getParameter("uname");
	String upwd = request.getParameter("upwd");
	int age = Integer.parseInt(request.getParameter("age"));
	String sex = request.getParameter("sex");

	// 把获取的数据写入数据库表中
	// 加载MySql运行包
	Class.forName("com.mysql.cj.jdbc.Driver");
	// 需要连接数据库的名称
	String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=GMT%2b8";
	// 获取数据连接
	Connection con = DriverManager.getConnection(url, "root", "010928");
	// 需要执行的Sql语句
	String sql = "insert into user_01(uid,uname,upwd,age,sex) values (?,?,?,?,?)";
	// 执行Sql语句
	PreparedStatement ps = con.prepareStatement(sql);
	// 开始向数据库写入数据
	ps.setInt(1, 1);
	ps.setString(2, uname);
	ps.setString(3, upwd);
	ps.setInt(4, age);
	ps.setString(5, sex);
	// 获取数据库的返回结果
	int n = ps.executeUpdate();
	if (n > 0) {
		out.println("注册成功!");
	} else {
		out.println("注册失败!");
	}
%>