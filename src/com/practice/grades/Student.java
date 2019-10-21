package com.practice.grades;

public class Student {
	
	private String name;
	private Integer score;
	
	public Student(String name,int score) {
		this.name = name;
		this.score = score;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public Integer getScore() {
		return score;
	}
	
	

}
