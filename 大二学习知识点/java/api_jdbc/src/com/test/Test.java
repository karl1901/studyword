package com.test;

import java.util.List;

import com.dao.IUser;
import com.dao.UserDao;
import com.entity.User;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(DBhelp.getcon());

		IUser iu = new UserDao();

		// // 调用用户增加的方法
		// User user = new User(1, "赤赤", "男", 20, "2021-3-23");
		// int n = iu.addUser(user);
		// System.out.println(n);

//		 // 调用用户删除的方法
//		 int n = iu.delUser(1);
//		 System.out.println(n);

//		// 调用查询表里面所有数据
//		List<User> myl = iu.getAll();
//		for (User user : myl) {
//			System.out.println(user);
//		}

//		// 调用模糊查询
//		 List<User> myl=iu.getUname("赤");
//		 for (User user : myl) {
//		 System.out.println(user);
//		 }

//		 // 调用查询单个用户(uid)
//		 User user=iu.getUser(5);
//		 System.out.println(user);

//		 //调用修改用户
//		 User user=new User();
//		 user.setUname("测试");
//		 user.setSex("男");
//		 user.setAge(20);
//		 user.setUtime("2020-3-21");
//		 int n=iu.updateUser(2, user);
//		 System.out.println(n);

	}

}
