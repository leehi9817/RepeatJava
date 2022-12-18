package com.javaex.class02;

public class Point {

	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		//해당 클래스를 메모리에 올리는 일
	}
	
	public Point(int x, int y) {
		//해당 클래스를 메모리에 올리는 일
		this.x = x;
		this.y = y;
	}
	
	//메소드 g/s
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	//메소드 일반
	public void draw() {
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
	}
	
	//메소드 오버로딩: 하나의 클래스에 같은 이름의 메소드가 여러 개 존재할 수 있다.
	public void draw(Point p) {
		System.out.println("점[x="+p.getX()+", y="+p.getY()+"]을 지웠습니다.");
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
