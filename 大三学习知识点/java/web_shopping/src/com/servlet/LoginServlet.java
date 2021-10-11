package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
		// 设置编码
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=utf-8");
//		获取传入的参数
		String uzh = req.getParameter("zh");
		String upwd = req.getParameter("pwd");
		IUserBiz iub = new UserBiz();
//		调用登陆方法
		User user = iub.login(uzh, upwd);
//		判断是否登录成功
		if (user.getUname() != null) {
//			成功后把用户信息保存到session
			HttpSession hs = req.getSession();
			hs.setAttribute("user", user);
//			跳转到admin.jsp
			resp.sendRedirect("admin.jsp");
		} else {
//			登录失败后提示用户，然后跳转到登录页面
			PrintWriter out = resp.getWriter();
			out.print("<script>alert('账号或密码错误');location.href='index.jsp'</script>");
		}
	}

}
