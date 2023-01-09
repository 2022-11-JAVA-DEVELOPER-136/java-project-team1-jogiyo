package com.team1.jogiyo.product.test;

import com.team1.jogiyo.product.Product;
import com.team1.jogiyo.product.ProductDao2;

public class ProductDaoTestMain {

	public static void main(String[] args) throws Exception {
		ProductDao2 productDao = new ProductDao2();
		
		//상품 추가
		int result = productDao.insert(new Product(4, "짬뽕", "jjambbong.jpg", 8000, "아주 얼큰한 짬뽕", 20));
		System.out.println("상품 추가 : " + result);
		
		//상품 수정
		productDao.update(new Product(2, "떡볶이", "ddeokboki.jpg", 6000, "매운 떡볶이", 30));
		
		//상품 삭제
		productDao.delete("짬뽕");
		
		//상품 번호로 검색
		System.out.println(productDao.findByPrimaryKey(3));
		
		//상품 이름으로 검색
		System.out.println(productDao.findByName("자장면"));
		
		//상품 전체 검색
		System.out.println(productDao.findAll());
		
	}

}
