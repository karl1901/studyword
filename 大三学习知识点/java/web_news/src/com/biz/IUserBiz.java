package com.biz;

import com.entity.User;

// 用户类数据处理接口

public interface IUserBiz {

	// 登录数据处理方法
	public abstract User login(String zh, String pwd);

}
