package com.practice.interfaces;

public class Cow implements Animal {
	
	private Integer age;
	
	public Integer getAge(Integer age) {
		return this.age = age;
	}
	
	
	public String sound() {
		return "moooo";
	}


	@Override
	public Integer getAge() {
		// TODO Auto-generated method stub
		return null;
	};

}
