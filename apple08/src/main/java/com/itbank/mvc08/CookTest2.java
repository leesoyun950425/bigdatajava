package com.itbank.mvc08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CookTest2 {
	public static void main(String[] args) {
		ApplicationContext cook = new GenericXmlApplicationContext("context.xml");
		ICook co1 = (ICook)cook.getBean("korea");
		CookManager cm = new CookManager(co1);
		System.out.println("============================");
		cm.orderSoup();
		cm.orderRice();
	}
}
