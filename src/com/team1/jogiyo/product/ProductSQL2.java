package com.team1.jogiyo.product;

public class ProductSQL2 {
	public final static String PRODUCT_INSERT =
			"insert into product values(?, ?, ?, ?, ?)";
	
	public final static String PRODUCT_UPDATE =
			"update product set p_name = ";
			/*
			이름      널?       유형            
			------- -------- ------------- 
			P_NO    NOT NULL NUMBER(10)    
			P_NAME           VARCHAR2(50)  
			P_IMAGE          VARCHAR2(50)  
			P_PRICE          NUMBER(10)    
			P_DESC           VARCHAR2(200) 
			CT_NO            NUMBER(10)  
			 */
	
	public final static String PRODUCT_DELETE =
			"delete from product where p_no = ?";
	
	public final static String PRODUCT_FIND_BY_NO= 
			"select * from product where p_no = ?";
	
	public final static String PRODUCT_FIND_BY_NAME = 
			"select * from product where p_name = ?";
	
	public final static String PRODUCT_FIND_ALL = 
			"select * from product";
	
}
