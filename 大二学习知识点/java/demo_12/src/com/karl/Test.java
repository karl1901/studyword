package com.karl;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//什么是类？  在java项目中，去创建一个class，就是在创建一个类（作用是由内容决定）
		//什么是对象？  由类名区创建出来的数据类型，就叫做对象（作用是由创建的类决定的）
		//数组  int[] x=new int[5];
		//对象  Pig pig=new Pig();
		Pig pig=new Pig();
		pig.pid=12;
		pig.pname="袁洪涛";  //拿到的是猪的名字
		pig.type="中华牌";
		pig.age=3;
		pig.sex="母";
		pig.run();  //通过对象调用猪类里面的跑的方法
		pig.jiao("袁憨憨");
		
//		String type = pig.getType();
//		System.out.println(type);
		
//		int n=pig.getAge(2);
//		System.out.println("n"+n);
		
//		int[] x={12,343,23,12,23,43};
//		int[] x1={12,543,233,122,23,43};
//		int max=pig.getMax(x1);
//		System.out.println(max);

	}

}
