package com.itbank.mvc09;

public class AutoWindow implements Window {

	@Override
	public void open() {
		System.out.println("자동으로 열려띠!");
	}

	@Override
	public void close() {
		System.out.println("자동으로 닫혔띠!");
	}
}
