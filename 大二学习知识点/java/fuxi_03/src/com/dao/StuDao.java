package com.dao;

import com.entity.Stu;

// 帮助类：一些方法，用于帮助学生类做操作
// 增删改查

public class StuDao {

	// 把学生放到学生数组中
	Stu[] x = new Stu[10];

	// 增加学生(有返回类型有参数的方法)
	public int addStu(Stu stu) {
		boolean f = false; // 用来判断是否增加学生的依据
		int n = 0; // 用来判断是否增加学生成功的依据
		// 增加学生前先要判断数组中是否已经存在此学生
		for (int i = 0; i < x.length; i++) {
			if (x[i] != null) {
				if (x[i].equals(stu)) { // 进入判断
					System.out.println("这个学生已存在!");
					f = true;
					break;
				}
			}
		}

		if (f == false) {
			for (int i = 0; i < x.length; i++) {
				if (x[i] == null) { // 这个位置没有人
					x[i] = stu; // 把学生放入数组中
					n = 1;
					break; // 终止循环
				}
			}
		}
		return n;
	}

	// 删除学生
	public int delStu(Stu stu) {
		int n = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] != null) {
				if (x[i].equals(stu)) {
					x[i] = null; // 把学生移除
					n = 1;
					break;
				}
			}
		}
		return n;
	}

	// 修改学生
	public int updateStu(Stu oldstu, Stu newstu) {
		int n = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] != null) {
				if (x[i].equals(oldstu)) {
					x[i] = newstu; // 把学生移除
					n = 1;
					break;
				}
			}
		}
		return n;
	}

	// 查询所有学生信息
	public void getAll() {
		for (Stu i : x) {
			if (i != null) { // 有人才会打印
				System.out.println(i.toString());
			}
		}
	}

}
