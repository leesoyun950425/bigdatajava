package com.itbank.mvc1010;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	BbsDAO dao;
	
	@RequestMapping("binsert")
	public void insert(BbsDTO bbsDTO) {
		dao.insert(bbsDTO);
	}
	
	@RequestMapping("bupdate")
	public void update(BbsDTO bbsDTO) {
		dao.update(bbsDTO);
	}
	
	@RequestMapping("bdelete")
	public void delete(BbsDTO bbsDTO) {
		dao.delete(bbsDTO);
	}
	@RequestMapping("bselect")
	public void select(BbsDTO bbsDTO,Model model) {
		BbsDTO dto = dao.select(bbsDTO);
		model.addAttribute("dto", dto);
	}
	@RequestMapping("bselectAll")
	public void selectAll(Model model) {
		List<BbsDTO> list= dao.selectAll();
		model.addAttribute("list",list);
	}
}
