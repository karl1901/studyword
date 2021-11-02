package com.test;

public class Test {

	/*
	 * 
	 * 反射-对于类和类里面的属性以及方法，进行相关的操作
	 * 
	 */

	public static void main(String[] args) {

		// 一、获取类对象
		// 1、类名.class
//		Class class1= Persion.class;
//		System.out.println(class1);

		// 2、对象.getClass();
//		Persion p = new Persion();
//		Class class1 = p.getClass();
//		System.out.println(class1);

		// 3、Class.forName("全限定名");
//		try {
//			Class class1 = Class.forName("com.test.Persion");
//			System.out.println(class1);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// 4、类加载的loadClass("全限定名");
		// 获取到类加载器
//		ClassLoader classLoader = Persion.class.getClassLoader();
//		try {
//			Class class1 = classLoader.loadClass("com.test.Persion");
//			System.out.println(class1);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// 5、子类.class.getSuperClass();
//		Class class1 = Stu.class.getSuperclass();
//		System.out.println(class1);

		// 6、包装类.class
//		Class class1 = Integer.class;
//		System.out.println(class1);

		// 二、根据类得到类名(全限定名)
		// c.getName()--全限定名
		// c.getSimpleName()--类名
		// c.getPackage()--包名
		// 获取一个类
//		Class class1 = Persion.class;
//		System.out.println(class1.getName());
//		System.out.println(class1.getSimpleName());
//		System.out.println(class1.getPackage());

		// 三、根据类得到类的属性
//		Class class1 = Persion.class;
		// c.getField("field属性名")
		// 获取公开的属性
//		try {
//			Field pname = class1.getField("pname");
//			System.out.println(pname);
		// 属性名：f.getName();
//			System.out.println(pname.getName());
		// 属性修饰符：f.getModifiers()
		// 1: public
		// 2: private
		// 0: 默认的(友好的)
		// 4: 受保护的
		// 8: 静态的
		// 6: 最终的
//			System.out.println(pname.getModifiers());
		// 属性的数据类型: f.getType().getName()
//			System.out.println(pname.getType().getName());
		// 给属性设值: f.set()
//			pname.set(pname, "姓名");

		// 得到私有的属性: f.getDeclaredField("属性名")
//			Field age = class1.getDeclaredField("age");
//			System.out.println(age);
//			System.out.println(age.getModifiers());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// 得到所有的声明的属性: c.getDeclaredFields()
//		Class class2 = Persion.class;
//		Field[] fs = class2.getDeclaredFields();
//		for (Field field : fs) {
//			System.out.println(field);
//		}

	}

}
