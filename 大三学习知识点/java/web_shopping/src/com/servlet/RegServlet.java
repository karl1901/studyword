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

public class RegServlet extends HttpServlet {

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
		String uname = req.getParameter("name");
		String uzh = req.getParameter("zh");
		String upwd = req.getParameter("pwd");
		int age = Integer.parseInt(req.getParameter("age"));
		String sex = req.getParameter("sex");
		String tel = req.getParameter("tel");
		String addres = req.getParameter("addres");
		User user = new User();
		user.setUname(uname);
		user.setUzh(uzh);
		user.setUpwd(upwd);
		user.setAge(age);
		user.setSex(sex);
		user.setTel(tel);
		user.setAddres(addres);
		user.setUmum(null);
		IUserBiz iub = new UserBiz();
//		调用注册方法
		int n = iub.addUser(user);
//		判断是否注册成功
		if (n == 1) {
//			注册成功后提示用户，然后跳转到注册页面
			PrintWriter out = resp.getWriter();
			out.print("<script>alert('注册成功!');location.href='reg.jsp'</script>");
		} else {
//			注册失败后提示用户，然后跳转到注册页面
			PrintWriter out = resp.getWriter();
			out.print("<script>alert('注册失败!');location.href='reg.jsp'</script>");
		}
	}

}
