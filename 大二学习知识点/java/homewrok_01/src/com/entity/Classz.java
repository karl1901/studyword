package com.entity;

import java.util.Arrays;

public class Classz {

	// 7、编写班级类

	// * 1、新建一个班级类，含有属性：班级名称，学生名字数组
	private String cname;
	private Stu[] student = new Stu[25];

	public Classz(String cname, Stu[] student) {
		this.cname = cname;
		this.student = student;
	}

	public Classz() {

	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Stu[] getStudent() {
		return student;
	}

	public void setStudent(Stu[] student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Classz [cname=" + cname + ", student="
				+ Arrays.toString(student) + "]";
	}

	// * 2、编写一个方法，输出所有学生信息
	public void printStu() {
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null) {
				String str = student[i].toSting();
				System.out.println(str);
			}
		}
	}

	// * 3、编写一个方法add,将学生名字添加到数组
	public void addStu(Stu stu) {
		int n = -1; // 用来判断数组是否满人的情况和做提示的
		for (int i = 0; i < student.length; i++) {
			if (student[i] == null) { // 表示位置上没有人
				student[i] = stu; // 把学生放入数组中
				n = i;
				System.out.println("所加学生位置:" + n);
				break;
			}
		}
		if (n == -1) {
			System.out.println("人满了~~");
		} else {
			System.out.println("添加成功!!");
		}
	}

	// * 4、编写查询方法，根据名字在数组当中查找学生
	public void selStu(Stu stu) {
		int n = -1;
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null) { // 表示位置上有学生，才会做下面的匹配
				if (stu.getName() == student[i].getName()
						&& stu.getSex() == (student[i].getSex())
						&& stu.getAge() == student[i].getAge()) { // 传入的姓名，编号，年龄与数中的信息作匹配
					String s = student[i].toString();
					System.out.println(s);
					n = i;
					break;
				}
			}
		}
		if (n == -1) { // 没有找到人
			System.out.println("学生不存在!!!");
		}
	}

	// * 5、编写删除方法、根据名字在数组当中删除学生
	public void delStu(Stu stu) {
		int n = -1;
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null) { // 表示位置上有学生，才会做下面的匹配
				if (stu.getName() == student[i].getName()
						&& stu.getSex() == (student[i].getSex())
						&& stu.getAge() == student[i].getAge()) { // 传入的姓名，编号，年龄与数中的信息作匹配
					String s = student[i].toString();
					student[i] = null;
					System.out.println("删除成功!");
					n = i;
					break;
				}
			}
		}
		if (n == -1) { // 没有找到人
			System.out.println("学生不存在!!!");
		}
	}

	// * 6、编写修改方法，将老名字修改新的名字
	public void updateStu(Stu oldstu, Stu newStu) {
		int n = -1;
		for (int i = 0; i < student.length; i++) {
			if (student[i] != null) { // 表示位置上有学生，才会做下面的匹配
				if (oldstu.getName() == student[i].getName()
						&& oldstu.getSex() == (student[i].getSex())
						&& oldstu.getAge() == student[i].getAge()) { // 传入的姓名，编号，年龄与数中的信息作匹配
					String s = student[i].toString();
					student[i].setName(newStu.getName());
					student[i].setSex(newStu.getSex());
					student[i].setAge(newStu.getAge());
					System.out.println("修改成功!");
					n = i;
					break;
				}
			}
		}
		if (n == -1) { // 没有找到人
			System.out.println("学生不存在!!!");
		}
	}

	// * 7、编写查询方法，在指定区间内查询学生名字
	// 0-输入年龄区间的学生
	public void selqjStu(int age) {
		int n = -1;
		for (int i = 0; i < age; i++) {
			if (student[i] != null) { // 表示位置上有学生，才会做下面的匹配
				String s = student[i].toString();
				System.out.println(s);
				n = i;
				break;
			}
		}
		if (n == -1) { // 没有找到人
			System.out.println("学生不存在!!!");
		}
	}

	// * 8、编写测试类， 实例化一个班级，添加25个学生到班级的学生数组当中

}
