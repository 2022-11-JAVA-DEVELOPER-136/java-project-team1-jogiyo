package com.team1.jogiyo.product;

public class Product {

	private int p_no; 
	private String p_name; 
	private String p_image; 
	private int p_price; 
	private String p_desc; 
	private int c_no;
	
	public Product() {
	}

	public Product(int p_no, String p_name, String p_image, int p_price, String p_desc, int c_no) {
	super();
	this.p_no = p_no;
	this.p_name = p_name;
	this.p_image = p_image;
	this.p_price = p_price;
	this.p_desc = p_desc;
	this.c_no = c_no;
	}

	public int getP_no() {
		return p_no;
	}

	public String getP_name() {
		return p_name;
	}

	public String getP_image() {
		return p_image;
	}

	public int getP_price() {
		return p_price;
	}

	public String getP_desc() {
		return p_desc;
	}

	public int getC_no() {
		return c_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public void setP_image(String p_image) {
		this.p_image = p_image;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public void setP_desc(String p_desc) {
		this.p_desc = p_desc;
	}

	public void setC_no(int c_no) {
		this.c_no = c_no;
	}

	@Override
	public String toString() {
		return "Product [p_no=" + p_no + ", p_name=" + p_name + ", p_image=" + p_image + ", p_price=" + p_price
				+ ", p_desc=" + p_desc + ", c_no=" + c_no + "]";
	}	
	
	
	
	
}