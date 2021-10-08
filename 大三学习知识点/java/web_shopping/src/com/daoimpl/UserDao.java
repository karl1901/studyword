package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.dao.IUser;
import com.entity.User;
import com.util.DBhelp;

import sun.print.resources.serviceui;

//	用户类方法实现类

public class UserDao implements IUser {

//	用户注册
	@Override
	public int addUser(User user) {
		Connection con = null;
		PreparedStatement ps = null;
		int n = 0;
		try {
			con = DBhelp.getCon();
			String sql = "insert into shopping_user (uname,uzh,upwd,age,sex,tel,addres,unum) values (?,?,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUname());
			ps.setString(2, user.getUzh());
			ps.setString(3, user.getUpwd());
			ps.setInt(4, user.getAge());
			ps.setString(5, user.getSex());
			ps.setString(6, user.getTel());
			ps.setString(7, user.getAddres());
			ps.setString(8, user.getUmum());
			n = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBhelp.myClose(con, ps);
		}
		return n;
	}

//	用户登录
	@Override
	public User login(String uzh, String upwd) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = new User();
		try {
			con = DBhelp.getCon();
			String sql = "select * from shopping_user where uzh=? and upwd=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, uzh);
			ps.setString(2, upwd);
			rs = ps.executeQuery();
			if (rs.next()) {
				user.setUid(rs.getInt(1));
				user.setUname(rs.getString(2));
				user.setUzh(rs.getString(3));
				user.setUpwd(rs.getString(4));
				user.setAge(rs.getInt(5));
				user.setSex(rs.getString(6));
				user.setTel(rs.getString(7));
				user.setAddres(rs.getString(8));
				user.setUmum(rs.getString(9));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBhelp.myClose(con, ps, rs);
		}
		return user;
	}

}
