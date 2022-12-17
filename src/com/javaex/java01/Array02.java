package com.javaex.java01;

public class Array02 {

	public static void main(String args[]) {
		
		//배열 주소 복사
		
		//A 배열 선언
		int[] arrA = new int[3];
		
		//A 배열에 값 대입
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		//B 배열 선언
		int[] arrB;
		
		//A주소 B에 대입
		arrB = arrA;
		
		//배열 A 출력
		System.out.println("arrA[]");
		for(int i=0; i<arrA.length; i++) {
			System.out.println("i="+arrA[i]);
		}
		
		//배열 B 출력
		System.out.println("arrB[]");
		for(int i=0; i<arrB.length; i++) {
			System.out.println("i="+arrB[i]);
		}
	}
}
