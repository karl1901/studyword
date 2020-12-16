package com.serlet;

import com.entity.Pet;

// 接口
// 所有方法是没有方法体的

public interface IPerson {

	// 设计方法(宠物)
	// 增加的方法
	public abstract int addPet(Pet pet);

	// 删除的方法
	public abstract int delPer(Pet pet);

	// 修改宠物的姓名方法
	public abstract int updatePet(Pet pet, String newname);

	// 查找单个宠物的方法
	public abstract Pet getPet(String name);
	
	// 查询所有宠物信息的方法
	public abstract void getAll();

}
