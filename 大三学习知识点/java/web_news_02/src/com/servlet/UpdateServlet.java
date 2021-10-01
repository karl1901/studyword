package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.biz.INewsBiz;
import com.bizimpl.NewsBiz;
import com.entity.News;

public class UpdateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
//		获取页面传入的参数
		int nid = Integer.parseInt(req.getParameter("nid")); // 新闻编号
		int ntype = Integer.parseInt(req.getParameter("ntype")); // 新闻类别编号
		String ntitle = req.getParameter("ntitle"); // 新闻标题
		String nabuut = req.getParameter("nabuut"); // 新闻内容
		String nimage = req.getParameter("file"); // 新闻图片
		String nauthor = req.getParameter("nauthor"); // 发布作者
		News news = new News();
		news.setNtitle(ntitle);
		news.setNtype(ntype);
		news.setNabuut(nabuut);
		news.setNimage(nimage);
		news.setNauthor(nauthor);
//		把从页面获取的参数与数据库进行匹配
		INewsBiz inb = new NewsBiz();
		int n = inb.updateNews(nid, news);
		if (n == 1) {
			resp.setContentType("text/html; charset=utf-8");
			resp.setCharacterEncoding("UTF-8");
			PrintWriter out = resp.getWriter();
			out.print("<script>alert('修改成功!');location.href='admin.jsp'</script>");
		} else {
			resp.setContentType("text/html; charset=utf-8");
			resp.setCharacterEncoding("UTF-8");
			PrintWriter out = resp.getWriter();
			out.print("<script>alert('修改失败!');location.href='updatenews.jsp'</script>");
		}
	}

}
