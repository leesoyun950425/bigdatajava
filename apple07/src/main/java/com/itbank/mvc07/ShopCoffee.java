package com.itbank.mvc07;

public abstract class ShopCoffee implements Coffee{
	//추상메소드가 하나라도 있으면 추상클래스.
	public abstract void prepare();	//쓸건데 어떤용도로 쓸지 모를때 추상 클래스. 변수 쓸수있다. 일반메소드도 쓸수있다. 불완전하다. 자식에서 꼭 써야한다(강제성).
	
	@Override
	public void make() {
		System.out.println("가게에서 커피를 만들다.");
	}

	@Override
	public void pay() {
		System.out.println("가게에서 pos기로 계산하다.");
	}
	
}
