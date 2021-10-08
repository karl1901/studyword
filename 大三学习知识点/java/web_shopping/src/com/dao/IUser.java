package com.dao;

import com.entity.User;

// 用户类方法设计接口

public interface IUser {

//	用户注册
	public abstract int addUser(User user);

//	用户登录
	public abstract User login(String uzh, String upwd);

}
