package com.itbank.mvc1010;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReplyDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insert(ReplyDTO replyDTO) {
		my.insert("rDAO.insert",replyDTO);
	}
	public List<ReplyDTO> selectAll() {
		return my.selectList("rDAO.selectAll");
	}
}
