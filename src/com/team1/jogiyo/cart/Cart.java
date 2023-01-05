package com.team1.jogiyo.cart;
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
	private int p_no;
	private String m_id;
	
	
	public Cart(int c_no, int c_qty, int p_no, String m_id) {
		super();
		this.c_no = c_no;
		this.c_qty = c_qty;
		this.p_no = p_no;
		this.m_id = m_id;
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


	public int getP_no() {
		return p_no;
	}


	public void setP_no(int p_no) {
		this.p_no = p_no;
	}


	public String getM_id() {
		return m_id;
	}


	public void setM_id(String m_id) {
		this.m_id = m_id;
	}


	@Override
	public String toString() {
		return "Cart [c_no=" + c_no + ", c_qty=" + c_qty + ", p_no=" + p_no + ", m_id=" + m_id + "]";
	}
	
	
	
}
