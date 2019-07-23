package com.itbank.mvc1010;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyController {

	@Autowired
	ReplyDAO dao;
	
	@RequestMapping("cinsert")
	public void insert(ReplyDTO replyDTO,Model model) {
		dao.insert(replyDTO);
		List<ReplyDTO> list = dao.selectAll();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("cSelectAll")
	public String commen(Model model) {
		List<ReplyDTO> list = dao.selectAll();
		model.addAttribute("list", list);
		return "cinsert";
	}
}
