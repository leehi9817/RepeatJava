package com.javaex.class02;

public class PointApp {

	public static void main(String[] args) {
		
		//생성자
		Point p01 = new Point();
		p01.setX(5);
		p01.setY(5);
		
		Point p02 = new Point(10, 23);
		
		//메소드 g/s
		int x01 = p01.getX();
		System.out.println("1번 점의 x값은 "+x01+"이다.");
		
		//메소드 일반
		p01.draw();
		p02.draw();
		
	}

}
