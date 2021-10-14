package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.biz.IGoodsBiz;
import com.bizimpl.GoodsBiz;
import com.entity.Goods;

public class GoodsServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IGoodsBiz igb = new GoodsBiz();
		// 获取所有商品
		List<Goods> myl = igb.queryAll();
		req.setCharacterEncoding("utf-8");
		HttpSession hs = req.getSession();
		// 把商品集合放入session
		hs.setAttribute("glist", myl);
		// 重定向跳转
		resp.sendRedirect("admin.jsp");
	}

}
