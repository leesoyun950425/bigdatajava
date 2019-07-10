package com.itbank;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Context implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("콘텍스트 소멸");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("콘텍스트 시작");
	}

}
