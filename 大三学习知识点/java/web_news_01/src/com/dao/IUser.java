package com.dao;

import com.entity.User;

public interface IUser {

	// 用户登录
	public abstract User login(String zh, String pwd);

}
