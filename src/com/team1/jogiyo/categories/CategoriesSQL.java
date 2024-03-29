package com.team1.jogiyo.categories;

public class CategoriesSQL {
	public final static String CATEGORIES_INSERT = 
			"insert into categories values(?, ?, ?)";
	
	public final static String CATEGORIES_UPDATE = 
			"update categories set ct_name = ?, ct_image = ? where ct_no = ?";
	
	public final static String CATEGORIES_DELETE = 
			"delete from categories where ct_name = ?";
	
	public final static String CATEGORIES_FIND_BY_NO= 
			"select * from categories where ct_no = ?";
	
	public final static String CATEGORIES_FIND_BY_NAME = 
			"select * from categories where ct_name = ?";
	
	public final static String CATEGORIES_FIND_ALL = 
			"select * from categories";
}
