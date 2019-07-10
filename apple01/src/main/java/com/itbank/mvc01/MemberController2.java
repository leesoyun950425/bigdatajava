package com.itbank.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class MemberController2 {
	
	@RequestMapping("insert2")
	public void insert(MemberDTO memberDTO, MemberDAO memberDAO) { //변수는 기본값으로 설정해야 알아서 서버까지 처리한다. 되도록 클래스 이름 소문자로. new까지 해줌.
		memberDAO.insert2(memberDTO);
	}
	
//	@RequestMapping("delete")
//	public void delete(MemberDTO memberDTO, MemberDAO memberDAO) { //변수는 기본값으로 설정해야 알아서 서버까지 처리한다. 되도록 클래스 이름 소문자로. new까지(객체생성) 해줌.
//		memberDAO.delete(memberDTO);
//	}
}
