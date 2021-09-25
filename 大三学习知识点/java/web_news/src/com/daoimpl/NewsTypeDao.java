package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dao.INewsType;
import com.entity.NewsType;
import com.util.DBhelp;

public class NewsTypeDao implements INewsType {

//	查询所有新闻类别
	public List<NewsType> getAll() {
		Connection con = null; // 获取数据库连接
		PreparedStatement ps = null; // 执行sql语句接口
		ResultSet rs = null; // 接收返回结果接口
		List<NewsType> myl = new ArrayList<NewsType>();
		try {
			con = DBhelp.getCon();
			String sql = "select * from newstype";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				NewsType newsType = new NewsType();
				newsType.setTypeid(rs.getInt(1));
				newsType.setNtype(rs.getInt(2));
				newsType.setTypename(rs.getString(3));
				myl.add(newsType);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBhelp.myClose(con, ps, rs);
		}
		return myl;

	}

}
