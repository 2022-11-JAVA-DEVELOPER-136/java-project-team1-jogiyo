package com.team1.jogiyo.categories.test;

import com.team1.jogiyo.categories.Categories;
import com.team1.jogiyo.categories.CategoriesDao;
import com.team1.jogiyo.product.Product;

public class CategoriesDaoTestMain {

	public static void main(String[] args) throws Exception {
		CategoriesDao categoriesDao = new CategoriesDao();
		
		//카테고리 추가
		//int result = categoriesDao.insert(new Categories(40, "일식", null));
		//System.out.println("상품 추가 : " + result);
		
		//카테고리 수정
		//categoriesDao.update(new Categories(30, "분식", null));
		
		//카테고리 삭제
		//categoriesDao.delete("중식");
		
		//카테고리 번호로 검색
		System.out.println(categoriesDao.findByPrimaryKey(10));
		
		//카테고리 이름으로 검색
		System.out.println(categoriesDao.findByName("중식"));
		
		//카테고리 전체 검색
		System.out.println(categoriesDao.findAll());

	}

}
