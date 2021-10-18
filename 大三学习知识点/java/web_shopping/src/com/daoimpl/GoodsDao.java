package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.dao.IGoods;
import com.entity.Goods;
import com.util.DBhelp;

// 商品类方法实现类

public class GoodsDao implements IGoods {

//	查询所有商品的方法
	@Override
	public List<Goods> queryAll() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Goods> myl = new ArrayList<Goods>();
		try {
			con = DBhelp.getCon();
			String sql = "select * from goods";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Goods goods = new Goods();
				goods.setBid(rs.getInt(1));
				goods.setBname(rs.getString(2));
				goods.setBprice(rs.getDouble(3));
				goods.setBinfo(rs.getString(4));
				goods.setBimage(rs.getString(5));
				myl.add(goods);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBhelp.myClose(con, ps, rs);
		}
		return myl;
	}

//	根据商品编号，获取商品的方法
	@Override
	public Goods getGoods(int bid) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Goods goods = new Goods();
		try {
			con = DBhelp.getCon();
			String sql = "select * from goods where bid = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, bid);
			rs = ps.executeQuery();
			if (rs.next()) {
				goods.setBid(rs.getInt(1));
				goods.setBname(rs.getString(2));
				goods.setBprice(rs.getDouble(3));
				goods.setBinfo(rs.getString(4));
				goods.setBimage(rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBhelp.myClose(con, ps, rs);
		}
		return goods;
	}

}
