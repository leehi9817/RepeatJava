package com.javaex.inheritance02;

public class ColorPoint extends Point {
	
	//필드
	private String color;
	
	//생성자
	public ColorPoint() {
		super();
		System.out.println("ColorPoint()");
	}
	
	public ColorPoint(String color) {
		super();
		System.out.println("ColorPoint(1)");
		this.color = color;
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		System.out.println("ColorPoint(3)");
		this.color = color;
	}
	
	//메소드 g/s
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//메소드 일반
	public void showInfo() {
		System.out.println("점[x="+super.getX()+", y="+super.getY()+", 색상:"+color+"]");
	}
	
}
