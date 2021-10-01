package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.biz.INewsBiz;
import com.biz.INewsTypeBiz;
import com.bizimpl.NewsBiz;
import com.bizimpl.NewsTypeBiz;
import com.entity.News;
import com.entity.NewsType;

public class ReadServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		获取页面修改新闻的nid
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		int nid = Integer.parseInt(req.getParameter("nid"));
		INewsBiz inb = new NewsBiz();
		News news = inb.getNews(nid);
		if (news.getNtitle() != null) {
			HttpSession session = req.getSession();
//			把新闻对象放至session中
			session.setAttribute("read_news", news);
			resp.sendRedirect("news_read.jsp");
		} else {
			resp.sendRedirect("admin.jsp");
		}

	}

}
