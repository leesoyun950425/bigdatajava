package com.itbank.mvc06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsSelectController {

	@Autowired
	BbsDAO bbsDao;
	
	@RequestMapping("select")
	public void select(String sId,Model model) {
		BbsDTO bbsDto = bbsDao.select(sId);
		model.addAttribute("result",bbsDto);
	}
	
}
