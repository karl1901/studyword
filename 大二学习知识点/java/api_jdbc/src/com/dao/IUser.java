package com.dao;

import java.util.List;

import com.entity.User;

//用户的接口
public interface IUser {

	// 增加用户
	public abstract int addUser(User user);

	// 删除用户(根据用户编号删除)
	public abstract int delUser(int uid);

	// 修改用户
	public abstract int updateUser(int uid, User user);

	// 查询表里面所有用户
	public abstract List<User> getAll();

	// 查询单个用户(根据uid)
	public abstract User getUser(int uid);

	// 根据姓名做模糊查询
	public abstract List<User> getUname(String uname);

}
