package com.itbank.mvc1010;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {
	
	@Autowired
	SqlSessionTemplate myBatis;
	
	public void insert(BbsDTO bbsDTO) {
		myBatis.insert("bDAO.insert",bbsDTO);
	}
	
	public void update(BbsDTO bbsDTO) {
		myBatis.update("bDAO.update",bbsDTO);
	}
	public void delete(BbsDTO bbsDTO) {
		myBatis.delete("bDAO.delete",bbsDTO);
	}
	public BbsDTO select(BbsDTO bbsDTO) {
		return myBatis.selectOne("bDAO.select",bbsDTO);
	}
	public List<BbsDTO> selectAll() {
		return myBatis.selectList("bDAO.selectAll");
	}
}
