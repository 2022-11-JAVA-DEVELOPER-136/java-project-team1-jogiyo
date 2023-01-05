package com.team1.jogiyo.categories;
/*
CREATE TABLE categories(
		ct_no                         		NUMBER(10)		 NULL ,
		ct_name                       		VARCHAR2(30)		 NULL ,
		ct_image                      		VARCHAR2(50)		 DEFAULT 'default.jpg'		 NULL 
*/
		
public class Categories {
	private int ct_no;
	private String ct_name;
	private String ct_image;
	
	
	public Categories(int ct_no, String ct_name, String ct_image) {
		super();
		this.ct_no = ct_no;
		this.ct_name = ct_name;
		this.ct_image = ct_image;
	}


	public int getCt_no() {
		return ct_no;
	}


	public void setCt_no(int ct_no) {
		this.ct_no = ct_no;
	}


	public String getCt_name() {
		return ct_name;
	}


	public void setCt_name(String ct_name) {
		this.ct_name = ct_name;
	}


	public String getCt_image() {
		return ct_image;
	}


	public void setCt_image(String ct_image) {
		this.ct_image = ct_image;
	}


	@Override
	public String toString() {
		return "Categories [ct_no=" + ct_no + ", ct_name=" + ct_name + ", ct_image=" + ct_image + "]";
	}
	
	
	

}
