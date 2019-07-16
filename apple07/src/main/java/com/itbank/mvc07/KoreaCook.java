package com.itbank.mvc07;

public class KoreaCook implements Cook{
 
	@Override
	public void pay() {
		System.out.println("한국음식에 대한 값을 지불하다.");
	}

	@Override
	public void order() {
		System.out.println("한국음식을 주문하다.");
	}

	@Override
	public void cooking() {
		System.out.println("한식을 요리하다.");
	}
}
