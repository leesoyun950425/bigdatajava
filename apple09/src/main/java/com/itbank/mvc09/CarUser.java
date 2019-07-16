package com.itbank.mvc09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CarUser {
	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("context.xml");
		Car car =(Car)factory.getBean("car");
		car.open();
		car.close();
		System.out.println("============================");
		Car car2 = (Car)factory.getBean("car2");
		car2.open();
		car2.close();
	}
}
