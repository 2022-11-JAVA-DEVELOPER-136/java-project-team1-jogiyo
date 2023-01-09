package com.team1.jogiyo.product.test;

import com.team1.jogiyo.product.Product;
import com.team1.jogiyo.product.ProductService;

public class ProductServiceTestMain {

	public static void main(String[] args) throws Exception {
	ProductService productService = new ProductService();
		
	//상품 추가	
	productService.insert(new Product(0,"김치찜aaa","image2.jpg",21000,"설명",10));
	

	//상품 삭제
	productService.delete("치킨");
	
	//상품 보기 (번호)
	productService.findByPrimaryKey(2);
	
	//상품 보기 (이름)
	productService.findByName("김치찜");

	//상품 찾기 (전체)
	productService.findAll();
	
	//상품 수정
	Product update = productService.findByPrimaryKey(2);
	update.setP_price(22000);
	System.out.println(update); 

	}

}
