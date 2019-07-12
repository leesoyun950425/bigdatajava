package com.itbank.mvc03;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	//front-controller
	@RequestMapping("loginCheck")
	public String login(Model model,MemberDTO memberDTO, ArrayList<String> list) {
		System.out.println("로그인 처리");
		model.addAttribute("result","내가 넘어왔띠!");
		memberDTO.setId("spring");
		memberDTO.setPw("spring");
		memberDTO.setName("spring");
		memberDTO.setTel("spring");
		model.addAttribute("memberDTO",memberDTO);
		
		list.add("감자");
		list.add("고구마");
		list.add("양파");
		
		model.addAttribute("list",list);
		return "loginResult";
	}
}
