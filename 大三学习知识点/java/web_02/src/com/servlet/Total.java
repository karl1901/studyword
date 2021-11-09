package com.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servletDo.LoginDo;
import com.servletDo.TotalDo;

// 核心处理器类

public class Total extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("进入核心处理器类....");
		// 判断跳转过来的路径
		String uri = req.getRequestURI();
		System.out.println(uri);
		// 获取到跳转对象路径不一样的对象
		uri = uri.substring(uri.lastIndexOf("/") + 1, uri.lastIndexOf("."));
		System.out.println(uri);
		// 加载配置文件的对象
		Properties properties = new Properties();
		// 获取文件所在服务器路径(tomcat-webapp)
		String path = req.getSession().getServletContext().getRealPath("/");
		System.out.println(path);
		// 拼接路径
		path = path + "WEB-INF\\config.properties";
		// 开始加载文件
		FileInputStream fis = new FileInputStream(path);
		properties.load(fis);
		// 通过加载文件配置获取对应的类对象
		String classname = properties.getProperty(uri);
		try {
			// 把类对象转化为对应的类
			TotalDo class1 = (TotalDo) Class.forName(classname).newInstance();
			class1.asy(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
