package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestResults {

	public static void main(String[] args) {
		// 声明Connection对象
		Connection con;
		// 驱动程序名
		String driver = "com.mysql.jdbc.Driver";
		// URL指向要访问的数据库名mydata
		String url = "jdbc:mysql://localhost:3306/test";
		// MySQL配置时的用户名
		String user = "root";
		// MySQL配置时的密码
		String password = "010928";
		// 遍历查询结果集
		try {
			// 加载驱动程序
			Class.forName(driver);
			// 1.getConnection()方法，连接MySQL数据库！！
			con = DriverManager.getConnection(url, user, password);
			if (!con.isClosed())
				System.out.println("Succeeded connecting to the Database!");
			// 2.创建statement类对象，用来执行SQL语句！！
			Statement statement = con.createStatement();
			// 要执行的SQL语句
			String sql = "select * from results";
			// 3.ResultSet类，用来存放获取的结果集！！
			ResultSet rs = statement.executeQuery(sql);
			System.out.println("----------------------------------------------");
			System.out.println("执行结果如下所示:");
			System.out.println("----------------------------------------------");
			System.out.println("编号" + "\t| " + "姓名" + "\t| " + "性别" + "\t| "
					+ "语文" + "\t| " + "数学" + "\t| " + "英语");
			System.out.println("----------------------------------------------");

			String sid = null;
			String sname = null;
			String sex = null;
			String chinese = null;
			String math = null;
			String english = null;
			while (rs.next()) {
				// 获取数据(列)
				sid = rs.getString("sid");
				sname = rs.getString("sname");
				sex = rs.getString("sex");
				chinese = rs.getString("chinese");
				math = rs.getString("math");
				english = rs.getString("english");

				// 输出结果
				System.out.println(sid + "\t| " + sname + "\t| " + sex + "\t| "
						+ chinese + "\t| " + math + "\t| " + english);
			}
			System.out.println("----------------------------------------------");
			rs.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// 数据库驱动类异常处理
			System.out.println("Sorry,can`t find the Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			// 数据库连接失败异常处理
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("数据库数据成功获取！！");
		}

	}

}
