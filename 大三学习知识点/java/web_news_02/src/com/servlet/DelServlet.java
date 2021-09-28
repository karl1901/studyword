package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.biz.INewsBiz;
import com.biz.IUserBiz;
import com.bizimpl.NewsBiz;
import com.bizimpl.UserBiz;
import com.entity.User;

public class DelServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		int nid = Integer.parseInt(req.getParameter("nid"));
//		把从页面获取的参数与数据库进行匹配
		INewsBiz inb = new NewsBiz();
		int n = inb.delNews(nid);
		if (n == 1) {
//			设置编码,防止中文乱码
			resp.setContentType("text/html; charset=utf-8");
			resp.setCharacterEncoding("UTF-8");
			PrintWriter out = resp.getWriter();
//			提示用户并跳转页面
			out.print("<script>alert('删除成功!');location.href='admin.jsp'</script>");
		} else {
			resp.setContentType("text/html; charset=utf-8");
			resp.setCharacterEncoding("UTF-8");
			PrintWriter out = resp.getWriter();
			out.print("<script>alert('删除失败!');location.href='admin.jsp'</script>");
		}
	}

}
