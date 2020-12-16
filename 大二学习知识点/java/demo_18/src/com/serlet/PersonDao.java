package com.serlet;

import com.entity.Pet;

// 实现类
// 实现接口的方法

public class PersonDao implements IPerson {

	Pet[] pets = new Pet[5]; // 类里的全局变量

	// 增加时不加入重复内容
	@Override
	public int addPet(Pet pet) {
		// TODO Auto-generated method stub
		int n = -1; // 局部变量(只能自己方法本身调用)
		for (int i = 0; i < pets.length; i++) {
			if (pets[i] != null) { // 这个位置有内容
				if (pets[i].equals(pet)) {
					System.out.println("宠物已存在!!!");
					break;
				}
			}
			// 开始增加宠物(放入数组)
			if (pets[i] == null) {
				pets[i] = pet;
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
		for (int i = 0; i < pets.length; i++) {
			// 先在数组中找到对应的对象
			if (pets[i] != null) {
				if (pets[i].equals(pet)) {
					// 删除
					pets[i] = null;
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
		for (int i = 0; i < pets.length; i++) {
			if (pets[i] != null) {
				System.out.println(pets[i].toString());
			}
		}
	}

	@Override
	public Pet getPet(String name) {
		// TODO Auto-generated method stub
		Pet pet = null;
		for (int i = 0; i < pets.length; i++) {
			if (pets[i] != null) {
				if (pets[i].getName().equals(name)) {
					pet = pets[i];
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
		for (int i = 0; i < pets.length; i++) {
			if (pets[i] != null) {
				if (pets[i].equals(pet)) {
					pets[i].setName(newname);
					n = i;
					break;
				}
			}
		}
		return n;
	}

}
