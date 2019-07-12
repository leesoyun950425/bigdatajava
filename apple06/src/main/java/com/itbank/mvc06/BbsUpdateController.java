package com.itbank.mvc06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsUpdateController {

	@Autowired
	BbsDAO bbsDao;
	
	@RequestMapping("update")
	public void update(BbsDTO bbsDTO) {
	 	bbsDao.update(bbsDTO);
	}
	
}
