package com.team1.jogiyo.product;

public class ProductSQL {
	
	public final static String PRODUCT_INSERT = 
			"insert into product values(product_p_no_seq.nextval,?,?,?,?,?)";

	public final static String PRODUCT_UPDATE =
			"update product set p_name = ? , p_image = ? , p_price = ? , p_desc = ? , ct_no = ? where p_no = ?";
			
	public final static String PRODUCT_DELETE =
			"delete from product where p_name = ?";
	
	public final static String PRODUCT_FIND_BY_NO =
			"select * from product where p_no = ?";

	public final static String PRODUCT_FIND_BY_NAME =
			"select * from product where p_name = ?";
	
	public final static String PRODUCT_FIND_BY_ALL =
			"select * from product";
	
	
	
	
	

}
