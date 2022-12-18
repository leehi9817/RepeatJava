package com.javaex.inheritance02;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		System.out.println("Point()");
	}
	
	public Point(int x, int y) {
		System.out.println("Point(2)");
		this.x = x;
		this.y = y;
	}
	
	//메소드 g/s
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//메소드 일반
	public void showInfo() {
		System.out.println("점[x="+x+", y="+y+"]");
	}

}
