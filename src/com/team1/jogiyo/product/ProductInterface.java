package com.team1.jogiyo.product;

import java.util.List;

public interface ProductInterface {

	public int insert(Product product) throws Exception;
	public int update(Product product) throws Exception;
	public int delete(String p_name) throws Exception;
	public Product findByPrimaryKey(int p_no) throws Exception;
	public Product findByName(String p_name) throws Exception;
	public List<Product> findAll() throws Exception;
}
