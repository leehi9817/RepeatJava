package com.javaex.inheritance01;

public class Student extends Person {
	
	//필드
	private String schoolName;
	
	//생성자
	//Person() -> Student()
	public Student() {
		super();
		System.out.println("Student()");
	}
	
	//Person() -> Student(1)
	public Student(String schoolName) {
		super();
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	
	//Person(2) -> Student(3)
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}
	
	//메소드 g/s
	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	//메소드 일반
	//오버라이딩
	//같은 이름의 메소드가 부모에도 있을 경우 자식의 메소드 사용
	public void showInfo() {
		System.out.println("이름:"+super.getName()+" 나이:"+super.getAge()+" 학교:"+schoolName);
		System.out.println("=======================================");
	}
}
