package com.itbank.mvc09;

public class GeneralDoor implements Door {

	@Override
	public void doorOpen() {
		System.out.println("그냥 문이 열렸띠!");
	}

	@Override
	public void doorClose() {
		System.out.println("그냥 문이 닫혔띠!");
	}

}
