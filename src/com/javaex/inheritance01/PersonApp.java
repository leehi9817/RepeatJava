package com.javaex.inheritance01;

public class PersonApp {

	public static void main(String[] args) {
		
		//Person 객체
		Person p01 = new Person("윈터", 23);
		p01.showInfo();
		
		Person p02 = new Person("지젤", 25);
		p02.showInfo();
		
		//Student 객체 (Person의 자식 클래스)
		//Person() -> Student()
		Student s01 = new Student();
		s01.setName("카리나");
		s01.setAge(21);
		s01.setSchoolName("에스파고등학교");
		s01.showInfo();
		
		//Person(2) -> Student(3);
		Student s02 = new Student("닝닝", 20, "에스파고등학교");
		s02.showInfo();
	}

}
