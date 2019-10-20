package com.practice.interfaces;



public class Cat implements Animal {
	
	private Integer age;
	
	
	
	public Cat(Integer age) { this.age = age; }
	
	
	
	
	public String sound() {
		return "meow";
	}


	@Override
	public Integer getAge() {
		// TODO Auto-generated method stub
		return this.age;
	};

}
