package com.javaex.java01;

import java.util.Scanner;

public class If01 {
	
	public static void main(String args[]) {
		
		/* 점수를 입력받아 
		 * 점수가 60점 이상이면 "합격입니다."를,
		 * 점수가 60점 미만이면 "불합격입니다."를 출력하세요
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수:");
		int score = sc.nextInt();
		
		if (score>=60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		sc.close();
	}
}
