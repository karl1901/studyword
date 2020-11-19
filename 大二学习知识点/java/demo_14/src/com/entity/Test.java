package com.entity;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Dog dog=new Dog();
		// dog.run();
		// Cat cat=new Cat();
		// cat.run();

		// 里式替换原则：用子类的对象去实例化父类的对象
		// Pet p=new Cat();
		// 不同的对象作用在同一个方法时，所表现出不同形态，称之为多态
		// p.getPet(dog);

		// (实体类 方法类 常量类 )：实际项目代码 测试类：开发使用
		// 实体类：
		// 根据数据库创建名称一样的类，和私有化属性;无参函数;构造函数;取值赋值方法;打印方法(tostring)
		// 方法类：
		// 给实体类写对应的方法---增删改查
		// 常量类：
		// 名字类似项目名(Demo)：一般只有属性(公开的) 修饰符 final static 基本数据类型 变量="内容";
		// static：静态的 当他的作用在属性以及方法上时，我们就能够通过类名去调用
		// fainal：作用在属性及方法上时，属性就没办法被修改了，方法没有办法被重写
		// 注：fainal和static没有先后顺序，一般习惯把fainal写在前面
	}

}
