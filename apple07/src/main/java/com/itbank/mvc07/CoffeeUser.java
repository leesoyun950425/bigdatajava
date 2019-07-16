package com.itbank.mvc07;

public class CoffeeUser  {
	public static void main(String[] args) {
		//추상클래스는 업캐스팅이 대상이 된다.
		//인터페이스는 업캐스팅이 대상이 된다.
		
		//추상클래스와 인터페이스는 타입으로 쓸 수 있다.
		//의존성(결합도)를 낮추기 위해 형변환 사용
		Coffee shop = new MyShopCoffee();
		//ShopCoffee shop = new MyShopCoffee(); //업캐스팅
		shop.make();
		shop.pay();
		//shop.prepare();
		
		TrukCoffee truk = new TrukCoffee();
		truk.make();
		truk.pay();
	}
}
