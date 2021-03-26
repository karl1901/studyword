package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBhelp {

	private final static String name = "com.mysql.cj.jdbc.Driver";
	private final static String url = "jdbc:mysql://localhost:3306/test?&useSSL=false&serverTimezone=UTC&serverTimezone=GMT%2B8";

	static {
		try {
			Class.forName(name);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public static Connection getcon() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, "root", "010928");
		} catch (Exception e) {
			e.getStackTrace();
		}
		return con;
	}

	public final static void myClose(Connection con) {
		try {
			if (con != null && !con.isClosed()) {
				con.close();
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public final static void myClose(Connection con, PreparedStatement ps) {
		try {
			if (con != null && !con.isClosed()) {
				con.close();
			}
			if (ps != null && !ps.isClosed()) {
				ps.close();
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public final static void myClose(Connection con, PreparedStatement ps,
			ResultSet rs) {
		try {
			if (con != null && !con.isClosed()) {
				con.close();
			}
			if (ps != null && !ps.isClosed()) {
				ps.close();
			}
			if (rs != null && !rs.isClosed()) {
				rs.close();
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
