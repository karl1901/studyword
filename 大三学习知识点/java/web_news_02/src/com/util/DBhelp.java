package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBhelp {

	private final static String name = "com.mysql.cj.jdbc.Driver";
	private final static String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&characterSetResults=utf8&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=GMT%2b8";

//	加载驱动
	static {
		try {
			Class.forName(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	获取数据库连接
	public static Connection getCon() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, "karl", "Karl010928...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

//	关闭数据库的方法
	public final static void myClose(Connection con) {
		try {
			if (con != null && con.isClosed()) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public final static void myClose(Connection con, PreparedStatement ps) {
		try {
			if (con != null && con.isClosed()) {
				con.close();
			}
			if (ps != null && ps.isClosed()) {
				ps.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public final static void myClose(Connection con, PreparedStatement ps, ResultSet rs) {
		try {
			if (con != null && con.isClosed()) {
				con.close();
			}
			if (ps != null && ps.isClosed()) {
				ps.close();
			}
			if (rs != null && rs.isClosed()) {
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
