package com.itbank.mvc99;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MemberUser {
	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("context.xml");
		MemberDAO dao = (MemberDAO)factory.getBean("memberDAO");
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId("mybatis");
		memberDTO.setPw("mybatis");
		memberDTO.setName("mybatis");
		memberDTO.setTel("mybatis");
		dao.insert(memberDTO);
	}
}
