package com.team1.jogiyo.cart;

import java.util.List;

public interface CartInterface {

	public int insert(Cart cart) throws Exception;
	public int update(Cart cart) throws Exception;
	public int delete(int c_no) throws Exception;
	public Cart findByPrimaryKey(int c_no) throws Exception;
	public List<Cart> findAll() throws Exception;
}
