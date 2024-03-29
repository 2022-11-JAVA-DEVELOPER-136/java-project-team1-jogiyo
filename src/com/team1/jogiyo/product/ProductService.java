package com.team1.jogiyo.product;

import java.security.PublicKey;
import java.util.List;

public class ProductService {

	private ProductDao productDao;
	
	public ProductService() throws Exception {
		productDao = new ProductDao();
	}

	public int insert (Product product) throws Exception {
		return productDao.insert(product);
	}

	public int update (Product product) throws Exception {
		return productDao.update(product);
	}
	
	public int delete (String p_name) throws Exception {
		return productDao.delete(p_name);
	}
	
	public Product findByPrimaryKey (int p_no) throws Exception {
		return productDao.findByPrimaryKey(p_no);
	}
	
	public Product findByName (String p_name) throws Exception {
		return productDao.findByName(p_name);
	}
	
	public List<Product> findAll() throws Exception {
		return productDao.findAll();
	}
	
	
	
}
