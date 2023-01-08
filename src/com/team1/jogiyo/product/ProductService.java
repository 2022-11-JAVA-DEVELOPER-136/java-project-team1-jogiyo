package com.team1.jogiyo.product;

import java.util.List;

public class ProductService {
	private ProductDao2 productDao;
	public ProductService() {
		productDao = new ProductDao2();
	}
	
	//전체상품보기
	public List<Product> productList() throws Exception {
		return productDao.findAll();
	}
	
	//상품상세보기
	public Product productDetail(int p_no) throws Exception {
		return productDao.findByPrimaryKey(p_no);
	}
}
