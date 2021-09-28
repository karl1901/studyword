package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.dao.IUser;
import com.entity.User;
import com.util.DBhelp;

// 用户接口实现类
public class UserDao implements IUser {

	// 获取登录数据
	public User login(String zh, String pwd) {
		Connection con = DBhelp.getCon(); // 得到数据库连接
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = new User();
		String sql = "select * from user_01 where uname=? and upwd=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, zh);
			ps.setString(2, pwd);
			rs = ps.executeQuery();
			if (rs.next()) {
				user.setUid(rs.getInt(1));
				user.setUname(rs.getString(2));
				user.setUpwd(rs.getString(3));
				user.setAge(rs.getInt(4));
				user.setSex(rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBhelp.myClose(con, ps, rs);
		}
		return user;
	}

}
