package com.entity;

public class Cat extends Pet {

	@Override
	public String toString() {
		return "Cat [love=" + love + ", lv=" + lv + ", name=" + name
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}