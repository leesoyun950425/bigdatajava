package com.itbank.mvc99;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BbsUser {
	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("context.xml");
		BbsDAO dao = (BbsDAO)factory.getBean("bbsDAO");
		BbsDTO bbsDTO = new BbsDTO();
		bbsDTO.setId("good");
		bbsDTO.setTitle("good");
		bbsDTO.setContent("good");
		bbsDTO.setUuser("good");
		dao.insert(bbsDTO);
		
	}
}
