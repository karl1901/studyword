package com.bizimpl;

import java.util.List;

import com.biz.IGoodsBiz;
import com.dao.IGoods;
import com.daoimpl.GoodsDao;
import com.entity.Goods;

public class GoodsBiz implements IGoodsBiz {

	IGoods ig = new GoodsDao();

//	查询所有商品
	@Override
	public List<Goods> queryAll() {
		List<Goods> myl = ig.queryAll();
		return myl;
	}

}
