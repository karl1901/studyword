package com.test;

import java.util.Scanner;

import com.dao.IStu;
import com.dao.Studao;
import com.entity.Stu;

public class Test {

	/**
	 * @param args
	 *            com.dao:放接口和实现类 com.entity:放实体类(根据数据库的表) com.uitl:帮助包
	 *            com.ui:界面包 com.test:测试包
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IStu is = new Studao();

		// 学生的管理系统
		Scanner mys = new Scanner(System.in);
		while (true) {
			System.out
					.println("请输入你的选择：1、查看所有学生信息  2、增加学生  3、删除学生   4、 修改学生   5、查看单个学生   6、退出系统");
			int x = mys.nextInt();
			if (x == 1) { // 查看所有学生信息
				is.getAll();
			}
			if (x == 2) { // 增加学生
				System.out.println("请输入学生的学号：");
				int sid = mys.nextInt();
				System.out.println("请输入学生的姓名：");
				String sname = mys.next();
				System.out.println("请输入学生的性别：");
				String sex = mys.next();
				System.out.println("请输入学生的成绩：");
				double score = mys.nextDouble();
				System.out.println("请输入学生的年龄：");
				int age = mys.nextInt();
				Stu stu = new Stu(sid, sname, sex, score, age);
				int n = is.addStu(stu);
				if (n == -1) {
					System.out.println("增加失败!");
				} else {
					System.out.println("增加成功!");
				}
			}
			if (x == 3) { // 删除学生
				System.out.println("请输入要删除学生的学号：");
				int sid = mys.nextInt();
				int n = is.delStu(sid);
				if (n == -1) {
					System.out.println("删除失败!");
				} else {
					System.out.println("删除成功!");
				}
			}
			if (x == 4) { // 修改学生
				System.out.println("请输入要修改学生的学号：");
				int sid = mys.nextInt();
				System.out.println("请输入新学生的学号：");
				int newsid = mys.nextInt();
				System.out.println("请输入新学生的姓名：");
				String sname = mys.next();
				System.out.println("请输入新学生的性别：");
				String sex = mys.next();
				System.out.println("请输入新学生的成绩：");
				double score = mys.nextDouble();
				System.out.println("请输入新学生的年龄：");
				int age = mys.nextInt();
				Stu stu = new Stu(newsid, sname, sex, score, age);
				int n = is.updateStu(sid, stu);
				if (n == -1) {
					System.out.println("修改失败!");
				} else {
					System.out.println("修改成功!");
				}
			}
			if (x == 5) { // 查看单个学生
				System.out.println("请输入你要查看学生的学号：");
				int sid = mys.nextInt();
				Stu stu = is.selStu(sid);
				if (stu == null) {
					System.out.println("查无此人!");
				} else {
					System.out.println(stu.toString());
				}
			}
			if (x == 6) { // 退出系统
				System.out.println("感谢使用!");
				break;
			}
		}

	}

}
