package com.javaex.practice05_ex07;

public class Friend {

	//필드
	private String name;
	private String phone;
	private String school;
	
	//생성자
	public Friend() {
		
	}
	
	public Friend(String name, String phone, String school) {
		this.name = name;
		this.phone = phone;
		this.school = school;
	}

	//메소드 g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	//메소드 일반
	public void showInfo() {
		System.out.println("이름:"+name+" 핸드폰:"+phone+" 학교:"+school);
	}
	
}
