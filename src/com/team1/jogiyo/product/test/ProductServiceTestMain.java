package com.team1.jogiyo.product.test;

import java.util.List;

import com.team1.jogiyo.product.Product;
import com.team1.jogiyo.product.ProductService;

public class ProductServiceTestMain {

	public static void main(String[] args) throws Exception {
		ProductService productService = new ProductService();
		
		//상품전체보기
		List<Product> productList = productService.productList();
		System.out.println("상품전체보기 : " + productList);
		
		//상품상세보기
		Product detail = productService.productDetail(3);
		System.out.println("상품상세정보 : " + detail);

	}

}
