package com.dao;

import java.util.List;

import com.entity.Goods;

// 商品类方法设计接口

public interface IGoods {

	// 查询所有商品
	public abstract List<Goods> queryAll();

	// 根据商品编号，获取对应商品的方法
	public abstract Goods getGoods(int bid);

}
