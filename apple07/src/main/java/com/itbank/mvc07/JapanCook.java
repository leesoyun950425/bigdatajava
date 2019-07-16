package com.itbank.mvc07;

public class JapanCook implements Cook {

	@Override
	public void pay() {
		System.out.println("일식에 대한 값을 지불하다.");
	}

	@Override
	public void order() {
		System.out.println("일본음식을 주문하다.");
	}

	@Override
	public void cooking() {
		System.out.println("일식을 요리하다.");
	}

}
