package com.vn.controller;

import com.vn.dao.CategoryDAO;
import com.vn.dao.CategoryDAOImpl;
import com.vn.entities.Category;

public class CategoryController {
	
	CategoryDAO categoryDAO = new CategoryDAOImpl();
	
	public void createCategory(Category category) {
		categoryDAO.create(category);
	}
	
}
