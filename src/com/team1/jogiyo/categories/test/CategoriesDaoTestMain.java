package com.team1.jogiyo.categories.test;

import com.team1.jogiyo.categories.Categories;
import com.team1.jogiyo.categories.CategoriesDao;

public class CategoriesDaoTestMain {

	public static void main(String[] args) throws Exception {

		CategoriesDao categoriesDao = new CategoriesDao();
		
		// 카테고리 추가
		categoriesDao.insert(new Categories(50, "양식", "dafault.jpg"));
		
		// 카테고리 수정
		categoriesDao.update(new Categories(50, "디저트","dafault.jpg"));
		
		// 카테고리 삭제
		categoriesDao.delete(50);
		
		// 카테고리 하나 보기
		categoriesDao.findByPrimaryKey(10);
		
		// 카테고리 전체 보기
		categoriesDao.findAll();
	
	}

}
