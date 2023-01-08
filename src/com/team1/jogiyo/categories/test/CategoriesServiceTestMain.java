package com.team1.jogiyo.categories.test;

import java.util.List;

import com.team1.jogiyo.categories.Categories;
import com.team1.jogiyo.categories.CategoriesService;

public class CategoriesServiceTestMain {

	public static void main(String[] args) throws Exception {
		CategoriesService categoriesService = new CategoriesService();
		
		//카테고리전체보기
		List<Categories> categoriesList = categoriesService.categoriesList();
		System.out.println("카테고리 전체보기 : " + categoriesList);

	}

}
