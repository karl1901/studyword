package com.bizimpl;

import java.util.List;

import com.biz.INewsTypeBiz;
import com.dao.INewsType;
import com.daoimpl.NewsTypeDao;
import com.entity.NewsType;

public class NewsTypeBiz implements INewsTypeBiz {

	INewsType iny = new NewsTypeDao();

//	查询所有新闻类别
	public List<NewsType> getAll() {
		return iny.getAll();
	}

}
