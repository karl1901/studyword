package com.entity;

public class Dog extends Pet{

	public Dog(String string, double i, double j) {
		// TODO Auto-generated constructor stub
		super(string, i, j);
	}

	@Override
	public String toString() {
		return "Dog [love=" + love + ", lv=" + lv + ", name=" + name
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}