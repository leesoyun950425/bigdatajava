package com.soyun.last;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Autowired
	SqlSessionTemplate mymy;
	
	public void insert(MemberDTO memberDTO) {
		mymy.insert("memberDAO.insert",memberDTO);
	}
	
	public MemberDTO selectId(String inputId) {
		return mymy.selectOne("memberDAO.selectId",inputId);
	}
	
	public void update(MemberDTO memberDTO) {
		mymy.update("memberDAO.update",memberDTO);
	}
	public void delete(MemberDTO memberDTO) {
		mymy.delete("memberDAO.delete",memberDTO);
	}
	
	public List<MemberDTO> selectAll(){
		return mymy.selectList("memberDAO.selectAll");
	}
}
