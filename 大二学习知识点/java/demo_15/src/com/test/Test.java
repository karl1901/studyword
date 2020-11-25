package com.test;

// 测试类

import com.entity.Caise;
import com.entity.Dayinji;
import com.entity.Dog;
import com.entity.Heibai;
import com.entity.Person;
import com.entity.Pet;
import com.entity.Qq;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 多态知识点

		// Person per=new Person();
		// // 创建宠物
		 Pet dog=new Dog(); // 里式替换
		 if (dog instanceof Dog) {  // 判断对象(判断dog是不是狗)
			Dog d=(Dog)dog;
			d.eat();
		}
		 Pet qq=new Qq();
		 if (qq instanceof Qq) {
			Qq q=(Qq)qq;
			q.eat();
		}
		// // 调用给宠物看病的方法
		// per.getPet(qq);

		// 测试打印机
		// Dayinji hb = new Heibai();
		// Dayinji cs = new Caise();
		// hb.dayin();
		// cs.dayin();
		
		

	}

}
