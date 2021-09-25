package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dao.INews;
import com.entity.News;
import com.util.DBhelp;

// 新闻获取数据库数据实现类

public class NewsDao implements INews {

//	查询所有
	public List<News> getAll(int index, int page) {
		Connection con = null; // 获取数据库连接
		PreparedStatement ps = null; // 执行sql语句接口
		ResultSet rs = null; // 接收返回结果接口
		List<News> myl = new ArrayList<News>();
		try {
			con = DBhelp.getCon();
			String sql = "select * from news limit ?,?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, index);
			ps.setInt(2, page);
			rs = ps.executeQuery();
			while (rs.next()) {
				News news = new News();
				news.setNid(rs.getInt(1));
				news.setNtype(rs.getInt(2));
				news.setNtitle(rs.getString(3));
				news.setNabuut(rs.getString(4));
				news.setNimage(rs.getString(5));
				news.setNauthor(rs.getString(6));
				news.setNtime(rs.getString(7));
				myl.add(news);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBhelp.myClose(con, ps, rs);
		}
		return myl;
	}

//	模糊查询
	public List<News> getNtitle(String ntitle, int index, int page) {
		Connection con = null; // 获取数据库连接
		PreparedStatement ps = null; // 执行sql语句接口
		ResultSet rs = null; // 接收返回结果接口
		List<News> myl = new ArrayList<News>();
		try {
			con = DBhelp.getCon();
			String sql = "select * from news where ntitle like '%" + ntitle + "%' limit ?,?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, index);
			ps.setInt(2, page);
			rs = ps.executeQuery();
			while (rs.next()) {
				News news = new News();
				news.setNid(rs.getInt(1));
				news.setNtype(rs.getInt(2));
				news.setNtitle(rs.getString(3));
				news.setNabuut(rs.getString(4));
				news.setNimage(rs.getString(5));
				news.setNauthor(rs.getString(6));
				news.setNtime(rs.getString(7));
				myl.add(news);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBhelp.myClose(con, ps, rs);
		}
		return myl;
	}

//	查询单个
	public News getNews(int nid) {
		Connection con = null; // 获取数据库连接
		PreparedStatement ps = null; // 执行sql语句接口
		ResultSet rs = null; // 接收返回结果接口
		News news = new News();
		try {
			con = DBhelp.getCon();
			String sql = "select * from news where nid = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, nid);
			rs = ps.executeQuery();
			while (rs.next()) {
				news.setNid(rs.getInt(1));
				news.setNtype(rs.getInt(2));
				news.setNtitle(rs.getString(3));
				news.setNabuut(rs.getString(4));
				news.setNimage(rs.getString(5));
				news.setNauthor(rs.getString(6));
				news.setNtime(rs.getString(7));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBhelp.myClose(con, ps, rs);
		}
		return news;
	}

//	增加新闻
	public int addNews(News news) {
		return 0;
	}

//	删除新闻
	public int delNews(int nid) {
		Connection con = null; // 获取数据库连接
		PreparedStatement ps = null; // 执行sql语句接口
		int n = 0;
		try {
			con = DBhelp.getCon();
			String sql = "delete from news where nid = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, nid);
			n = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBhelp.myClose(con, ps);
		}
		return n;
	}

//	修改新闻
	public int updateNews(int nid, News news) {
		Connection con = null; // 获取数据库连接
		PreparedStatement ps = null; // 执行sql语句接口
		int n = 0;
		// 获取时间类的对象
		Date date = new Date();
		// 获取系统当前时间
		String ntime = date.toLocaleString();
		try {
			con = DBhelp.getCon();
			String sql = "update news set ntype=?,ntitle=?,nabuut=?,nimage=?,nauthor=?,ntime=? where nid=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, news.getNtype());
			ps.setString(2, news.getNtitle());
			ps.setString(3, news.getNabuut());
			ps.setString(4, news.getNimage());
			ps.setString(5, news.getNauthor());
			ps.setString(6, ntime);
			ps.setInt(7, nid);
			n = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBhelp.myClose(con, ps);
		}
		return n;
	}

//	获取新闻总条数
	public int getMax() {
		Connection con = null; // 获取数据库连接
		PreparedStatement ps = null; // 执行sql语句接口
		ResultSet rs = null; // 接收返回结果接口
		int max = 0; // 新闻条数
		try {
			con = DBhelp.getCon();
			String sql = "select count(*) from news";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if (rs.next()) {
				max = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBhelp.myClose(con, ps, rs);
		}
		return max;
	}

}
