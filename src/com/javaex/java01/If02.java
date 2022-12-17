package com.javaex.java01;

import java.util.Scanner;

public class If02 {

	/* 영희는 편의점에서 아르바이트를 하고 있다.
	 * 8시간까지는 시간당 10000원
	 * 8시간 초과시에는 시간당 1.5배를 받는다
	 * 근무시간을 입력받아 임금을 계산하세요
	 * */
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간:");
		int time = sc.nextInt();
		int pay;
		
		if (time<=8) {
			pay = 10000*time;
		} else {
			pay = 80000+(15000*(time-8));
		}
		
		System.out.println("임금은 "+pay+"원 입니다.");
		
		sc.close();
	}
}
