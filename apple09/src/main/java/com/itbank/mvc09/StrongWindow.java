package com.itbank.mvc09;

public class StrongWindow implements Window {

	@Override
	public void open() {
		System.out.println("강화유리가 열려띠!");
	}

	@Override
	public void close() {
		System.out.println("강화유리가 닫혔띠!");
	}
}
