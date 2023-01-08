package com.team1.jogiyo.categories;

import java.util.List;

public class CategoriesService {
	private CategoriesDao categoriesDao;
	public CategoriesService() {
		categoriesDao = new CategoriesDao();
	}
	
	//전체카테고리보기
	public List<Categories> categoriesList() throws Exception {
		return categoriesDao.findAll();
	}
}
