package com.javaex.practice06_ex07;

public class SmartPhone extends MusicPhone {

	public void execute(String str) {
		
		if ("음악".equals(str)) {
			playMusic();
		} else if ("앱".equals(str)) {
			playApp();
		} else {
			super.execute(str);
		}
		
	}
	
	public void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
	
	public void playApp() {
		System.out.println("앱실행");
	}
	
}
