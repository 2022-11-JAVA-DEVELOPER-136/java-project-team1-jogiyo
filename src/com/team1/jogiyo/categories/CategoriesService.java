package com.team1.jogiyo.categories;

import java.util.List;

public class CategoriesService {

	private CategoriesDao categoriesDao;
	
	public CategoriesService() {
		categoriesDao = new CategoriesDao();
	}
	
	public List<Categories> findAll () throws Exception {
		List<Categories> categoriesList = categoriesDao.findAll();
		return categoriesList;
	}
	
	
}
