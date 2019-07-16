package com.itbank.mvc08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CookTest {
	public static void main(String[] args) {
		ApplicationContext cook = new GenericXmlApplicationContext("context.xml");
		ICook co1 = (ICook)cook.getBean("china");
		co1.makeSource();
		co1.makeRice();
		co1.makeSalad();
		co1.makeSoup();
		
		ICook co2 = (ICook)cook.getBean("korea");
		co2.makeRice();
		co2.makeSalad();
		co2.makeSoup();
		co2.makeSource();
	}
}
