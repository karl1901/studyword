package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Teacher;
import com.util.DBhelp;

public class TerDao implements ITer {

	public int addTer(Teacher ter) {
		Connection con = null;
		PreparedStatement ps = null;
		int n = 0;
		try {
			con = DBhelp.getcon();
			String sql = "insert into teacher(tid,tname,age,sex,tername,terpwd,cid) values(?,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, ter.getTid());
			ps.setString(2, ter.getTname());
			ps.setInt(3, ter.getAge());
			ps.setString(4, ter.getSex());
			ps.setString(5, ter.getTername());
			ps.setString(6, ter.getTerpwd());
			ps.setInt(7, ter.getCid());
			n = ps.executeUpdate();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			DBhelp.myClose(con, ps);
		}
		return n;
	}

	public int delTer(int tid) {
		Connection con = null;
		PreparedStatement ps = null;
		int n = 0;
		try {
			con = DBhelp.getcon();
			String sql = "delete from teacher where tid=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, tid);
			n = ps.executeUpdate();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			DBhelp.myClose(con, ps);
		}
		return n;
	}

	public List<Teacher> getTer(String tname, String sex) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Teacher> myl = new ArrayList<Teacher>();
		try {
			con = DBhelp.getcon();
			String sql = "select * from teacher";
			if (tname != null && sex == null) {
				sql = "select * from teacher where tname like '%" + tname
						+ "%'";
			}
			if (sex != null && tname == null) {
				sql = "select * from teacher where sex like '%" + sex + "%'";
			}
			if (tname != null && sex != null) {
				System.out.println("系统错误，不能同时模糊查询姓名和性别 !");
				sql = "exit;";
			}
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Teacher ter = new Teacher();
				ter.setTid(rs.getInt(1));
				ter.setTname(rs.getString(2));
				ter.setAge(rs.getInt(3));
				ter.setSex(rs.getString(4));
				ter.setTername(rs.getString(5));
				ter.setTerpwd(rs.getString(6));
				ter.setCid(rs.getInt(7));
				myl.add(ter);
			}
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			DBhelp.myClose(con, ps, rs);
		}
		return myl;
	}

	public int updateTer(int tid, Teacher ter) {
		Connection con = null;
		PreparedStatement ps = null;
		int n = 0;
		try {
			con = DBhelp.getcon();
			String sql = "update teacher set tname=?,age=?,sex=?,tername=?,terpwd=?,cid=? where tid=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, ter.getTname());
			ps.setInt(2, ter.getAge());
			ps.setString(3, ter.getSex());
			ps.setString(4, ter.getTername());
			ps.setString(5, ter.getTerpwd());
			ps.setInt(6, ter.getCid());
			ps.setInt(7, tid);
			n = ps.executeUpdate();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			DBhelp.myClose(con, ps);
		}
		return n;
	}

	@Override
	public Teacher Login(String tername, String terpwd) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Teacher ter = new Teacher();
		try {
			con = DBhelp.getcon();
			String sql = "select * from teacher where tername=? and terpwd=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, tername);
			ps.setString(2, terpwd);
			rs = ps.executeQuery();
			while (rs.next()) {
				ter.setTid(rs.getInt(1));
				ter.setTname(rs.getString(2));
				ter.setAge(rs.getInt(3));
				ter.setSex(rs.getString(4));
				ter.setTername(rs.getString(5));
				ter.setTerpwd(rs.getString(6));
				ter.setCid(rs.getInt(7));
			}
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			DBhelp.myClose(con, ps, rs);
		}
		return ter;
	}

}
