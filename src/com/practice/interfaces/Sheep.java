package com.practice.interfaces;

public class Sheep implements Animal {
	
	private Integer age;
	
	public Integer getAge(Integer age) {
		return this.age = age;
	}
	
	
	@Override
	public String sound() {
		return "Beee....";
	}


	@Override
	public Integer getAge() {
		// TODO Auto-generated method stub
		return null;
	}
}
