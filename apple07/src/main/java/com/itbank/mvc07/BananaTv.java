package com.itbank.mvc07;

public class BananaTv implements Tv {

	@Override
	public void powerOn() {
		System.out.println("Banana TV를 켜다.");
	}

	@Override
	public void powerOff() {
		System.out.println("BananaTv를 끄다.");
	}

	@Override
	public void volumUp() {
		System.out.println("BananaTv 소리를 Up");
	}

	@Override
	public void volumeDown() {
		System.out.println("BananaTv 소리를 Down");
	}

}
