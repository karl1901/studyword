package com.entity;

public class Teachers extends People {

	int tid;
	// 教师类当中定义猫的对象数组
	Cat[] cats = new Cat[5];

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("老师说");
	}

	public void look() {
		System.out.println("看书");
	}

	// 增加宠物(猫的数组当中)
	public void addPet(Cat p) {
		int n = -1;
		for (int i = 0; i < cats.length; i++) {
			if (cats[i] == null) {
				cats[i] = p;
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
		for (int i = 0; i < cats.length; i++) {
			if (cats[i] != null) {
				if (cats[i].name.equals(str)) {
					cats[i] = null;
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
		for (int i = 0; i < cats.length; i++) {
			if (cats[i] != null) {
				if (cats[i].name.equals(oldname)) {
					cats[i].name = newname;
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
		for (int i = 0; i < cats.length; i++) {
			if (cats[i] != null) {
				if (cats[i].name.equals(str)) {
					cats[i].lv = a;
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
		for (int i = 0; i < cats.length; i++) {
			if (cats[i] != null) {
				if (cats[i].name.equals(str)) {
					n = i;
					break;
				}
			}
		}
		if (n == -1) {
			System.out.println("查无此猫！");
		} else {
			System.out.println(cats[n].toString());
		}
	}

	public void selAll() {
		for (int i = 0; i < cats.length; i++) {
			if (cats[i] != null) {
				System.out.println(cats[i].toString());
			}
		}
	}

}