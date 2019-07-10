package com.itbank.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@RequestMapping("confirm")
	public void confirm(ProductDTO productDTO,ProductDAO productDAO) {
		productDAO.confirm2(productDTO);
	}
	@RequestMapping("delete")
	public void delete(ProductDTO productDTO,ProductDAO productDAO) {
		productDAO.delete(productDTO);
	}
	@RequestMapping("search")
	public String search(ProductDTO productDTO,ProductDAO productDAO) {
		String sId = "a";
		String sName = "apple";
		String sPrice = "2000";
		String sMail = "500";
		if(sId.equals(productDTO.getId())&& sName.equals(productDTO.getName())&& sPrice.equals(productDTO.getPrice())&&sMail.equals(productDTO.getMail())) {
			return "searchRe";
		}else {
			return "searchFal";
		}
	}
}
