package com.dao;

import com.entity.Stu;

// 继承只能单继承，接口能多实现
// interface：接口---是一个特殊的抽象类:设计者。作用：对方法内容的保护

public interface IStu {
	
	// 常量必须要有初始化的值
	final static String str="呵呵";  // 接口里面所有的变量都强制变成常量
	// 接口里面的所有方法都是默认为抽象方法，只能是抽象方法
	public void get();
	
	// 学生的增删改查
	public abstract void addStu(Stu stu);
	
	public abstract void delStu(int sid);
	
	public abstract void updateStu(int sid,Stu stu);
	
	public abstract void selStu(int sid);

}
