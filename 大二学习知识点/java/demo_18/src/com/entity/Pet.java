package com.entity;

// ≥ËŒÔ¿‡

public class Pet {

	private String name;
	private String sex;
	private String type;

	public Pet() {

	}

	public Pet(String name, String sex, String type) {
		this.name = name;
		this.sex = sex;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Pet) {
			Pet pet = (Pet) obj;
			if (this.name.equals(pet.getName())
					&& this.sex.equals(pet.getSex())
					&& this.type.equals(pet.getType())) {
				return true;
			}
		}
		return false0;
	}

}
