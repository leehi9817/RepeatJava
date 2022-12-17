package com.javaex.java01;

import java.util.Scanner;

public class SwitchCase01 {
	
	public static void main(String args[]) {
		
		// 월을 입력받아 해당월의 일수를 출력하는 프로그램을 작성하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		int days;
		
		switch (month) {
			case 2:
				days=28;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days=30;
				break;
			default:
				days=31;
				break;
		}
		
		System.out.println(days+"일 입니다.");
		
		sc.close();
	}
}
