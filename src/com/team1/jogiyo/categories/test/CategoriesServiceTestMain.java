package com.team1.jogiyo.categories.test;

import com.team1.jogiyo.categories.Categories;
import com.team1.jogiyo.categories.CategoriesDao;
import com.team1.jogiyo.categories.CategoriesService;

public class CategoriesServiceTestMain {

	public static void main(String[] args) throws Exception {

		CategoriesService categoriesService = new CategoriesService();
		
		//카테고리전체보기
		categoriesService.findAll();
		
	}

}
