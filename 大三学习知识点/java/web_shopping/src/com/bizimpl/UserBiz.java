package com.bizimpl;

import com.biz.IUserBiz;
import com.dao.IUser;
import com.daoimpl.UserDao;
import com.entity.User;

public class UserBiz implements IUserBiz {

	IUser iu = new UserDao();

//	用户注册
	@Override
	public int addUser(User user) {
		int n = iu.addUser(user);
		return n;
	}

//	用户登录
	@Override
	public User login(String uzh, String upwd) {
		User user = iu.login(uzh, upwd);
		return user;
	}

}
