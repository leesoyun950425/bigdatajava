package com.itbank.mvc06;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsDeleteController {

	@Autowired //타입으로 찾는다. (ex. class)
	BbsDAO bbsDao;
	
	@RequestMapping("delete")
	public void delete(String did) {
		bbsDao.delete(did);
	}
}
