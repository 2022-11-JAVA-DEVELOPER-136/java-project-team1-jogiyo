package com.team1.jogiyo.product.test;

import com.team1.jogiyo.product.Product;
import com.team1.jogiyo.product.ProductService;

public class ProductServiceTestMain {

	public static void main(String[] args) throws Exception {
	ProductService productService = new ProductService();
		
	//상품 추가
	Product insert = new Product(0,"김치찜","image2.jpg",21000,"설명",10);	
	productService.insert(insert);

	//상품 삭제
	productService.delete("김밥");
	
	//상품 보기 (번호)
	productService.findByPrimaryKey(2);
	
	//상품 보기 (이름)
	productService.findByName("김치찜");

	//상품 찾기 (전체)
	productService.findAll();
	
	//상품 수정
	Product update = productService.findByPrimaryKey(2);
	update.setP_desc("상세설명~");
	update.setP_price(22000);

	}

}
