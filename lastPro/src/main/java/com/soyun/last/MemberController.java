package com.soyun.last;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired
	MemberDAO memberDAO;
	
	@RequestMapping("insert")
	public void insert(MemberDTO memberDTO) {
		memberDAO.insert(memberDTO);
	}
	
	@RequestMapping("selectId")
	public void selectId(String id,Model model) {
		if(memberDAO.selectId(id)!=null) {
			model.addAttribute("result","중복됨");
		}else {
			model.addAttribute("result","중복안됨");
		}
	}
	
	@RequestMapping("update")
	public void update(MemberDTO memberDTO) {
		memberDAO.update(memberDTO);
	}
	
	@RequestMapping("delete")
	public void delete(MemberDTO memberDTO) {
		memberDAO.delete(memberDTO);
	}
	
	@RequestMapping("selectAll")
	public void selectAll(Model model) {
		List<MemberDTO> list = memberDAO.selectAll();
		model.addAttribute("list", list);
	}
}
