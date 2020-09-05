package com.vn.dao;

import java.util.List;

import com.vn.entities.Category;

public interface CategoryDAO {
	
	public Integer delete(int id);

	public Category create(Category category);

	public Category update(Category category);

	public List<Category> findAll();

	public Category findById(int id);
}
