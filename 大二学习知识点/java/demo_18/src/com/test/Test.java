/**
 * 
 */
package com.test;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.entity.Cat;
import com.entity.Dog;
import com.entity.Person;
import com.entity.Pet;
import com.serlet.StuDao;
import com.serlet.TerDao;

/**
 * @author 23712
 *
 */
public class Test {

	/**
	 * @param args
	 * 
	 * 八大基本数据类型
	 * int  double  long   short  char  byte  boolean  float
	 * 整型   小数类型   长整型   短整型    字符     字节      布尔类型    浮点型
	 * 
	 * 判断
	 * if  swith
	 * 
	 * 循环
	 * while  do while  for(for,for each) 
	 * 
	 * 数组
	 * 排序：冒泡排序，最值(打擂台)，下标
	 * 
	 * OOP：(面向对象的编程)
	 * 三大基本原则：封装、继承、多态
	 * 继承：子类继承于父类，继承父类非私有化属性或方法。(优化代码，减少重复代码)
	 * 
	 * 接口与继承的区别？
	 * 子类继承父类是单继承。子类去实现接口，多实现
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * 宠物系统 
		 * 宠物(猫和狗)
		 * 老师养猫    学生养狗
		 * 增加、删除、修改姓名、查询单个、查询所有
		 * 老师和学生继承于人类(姓名、年龄、性别)
		 * 猫和狗继承于宠物类(姓名、性别、品种)
		 * 
		 */
		
		StuDao sd = new StuDao();
		TerDao td = new TerDao();
		Scanner mys = new Scanner(System.in);
		while (true) {
			System.out.println("欢迎你的到来，请选择你的操作：1、学生(养狗)  2、老师(养猫) 3、退出系统");
			int x = mys.nextInt();
			if (x == 1) {
				while (true) { // 学生选择养狗
					System.out.println("输入你的选择：1、增加宠物狗  2、送走宠物狗  3、修改宠物狗名字   4、查看单个宠物的信息  5、查看所有宠物的信息  6、返回上一级");
					int y = mys.nextInt();
					if (y == 1) { // 增加宠物
						Pet dog = new Dog(); // 历史替换原则-典型的多态
						System.out.println("请输入狗的昵称：");
						String name = mys.next();
						dog.setName(name); // 因狗类中无带参构造函数，继承不了宠物类的有参构造函数，只能用赋值方法
						System.out.println("请输入狗的性别：");
						String sex = mys.next();
						dog.setSex(sex);
						System.out.println("请输入狗的品种：");
						String type = mys.next();
						dog.setType(type);
						int n = sd.addPet(dog);
						if (n == -1) {
							System.out.println("增加失败!");
						} else {
							System.out.println("增加成功!" + "\n位置：" + n);
						}
					}
					if (y == 2) { // 送走宠物
						Pet dog = new Dog();
						System.out.println("请输入狗的昵称：");
						String name = mys.next();
						dog.setName(name);
						System.out.println("请输入狗的性别：");
						String sex = mys.next();
						dog.setSex(sex);
						System.out.println("请输入狗的品种：");
						String type = mys.next();
						dog.setType(type);
						int n = sd.delPer(dog);
						if (n == -1) {
							System.out.println("删除失败!");
						} else {
							System.out.println("删除成功!" + "\n位置：" + n);
						}
					}
					if (y == 3) { // 修改宠物狗名字
						Pet dog = new Dog();
						System.out.println("请输入狗的昵称：");
						String name = mys.next();
						dog.setName(name);
						System.out.println("请输入狗的性别：");
						String sex = mys.next();
						dog.setSex(sex);
						System.out.println("请输入狗的品种：");
						String type = mys.next();
						dog.setType(type);
						System.out.println("请输入新的昵称：");
						String newname = mys.next();
						int n = sd.updatePet(dog, newname);
						if (n == -1) {
							System.out.println("修改失败!");
						} else {
							System.out.println("修改成功!" + "\n位置：" + n);
						}
					}
					if (y == 4) { // 查看单个宠物狗信息
						System.out.println("请输入你要查看狗的昵称：");
						String name = mys.next();
						Pet dog = sd.getPet(name);
						if (dog != null) {
							System.out.println(dog.toString());
						} else {
							System.out.println("此狗不存在!");
						}
					}
					if (y == 5) { // 查看所有宠物狗信息
						sd.getAll();
					}
					if (y == 6) {
						break;
					}

				}
			}
			if (x == 2) {
				while (true) { // 老师选择养猫
					System.out
							.println("输入你的选择：1、增加宠物猫  2、送走宠物猫  3、修改宠物猫名字   4、查看单个宠物的信息  5、查看所有宠物的信息  6、返回上一级");
					int y = mys.nextInt();
					if (y == 1) { // 增加宠物
						Pet car = new Cat();
						System.out.println("请输入猫的昵称：");
						String name = mys.next();
						car.setName(name);
						System.out.println("请输入猫的性别：");
						String sex = mys.next();
						car.setSex(sex);
						System.out.println("请输入猫的品种：");
						String type = mys.next();
						car.setType(type);
						int n = td.addPet(car);
						if (n == -1) {
							System.out.println("增加失败!");
						} else {
							System.out.println("增加成功!" + "\n位置：" + n);
						}
					}
					if (y == 2) { // 送走宠物
						Pet car = new Cat();
						System.out.println("请输入猫的昵称：");
						String name = mys.next();
						car.setName(name);
						System.out.println("请输入猫的性别：");
						String sex = mys.next();
						car.setSex(sex);
						System.out.println("请输入猫的品种：");
						String type = mys.next();
						car.setType(type);
						int n = td.delPer(car);
						if (n == -1) {
							System.out.println("删除失败!");
						} else {
							System.out.println("删除成功!" + "\n位置：" + n);
						}
					}
					if (y == 3) { // 修改宠猫狗名字
						Pet car = new Cat();
						System.out.println("请输入猫的昵称：");
						String name = mys.next();
						car.setName(name);
						System.out.println("请输入猫的性别：");
						String sex = mys.next();
						car.setSex(sex);
						System.out.println("请输入猫的品种：");
						String type = mys.next();
						car.setType(type);
						System.out.println("请输入新的昵称：");
						String newname = mys.next();
						int n = td.updatePet(car, newname);
						if (n == -1) {
							System.out.println("修改失败!");
						} else {
							System.out.println("修改成功!" + "\n位置：" + n);
						}
					}
					if (y == 4) { // 查看单个宠物猫信息
						System.out.println("请输入你要查看猫的昵称：");
						String name = mys.next();
						Pet car = td.getPet(name);
						if (car != null) {
							System.out.println(car.toString());
						} else {
							System.out.println("此猫不存在!");
						}
					}
					if (y == 5) { // 查看所有宠物狗信息
						sd.getAll();
					}
					if (y == 6) {
						break;
					}

				}
			}
			if (x == 3) { // 退出系统
				System.out.println("退出成功!");
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
