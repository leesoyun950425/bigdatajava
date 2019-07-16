package com.itbank.mvc08;

public class ChineseCook implements ICook {

	@Override
	public void makeRice() {
		System.out.println("중국식 밥");
	}

	@Override
	public void makeSoup() {
		System.out.println("중국식 수프");
	}

	@Override
	public void makeSalad() {
		System.out.println("중국식 샐러드");
	}

	@Override
	public void makeSource() {
		System.out.println("중국식 소스");
	}

}
