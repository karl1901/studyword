package com.biz;

import java.util.List;

import com.entity.News;

public interface INewsBiz {

	// 查询所有新闻的方法
	public abstract List<News> getAll(int index, int page);

	// 模糊查询
	public abstract List<News> getNtitle(String ntitle, int index, int page);

	// 查看新闻详情
	public abstract News getNews(int nid);

	// 增加新闻
	public abstract int addNews(News news);

	// 删除新闻(根据新闻编号)
	public abstract int delNews(int nid);

	// 修改新闻
	public abstract int updateNews(int nid, News news);

}
