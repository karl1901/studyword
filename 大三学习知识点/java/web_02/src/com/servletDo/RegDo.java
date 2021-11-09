package com.servletDo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegDo implements TotalDo {

	public void asy(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("进入注册处理页面...");
	}

}
