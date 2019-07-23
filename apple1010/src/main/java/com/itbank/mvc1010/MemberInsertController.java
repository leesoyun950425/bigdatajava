package com.itbank.mvc1010;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberInsertController {

	@Autowired
	MemberDAO dao;
	
	@RequestMapping("insert.do")
	public void insert(MemberDTO memberDTO) {
		dao.insert(memberDTO);
		System.out.println("호출");
	}
}
