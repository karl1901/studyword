package com.dao;

import java.util.List;

import com.entity.Goods;

// 商品类方法设计接口

public interface IGoods {

//	查询所有商品
	public abstract List<Goods> queryAll();

}
