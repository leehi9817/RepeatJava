package com.javaex.class04;

public class TV {

	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public TV() {
		
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	//메소드 getter
	public int getChannel() {
		return this.channel;
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	public boolean getPower() {
		return this.power;
	}
	
	//메소드 일반
	//전원 on/off
	public void power(boolean on) {
		this.power = on;
	}
	
	//채널 조정
	public void channel(int channel) {
		
		if (channel>=1 && channel<=255) {
			this.channel = channel;
		} else {
			System.out.println("사용 가능한 채널의 범위를 벗어났습니다.");
		}
		
	}
	
	//채널 증감
	public void channel(boolean up) {
		
		if (up == true) {
			if (this.channel>=1 && this.channel<=255) {
				this.channel++;
			} else {
				System.out.println("조절 가능한 채널의 범위를 벗어났습니다.");
			}
		} else {
			if (this.channel>=1 && this.channel<=255) {
				this.channel--;
			} else {
				System.out.println("조절 가능한 채널의 범위를 벗어났습니다.");
			}
		}
		
	}
	
	//볼륨 조정
	public void volume(int volume) {
		
		if (volume>=0 && volume<=100) {
			this.volume = volume;
		} else if (volume<0) {
			this.volume = 0;
		} else {
			this.volume = 100;
		}
		
	}
	
	//볼륨 증감
	public void volume(boolean up) {
		
		if (up == true) {
			if (this.volume>=0 && this.volume<=100) {
				this.volume++;
			} else {
				System.out.println("조절 가능한 볼륨의 범위를 벗어났습니다.");
			}
		} else {
			if (this.volume>=0 && this.volume<=100) {
				this.volume--;
			} else {
				System.out.println("조절 가능한 볼륨의 범위를 벗어났습니다.");
			}
		}
		
	}
	
	//TV 정보 출력
	public void status() {
		if (power == true) {
			System.out.println("전원:on");
		} else {
			System.out.println("전원:off");
		}
		System.out.println("채널:"+channel);
		System.out.println("볼륨:"+volume);
		System.out.println("-----------------");
	}
}
