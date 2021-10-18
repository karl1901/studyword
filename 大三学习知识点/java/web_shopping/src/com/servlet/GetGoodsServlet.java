package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.biz.IGoodsBiz;
import com.bizimpl.GoodsBiz;
import com.entity.Goods;

public class GetGoodsServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 把商品放至购物车
		// 获取商品页面传的bid
		req.setCharacterEncoding("utf-8");
		int bid = Integer.parseInt(req.getParameter("bid"));
		IGoodsBiz igb = new GoodsBiz();
		Goods goods = igb.getGoods(bid);
		HttpSession hs = req.getSession();
		// 创建一个商品集合
		List<Goods> myl = new ArrayList<Goods>();
		// 当第二次加入至购物车时(先获取已存在的session中的集合)
		List<Goods> list = (List<Goods>) hs.getAttribute("getlist");
		// 不是第一次加入购物车
		if (list != null) {
			myl = list;
		}
		// 把查找到的商品放入集合中
		myl.add(goods);
		hs.setAttribute("getlist", myl);
		resp.sendRedirect("shopping.jsp");

	}

}
