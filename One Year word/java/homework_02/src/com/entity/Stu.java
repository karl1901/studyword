package com.entity;

public class Stu extends People {

	int sid;
	// 学生类当中定义狗的对象数组
	Dog[] dogs = new Dog[5];

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("学生说");
	}

	public void run() {
		System.out.println("学生跑");
	}

	// 增加宠物、删除宠物、修改宠物名字、修改宠物健康值方法
	// （两个参数：低于多少的健康值，加多少健康值）、查找宠物的功能，
	// 并定义方法将所有宠物都显示并打印

	// 增加宠物(狗的数组当中)
	public void addPet(Dog p) {
		int n = -1;
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] == null) {
				dogs[i] = p;
				n = i;
				break; // 中止循环
			}
		}
		if (n == -1) {
			System.out.println("增加失败！");
		} else {
			System.out.println("增加成功！");
		}
	}

	// 删除宠物(通过名字删除)
	public void delPet(String str) {
		int n = -1;
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] != null) {
				if (dogs[i].name.equals(str)) {
					dogs[i] = null;
					n = i;
					break;
				}
			}
		}
		if (n == -1) {
			System.out.println("删除失败！");
		} else {
			System.out.println("删除成功！");
		}
	}

	// 修改宠物名字(通过旧名字去找,找到以后给个新名字)
	public void updatePet(String oldname, String newname) {
		int n = -1;
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] != null) {
				if (dogs[i].name.equals(oldname)) {
					dogs[i].name = newname;
					n = i;
					break;
				}
			}
		}
		if (n == -1) {
			System.out.println("修改失败！");
		} else {
			System.out.println("修改成功！");
		}
	}

	// 修改宠物健康值方法(通过姓名)
	public void updatePet(String str, double a) {
		int n = -1;
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] != null) {
				if (dogs[i].name.equals(str)) {
					dogs[i].lv = a;
					n = i;
					break;
				}
			}
		}
		if (n == -1) {
			System.out.println("修改失败！");
		} else {
			System.out.println("修改成功！");
		}
	}

	// 查找宠物的功能(通过姓名)
	public void selPet(String str) {
		int n = -1;
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] != null) {
				if (dogs[i].name.equals(str)) {
					n = i;
					break;
				}
			}
		}
		if (n == -1) {
			System.out.println("查无此狗！");
		} else {
			System.out.println(dogs[n].toString());
		}
	}

	// 所有宠物都显示并打印
	public void selAll() {
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] != null) {
				System.out.println(dogs[i].toString());
			}
		}
	}

	// 删除所有奇数位的宠物方法
	public void delPet() {
		int n = -1;
		for (int i = 0; i < dogs.length; i++) {
			if (dogs[i] != null) {
				if (i % 2 != 0) {
					dogs[i] = null;
					n = i;
				}
			}
		}
		if (n == -1) {
			System.out.println("删除失败！");
		} else {
			System.out.println("删除成功！");
		}
	}

}