package com.team1.jogiyo.cart;

import com.team1.jogiyo.product.Product;

/*
 CREATE TABLE cart(
		c_no                          		NUMBER(10)		 NULL ,
		c_qty                         		NUMBER(10)		 DEFAULT 0		 NULL ,
		p_no                          		NUMBER(10)		 NULL ,
		m_id                          		VARCHAR2(50)		 NULL 
 */
public class Cart {
	
	private int c_no;
	private int c_qty;
	/*FK*/
	private String m_id;
	//private int p_no;
	private Product product;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public Cart(int c_no, int c_qty, String m_id, Product product) {
		super();
		this.c_no = c_no;
		this.c_qty = c_qty;
		this.m_id = m_id;
		this.product = product;
	}

	public int getC_no() {
		return c_no;
	}

	public void setC_no(int c_no) {
		this.c_no = c_no;
	}

	public int getC_qty() {
		return c_qty;
	}

	public void setC_qty(int c_qty) {
		this.c_qty = c_qty;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Cart [c_no=" + c_no + ", c_qty=" + c_qty + ", m_id=" + m_id + ", product=" + product + "]";
	}
	
	
}
