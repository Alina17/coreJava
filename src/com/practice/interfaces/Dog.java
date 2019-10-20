package com.practice.interfaces;

public class Dog implements Animal {
	
	private Integer age;
	
	public Integer getAge(Integer age) {
		return this.age = age;
	}
	
	
	
	
	public String sound() {
		return "bowow";
	}




	@Override
	public Integer getAge() {
		// TODO Auto-generated method stub
		return null;
	};

}
