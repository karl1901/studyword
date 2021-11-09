package com.servletDo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginDo implements TotalDo {

	@Override
	public void asy(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("登录处理页面");
	}

}
