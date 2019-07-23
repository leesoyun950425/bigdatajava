package com.itbank.mvc10;

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
	
	public List<ReplyDTO> select(ReplyDTO replyDTO) {
		return my.selectList("rDAO.select", replyDTO);
	}
	public List<ReplyDTO> select(String id) {
		return my.selectList("rDAO.selectId", id);
	}
	
	public List<ReplyDTO> selectAll(){
		return my.selectList("rDAO.selectAll");
	}
}
