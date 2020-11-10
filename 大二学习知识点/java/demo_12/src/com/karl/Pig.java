package com.karl;
//实体类：这个类里面的属性都是和数据库表是一致的
//1、猪的属性    2、猪的行为(能力)--java中的方法--html:function-函数
public class Pig {
	
	//猪的属性
	int pid;  //编号
	String pname;
	String type;
	int age;
	String sex;
	
	//猪的行为(方法)
	//修饰符    返回类型    方法名    方法体
	
	//方法有4种：
	
	//1、没有返回类型，也没有参数的方法
	public void run(){  //猪跑的方法
		System.out.println("在猪圈奔驰");
	}
	
	//2、没有返回类型，但是有参数的方法
	public void jiao(String name){  //name="袁憨憨"
		System.out.println(name+"过来了~~~~");
	}
	
	//3、有返回类型，没有参数的方法
	public String getType(){  //return必须是方法体最后一行,返回的类型上下要一致
		System.out.println("有返回类型的方法");
		return "肥猪";
	}
	
	//4、有返回类型，有参数的方法
	public int getAge(int x){
		System.out.println("x"+x);
		int age=x;
		return age;
	}
	
	//5、让猪具备求数组最大值的方法
	public int getMax(int[] x){
		int max=x[0];
		for (int i = 0; i < x.length; i++) {
			if (max<x[i]) {
				max=x[i];
			}
		}
		return max;
	}
	

}
