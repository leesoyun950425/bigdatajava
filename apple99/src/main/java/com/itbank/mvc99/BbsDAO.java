package com.itbank.mvc99;

import org.mybatis.spring.SqlSessionTemplate;

public class BbsDAO {
	 
	SqlSessionTemplate myBatis;
	
	public BbsDAO(SqlSessionTemplate myBatis) {
		this.myBatis = myBatis;
	}
	
	public void insert(BbsDTO bbsDTO) {
		myBatis.insert("bDAO.insert",bbsDTO);
	}
}
