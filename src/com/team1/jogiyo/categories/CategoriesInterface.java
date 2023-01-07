package com.team1.jogiyo.categories;

import java.util.List;

import com.team1.jogiyo.product.Product;

public interface CategoriesInterface {

	public int insert(Categories categories) throws Exception;
	public int update(Categories categories) throws Exception;
	public int delete(String ct_no) throws Exception;
	public Product findByPrimaryKey(int ct_no) throws Exception;
	public List<Categories> findAll() throws Exception;
}
