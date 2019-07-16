package com.itbank.mvc09;

public class SkyDoor implements Door {

	@Override
	public void doorOpen() {
		System.out.println("날개문이 열려띠!");
	}

	@Override
	public void doorClose() {
		System.out.println("날개문이 닫혔띠!");
	}
}
