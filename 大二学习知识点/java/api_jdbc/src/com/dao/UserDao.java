package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.entity.User;
import com.util.DBhelp;

public class UserDao implements IUser {

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		int n = 0;
		try {
			con = DBhelp.getcon(); // 获取数据连接
			// 需要执行的SQL语句
			String sql = "insert into user(uid,uname,sex,age,utime) values(?,?,?,?,?)";
			// 执行SQL语句
			ps = con.prepareStatement(sql);
			ps.setInt(1, user.getUid());
			ps.setString(2, user.getUname());
			ps.setString(3, user.getSex());
			ps.setInt(4, user.getAge());
			ps.setString(5, user.getUtime());
			n = ps.executeUpdate(); // 获得数据库返回结果
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBhelp.myClose(con, ps); // 关闭使用的连接接口
		}
		return n;
	}

	@Override
	public int delUser(int uid) {
		// TODO Auto-generated method stub
		Connection con = null; // 用来装数据连接的
		PreparedStatement ps = null; // 用来执行sql语句
		int n = 0; // 用来做判断依据
		try {
			con = DBhelp.getcon(); // 获取连接
			String sql = "delete from user where uid=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, uid);
			n = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBhelp.myClose(con, ps);
		}
		return n;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<User> myl = new ArrayList<User>();
		try {
			// 获取连接
			con = DBhelp.getcon();
			// 需要执行的SQL语句
			String sql = "select * from user";
			// 执行SQL语句
			ps = con.prepareStatement(sql);
			// 提取相关内容(对象)
			rs = ps.executeQuery();
			// 遍历给对象赋值
			while (rs.next()) { // 迭代器
				User user = new User(); // 创建一个用户对象(用来装从表里面取过来的每行数据)
				user.setUid(rs.getInt(1));
				user.setUname(rs.getString(2));
				user.setSex(rs.getString(3));
				user.setAge(rs.getInt(4));
				user.setUtime(rs.getString(5));
				myl.add(user); // 把对象放入集合中
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBhelp.myClose(con, ps, rs);
		}
		return myl;
	}

	@Override
	public List<User> getUname(String uname) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<User> myl = new ArrayList<User>();
		try {
			con = DBhelp.getcon();
			String sql = "select * from user where uname like '%" + uname
					+ "%'";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setUid(rs.getInt(1));
				user.setUname(rs.getString(2));
				user.setSex(rs.getString(3));
				user.setAge(rs.getInt(4));
				user.setUtime(rs.getString(5));
				myl.add(user);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBhelp.myClose(con, ps, rs);
		}
		return myl;
	}

	@Override
	public User getUser(int uid) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = new User();
		try {
			con = DBhelp.getcon();
			String sql = "select * from user where uid=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, uid);
			rs = ps.executeQuery();
			while (rs.next()) {
				user.setUid(rs.getInt(1));
				user.setUname(rs.getString(2));
				user.setSex(rs.getString(3));
				user.setAge(rs.getInt(4));
				user.setUtime(rs.getString(5));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBhelp.myClose(con, ps, rs);
		}
		return user;
	}

	@Override
	public int updateUser(int uid, User user) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		int n = 0;
		try {
			con = DBhelp.getcon();
			String sql = "update user set uname=?,sex=?,age=?,utime=? where uid=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUname());
			ps.setString(2, user.getSex());
			ps.setInt(3, user.getAge());
			ps.setString(4, user.getUtime());
			ps.setInt(5, uid);
			n = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBhelp.myClose(con, ps);
		}
		return n;
	}

}
