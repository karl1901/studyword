package com.test;

import com.entity.Dog;
import com.entity.Pet;
import com.entity.Stu;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5、编写测试类，分别实例化一个教师及学生，各自将其宠物的对象数组填充
		// 完毕，再调用删除方法 删除所有下标为奇数位的宠物
		Stu stu = new Stu();
		for (int i = 0; i < 5; i++) { // 循环创建对象(狗)
			Pet dog = new Dog("小黑" + i, 11, 12);
			stu.addPet((Dog) dog); // 增加狗至数组中
		}
		stu.selAll(); // 打印所有狗的方法
		stu.delPet(); // 调用删除所有奇数位的宠物方法
		stu.selAll();

	}

}
