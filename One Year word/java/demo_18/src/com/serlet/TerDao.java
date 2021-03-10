package com.serlet;

import com.entity.Cat;
import com.entity.Pet;

public class TerDao implements IPerson {

	Pet[] cats = new Cat[5];

	@Override
	public int addPet(Pet pet) {
		// TODO Auto-generated method stub
		int n = -1; // 局部变量(只能自己方法本身调用)
		for (int i = 0; i < cats.length; i++) {
			if (cats[i] != null) { // 这个位置有内容
				if (cats[i].equals(pet)) {
					System.out.println("宠物已存在!!!");
					break;
				}
			}
			// 开始增加宠物(放入数组)
			if (cats[i] == null) {
				cats[i] = pet;
				n = i; // 把增加所在的位置下标给n
				break;
			}
		}
		return n;
	}

	@Override
	public int delPer(Pet pet) {
		// TODO Auto-generated method stub
		int n = -1;
		for (int i = 0; i < cats.length; i++) {
			// 先在数组中找到对应的对象
			if (cats[i] != null) {
				if (cats[i].equals(pet)) {
					// 删除
					cats[i] = null;
					n = i;
					break;
				}
			}
		}
		return n;
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		for (int i = 0; i < cats.length; i++) {
			if (cats[i] != null) {
				System.out.println(cats[i].toString());
			}
		}
	}

	@Override
	public Pet getPet(String name) {
		// TODO Auto-generated method stub
		Pet pet = null;
		for (int i = 0; i < cats.length; i++) {
			if (cats[i] != null) {
				if (cats[i].getName().equals(name)) {
					pet = cats[i];
					break;
				}
			}
		}
		return pet;
	}

	@Override
	public int updatePet(Pet pet, String newname) {
		// TODO Auto-generated method stub
		int n = -1;
		for (int i = 0; i < cats.length; i++) {
			if (cats[i] != null) {
				if (cats[i].equals(pet)) {
					cats[i].setName(newname);
					n = i;
					break;
				}
			}
		}
		return n;
	}

}
