package com.test;

import java.util.Scanner;

import com.dao.IStu;
import com.dao.Studao;
import com.entity.Stu;

public class Test {

	/**
	 * @param args
	 * com.dao:放接口和实现类
	 * com.entity:放实体类(根据数据库的表)
	 * com.uitl:帮助包
	 * com.ui:界面包
	 * com.test:测试包
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		IStu is=new Studao();
//		is.addStu(stu);
		
		// 学生的管理系统
		Scanner mys=new Scanner(System.in);
		System.out.println("请输入你的选择：1、查看所有学生信息  2、增加学生  3、删除学生   4、 修改学生   5、查看单个学生   6、退出系统");

	}

}
