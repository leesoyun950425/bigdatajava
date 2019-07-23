package com.itbank.mvc10;



import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Component 부모
//@Service  자식 일반
@Repository //자식 db용 bean
public class MemberDAO {
		
		@Autowired
		SqlSessionTemplate myBatis;
		
		public void insert(MemberDTO memberDTO) {
			myBatis.insert("mDAO.insert",memberDTO);
			System.out.println("myBatis호출");
		}
		
		public void update(MemberDTO memberDTO) {
			myBatis.update("mDAO.update",memberDTO);
		}
		
		public void delete(MemberDTO memberDTO) {
			myBatis.delete("mDAO.delete",memberDTO);
		}
		
		public MemberDTO select(MemberDTO memberDTO) {
			return myBatis.selectOne("mDAO.select",memberDTO);
		}
		
		public List<MemberDTO> selectAll(){
			return myBatis.selectList("mDAO.selectAll");
		}
		
}
