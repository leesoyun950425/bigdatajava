package com.itbank.mvc1010;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public ProductDTO select(ProductDTO productDTO) {
		return my.selectOne("pDAO.select",productDTO);
	}
}
