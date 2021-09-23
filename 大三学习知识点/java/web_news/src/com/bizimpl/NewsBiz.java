package com.bizimpl;

import java.util.List;

import com.biz.INewsBiz;
import com.dao.INews;
import com.daoimpl.NewsDao;
import com.entity.News;

// 实现新闻数据处理接口

public class NewsBiz implements INewsBiz {

//	新闻获取数据库内容的对象
	INews in = new NewsDao();

//	查询所有(分页)
	public List<News> getAll(int index, int page) {
		List<News> myl = in.getAll(index, page);
		return myl;
	}

//	模糊查询
	public List<News> getNtitle(String ntitle, int index, int page) {
		List<News> myl = in.getNtitle(ntitle, index, page);
		return myl;
	}

//	查看新闻详情
	public News getNews(int nid) {
		News news = in.getNews(nid);
		return news;
	}

//	增加新闻
	public int addNews(News news) {
		return 0;
	}

//	删除新闻
	public int delNews(int nid) {
		return 0;
	}

//	修改新闻
	public int updateNews(int nid, News news) {
		return 0;
	}

//	获取新闻总条数
	public int getMax() {
		int max = in.getMax();
		return max;
	}

}
