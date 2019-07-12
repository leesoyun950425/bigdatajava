package com.itbank.mvc06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired //getInstance 역할을 한다. 싱글톤 객체의 주소를 변수에 넣어준다.
	BbsDAO bbsDao;
	
	@RequestMapping("bbsInsert")
	public void bbsInsert(BbsDTO bbsDTO) {
		try {
			bbsDao.insert(bbsDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
