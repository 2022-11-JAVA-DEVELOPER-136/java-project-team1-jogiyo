package com.team1.jogiyo.categories;

public class CategoriesSQL {
	
	public final static String  CATEGORIES_INSERT = 
			"insert into categories values(?,?,?)";

	public final static String CATEGORIES_UPDATE =
			"update categories set ct_name = ? , ct_image = ? where ct_no = ?";
			
	public final static String CATEGORIES_DELETE =
			"delete from categories where ct_no = ?";
	
	public final static String CATEGORIES_FIND_BY_NO =
			"select * from categories where ct_no = ?";

	// 사실 find_by_all 외에 필요한지 모르겠습니다..
	public final static String CATEGORIES_FIND_BY_ALL =
			"select * from categories";
	
}


