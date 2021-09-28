package com.dao;

import java.util.List;

import com.entity.NewsType;

// 新闻类别方法接口(获取数据库信息)

public interface INewsType {

	// 查询所有新闻类别的方法
	public abstract List<NewsType> getAll();

}
