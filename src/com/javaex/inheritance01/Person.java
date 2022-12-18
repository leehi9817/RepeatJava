package com.javaex.inheritance01;

public class Person {

	//필드
	private String name;
	private int age;
	
	//생성자
	public Person() {
		System.out.println("Person()");
	}
	
	public Person(String name, int age) {
		System.out.println("Person(2)");
		this.name = name;
		this.age = age;
	}
	
	//메소드 g/s
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//메소드 일반
	public void showInfo() {
		System.out.println("이름:"+name+" 나이:"+age);
		System.out.println("=======================================");
	}
}
