package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] intArray = new int[5];
		
		int sum = 0;
		double avg;
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = sc.nextInt();
			sum += intArray[i];
		}
		
		avg = sum / intArray.length;
		
		System.out.println("평균은 "+ avg +" 입니다.");
		
		sc.close();

	}

}
