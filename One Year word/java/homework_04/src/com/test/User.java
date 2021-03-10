package com.test;

// 用户信息管理类

public class User {

	private String username="admin";
	private String userpassword="123456";
	
	public User(){
		
	}

	public User(String username, String userpasswrod) {
		super();
		this.username = username;
		this.userpassword = userpasswrod;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpasswrod() {
		return userpassword;
	}

	public void setUserpasswrod(String userpasswrod) {
		this.userpassword = userpasswrod;
	}
	
	// 登录的方法
	public int login(String username,String userpassword){
		int n=0;
		if (this.username.equals(username)&&this.userpassword.equals(userpassword)) {
			n=1;
		}
		return n;
	}

}
