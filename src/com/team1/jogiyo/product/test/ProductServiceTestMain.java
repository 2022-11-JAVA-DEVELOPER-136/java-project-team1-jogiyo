package com.team1.jogiyo.product.test;

import java.util.*;

import com.team1.jogiyo.product.Product;
import com.team1.jogiyo.product.ProductService;

public class ProductServiceTestMain {

	public static void main(String[] args) throws Exception {
	ProductService productService = new ProductService();
	
	int rowCount = productService.insert(new Product(5, "순대국밥", "sss.jpg", 9000, "뜨끈한 순대국밥", 10));
	System.out.println(rowCount + "개 추가");
	
	rowCount = productService.delete("순대국밥");
	System.out.println(rowCount + "개 삭제");
	
	rowCount = productService.update(new Product(6, "떡볶이", "ddd.jpg", 5000, "매운 떡볶이", 30));
	System.out.println(rowCount + "개 수정");
	
	Product detail = productService.findByName("자장면");
	System.out.println("상품상세정보 : " + detail);
	
	Product detail2 = productService.findByPrimaryKey(3);
	System.out.println("상품상세정보 : " + detail2);
	
	List<Product> productList = productService.findAll();
	System.out.println("상품전체보기 : " + productList);

	}

}
