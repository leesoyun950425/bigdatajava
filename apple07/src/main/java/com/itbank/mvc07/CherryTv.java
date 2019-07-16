package com.itbank.mvc07;

public class CherryTv implements Tv {

	@Override
	public void powerOn() {
		System.out.println("Cherry TV를 켜다.");
	}

	@Override
	public void powerOff() {
		System.out.println("CherryTv를 끄다.");
	}

	@Override
	public void volumUp() {
		System.out.println("CherryTv 소리를 Up");
	}

	@Override
	public void volumeDown() {
		System.out.println("CherryTv 소리를 Down");
	}

}
