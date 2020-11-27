package com.dao;

// 实现方法的类

import java.util.Arrays;

import com.entity.Stu;

// implements：实现

public class Studao implements IStu, Iperson {

	// 学生数组    默认值：null
	private Stu[] stus = new Stu[5];

	// 增加学生
	@Override
	public int addStu(Stu stu) {
		// TODO Auto-generated method stub
		int n=-1;
		for (int i = 0; i < stus.length; i++) {
			if(stus[i]==null){  // 表示没有人
				stus[i]=stu;
				n=i;  // 把加人的下标给n
				break;
			}
		}
		return n;
	}

	// 删除学生
	@Override
	public int delStu(int sid) {
		// TODO Auto-generated method stub
		int n=-1;
		for (int i = 0; i < stus.length; i++) {
			if (stus[i]!=null) {  // 表示有人
				if (stus[i].getSid()==sid) {
					stus[i]=null;
					n=i;
					break;
				}
			}
		}
		return n;
	}
	
	// 查找单个学生
	@Override
	public Stu selStu(int sid) {
		// TODO Auto-generated method stub
		Stu stu=null;  // 声明了一个学生对象，没有值
		for (int i = 0; i < stus.length; i++) {
			if (stus[i]!=null) {
				if (stus[i].getSid()==sid) {
					stu=stus[i];  // 把找到的学生赋值给stu，最后返回stu
					break;
				}
			}
		}
		return stu;
	}

	// 修改学生
	@Override
	public int updateStu(int sid, Stu stu) {
		// TODO Auto-generated method stub
		int n=-1;
		for (int i = 0; i < stus.length; i++) {
			if (stus[i]!=null) {
				if (stus[i].getSid()==sid) {
					stus[i]=stu;  // 把传入的学生stu信息给数组里面的学生stus[i]
					n=i;
					break;
				}
			}
		}
		return n;
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		for (int i = 0; i < stus.length; i++) {
			if (stus[i]!=null) {
				String str=stus[i].toString();
				System.out.println(str);
			}
		}
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
