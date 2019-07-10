package com.itbank.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class MemberController {
	
	@RequestMapping("insert")
	public void insert(@RequestParam String id,@RequestParam String pw, @RequestParam String name, @RequestParam String tel) {
		System.out.println("회원가입 완료");
	}
}
