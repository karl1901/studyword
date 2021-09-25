package com.biz;

import java.util.List;

import com.entity.NewsType;

// 新闻类数据处理接口

public interface INewsTypeBiz {

	// 查询所有新闻类别的方法
	public abstract List<NewsType> getAll();

}
