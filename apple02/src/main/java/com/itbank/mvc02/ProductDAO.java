package com.itbank.mvc02;

public class ProductDAO {
	public void confirm(ProductDTO productDTO) {
		System.out.println("등록된 상품 id : " + productDTO.getId());
		System.out.println("등록된 상품명 : " + productDTO.getName());
		System.out.println("등록된 상품가격 : " + productDTO.getPrice());
		System.out.println("등록된 마일리지 : " + productDTO.getMail());
	}
	public void confirm2(ProductDTO productDTO) {
		productDTO.setMail("0");
		System.out.println("등록된 상품 id : " + productDTO.getId());
		System.out.println("등록된 상품명 : " + productDTO.getName());
		System.out.println("등록된 상품가격 : " + productDTO.getPrice());
		System.out.println("등록된 마일리지 : " + productDTO.getMail());
		System.out.println("마일리지가 초기화됨.");
	}
	
	public void delete(ProductDTO productDTO) {
		System.out.println("삭제된 상품 id :" + productDTO.getId());
		System.out.println("삭제된 상품명 :" + productDTO.getName());
		System.out.println("삭제된 상품가격 :" + productDTO.getPrice());
		System.out.println("삭제된 마일리지 :" + productDTO.getMail());
	}
}
