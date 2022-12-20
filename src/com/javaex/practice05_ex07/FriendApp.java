package com.javaex.practice05_ex07;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구를 3명 등록해 주세요");
		
		Friend[] friends = new Friend[3];
		
		String name;
		String phone;
		String school;
		
		for(int i=0; i<friends.length; i++) {
			System.out.print("이름:");
			name = sc.nextLine();
			
			System.out.print("핸드폰:");
			phone = sc.nextLine();
			
			System.out.print("학교:");
			school = sc.nextLine();
			
			friends[i] = new Friend(name, phone, school);
			System.out.println("-----------------------------------");
		}
		
		for(int i=0; i<friends.length; i++) {
			System.out.println("이름:"+friends[i].getName()+" 핸드폰:"+friends[i].getPhone()+" 학교:"+friends[i].getSchool());
		}
		
		sc.close();

	}

}
