package com.itbank.mvc07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvUser4 {
	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("context.xml");
		Tv tv = (Tv)factory.getBean("tv");
		tv.powerOn();
		tv.powerOff();
		tv.volumUp();
		tv.volumeDown();
	}
}
