package com.team1.jogiyo.cart;

import java.util.List;

public interface CartInterface {

	public int insert(Cart cart) throws Exception;
	public int update(Cart cart) throws Exception;
	public int delete(int c_no) throws Exception;
	public List<Cart> findByUser() throws Exception;
	public List<Cart> findByCartNo() throws Exception;
}
