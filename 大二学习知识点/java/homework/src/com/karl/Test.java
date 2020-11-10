package com.karl;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=new Dog();
		dog.dname="小黑";
		dog.sex="公";
		dog.type="拉布拉多";
        //写一个测试类，要求首先生成一只狗，使用设置方法将狗的属性设上值,再调用狗跑步的方法，调用狗长大的方法。
		dog.run();
		dog.growup();
		//再调用得到狗姓名的方法，接收返回，并输出返回的姓名。最后使用输出，将这只狗的所有信息输出。
		String dname=dog.getDname();
		System.out.println(dname);
		String sex=dog.getSex();
		System.out.println(sex);
		String type=dog.getType();
		System.out.println(type);
		String str=dog.toString();
		System.out.println(str);
		
		dog.newname("小黄");
		dog.newsex("母");
		dog.newtype("田园犬");

	}

}
