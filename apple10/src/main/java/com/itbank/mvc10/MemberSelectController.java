package com.itbank.mvc10;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberSelectController {

	@Autowired
	//@Qualifier("dao1") //객체를 찾을때 이름이 MemberDAO dao1 의 이름을 가진것을 찾는것
	MemberDAO dao;
	
	@RequestMapping("select.do")
	public void select(MemberDTO memberDTO,Model model) {
		MemberDTO dto = dao.select(memberDTO);
		model.addAttribute("dto", dto);
	}
	@RequestMapping("selectAll.do")
	public void selectAll(Model model) {
		List<MemberDTO> list = dao.selectAll();
		model.addAttribute("list", list);
	}
	@RequestMapping("main.do")
	public String main() {
		//컨트롤러--> client측 요청으로 넘어갈때
		return "redirect:main.jsp";
	}
}
