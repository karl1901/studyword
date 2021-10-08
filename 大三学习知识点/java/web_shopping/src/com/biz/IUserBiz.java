package com.biz;

import com.entity.User;

public interface IUserBiz {

//	用户注册
	public abstract int addUser(User user);

//	用户登录
	public abstract User login(String uzh, String upwd);

}
