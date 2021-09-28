package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.biz.IUserBiz;
import com.bizimpl.UserBiz;
import com.entity.User;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String uname = req.getParameter("uname");
		String upwd = req.getParameter("upwd");
//		把从页面获取的参数与数据库进行匹配
		IUserBiz iub = new UserBiz();
		User user = iub.login(uname, upwd);
		if (user.getUname() != null) {
//			session赋值给页面用户登录名
			HttpSession hs = req.getSession();
			hs.setAttribute("token", user.getUname());
			req.getRequestDispatcher("admin.jsp").forward(req, resp);
		} else {
			resp.setContentType("text/html; charset=utf-8");
			resp.setCharacterEncoding("UTF-8");
			PrintWriter out = resp.getWriter();
			out.print("<script>alert('账号或密码错误');location.href='login.html'</script>");
		}
	}

}
