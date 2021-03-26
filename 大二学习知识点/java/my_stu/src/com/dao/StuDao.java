package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Stu;
import com.util.DBhelp;

public class StuDao implements IStu {

	public int addStu(Stu stu) {
		Connection con = null;
		PreparedStatement ps = null;
		int n = 0;
		try {
			con = DBhelp.getcon();
			String sql = "insert into my_stu(sid,sname,age,sex,username,password,rtime,btime) values(?,?,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, stu.getSid());
			ps.setString(2, stu.getSname());
			ps.setInt(3, stu.getAge());
			ps.setString(4, stu.getSex());
			ps.setString(5, stu.getUsername());
			ps.setString(6, stu.getPassword());
			ps.setString(7, stu.getRtime());
			ps.setString(8, stu.getBtime());
			n = ps.executeUpdate();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			DBhelp.myClose(con, ps);
		}
		return n;
	}

	public int delStu(int sid) {
		Connection con = null;
		PreparedStatement ps = null;
		int n = 0;
		try {
			con = DBhelp.getcon();
			String sql = "delete from my_stu where sid=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, sid);
			n = ps.executeUpdate();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			DBhelp.myClose(con, ps);
		}
		return n;
	}

	public Stu getSid(int sid) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Stu stu = new Stu();
		try {
			con = DBhelp.getcon();
			String sql = "select * from my_stu where sid=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, sid);
			rs = ps.executeQuery();
			while (rs.next()) {
				stu.setSid(rs.getInt(1));
				stu.setSname(rs.getString(2));
				stu.setAge(rs.getInt(3));
				stu.setSex(rs.getString(4));
				stu.setUsername(rs.getString(5));
				stu.setPassword(rs.getString(6));
				stu.setRtime(rs.getString(7));
				stu.setBtime(rs.getString(8));
			}
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			DBhelp.myClose(con, ps, rs);
		}
		return stu;
	}

	public List<Stu> getStu(String sname, String sex) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Stu> myl = new ArrayList<Stu>();
		try {
			con = DBhelp.getcon();
			String sql = "select * from my_stu";
			if (sname != null && sex == null) {
				sql = "select * from my_stu where sname like '%" + sname + "%'";
			}
			if (sex != null && sname == null) {
				sql = "select * from my_stu where sex like '%" + sex + "%'";
			}
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Stu stu = new Stu();
				stu.setSid(rs.getInt(1));
				stu.setSname(rs.getString(2));
				stu.setAge(rs.getInt(3));
				stu.setSex(rs.getString(4));
				stu.setUsername(rs.getString(5));
				stu.setPassword(rs.getString(6));
				stu.setRtime(rs.getString(7));
				stu.setBtime(rs.getString(8));
				myl.add(stu);
			}
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			DBhelp.myClose(con, ps, rs);
		}
		return myl;
	}

	public int updateStu(int sid, Stu stu) {
		Connection con = null;
		PreparedStatement ps = null;
		int n = 0;
		try {
			con = DBhelp.getcon();
			String sql = "update my_stu set sname=?,age=?,sex=?,username=?,password=?,rtime=?,btime=? where sid=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, stu.getSname());
			ps.setInt(2, stu.getAge());
			ps.setString(3, stu.getSex());
			ps.setString(4, stu.getUsername());
			ps.setString(5, stu.getPassword());
			ps.setString(6, stu.getRtime());
			ps.setString(7, stu.getBtime());
			ps.setInt(8, sid);
			n = ps.executeUpdate();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			DBhelp.myClose(con, ps);
		}
		return n;
	}

}
