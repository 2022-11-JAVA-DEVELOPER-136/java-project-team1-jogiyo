package com.team1.jogiyo.categories.test;

import com.team1.jogiyo.categories.CategoriesDao;

public class CategoriesDaoTestMain {

	public static void main(String[] args) throws Exception {
	CategoriesDao categoriesDao = new CategoriesDao();
	
	categoriesDao.findAll();

	}
}
