package com.itbank.mvc99;

import org.mybatis.spring.SqlSessionTemplate;

public class MemberDAO {

	SqlSessionTemplate myBatis;

	public MemberDAO(SqlSessionTemplate myBatise) {
		this.myBatis = myBatise;
	}

	public void insert(MemberDTO memberDTO) {
		myBatis.insert("mDAO.insert", memberDTO);
	}
}
