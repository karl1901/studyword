package com.bizimpl;

import com.biz.IUserBiz;
import com.dao.IUser;
import com.daoimpl.UserDao;
import com.entity.User;

// IUserBiz实现层
// 把数据库获取到的数据进行必要的处理

public class UserBiz implements IUserBiz {

	IUser iu = new UserDao();

	public User login(String zh, String pwd) {
		User user = iu.login(zh, pwd);
		return user;
	}

}
