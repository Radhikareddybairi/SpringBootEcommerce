package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.Category;

public interface CategoryService {
	
	Category findCategory(int categoryId);

	boolean deleteCategory(int categoryId);

	boolean updateCategory(Category category);

	boolean addCategory(Category category);

	List<Category> findAllCategory();
}
