package com.ecommerce.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Category;
import com.ecommerce.repository.CategoryRepository;
import com.ecommerce.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository categoryRepository;

	public CategoryServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public Category findCategory(int categoryId) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(categoryId).get();
	}

	@Override
	public boolean deleteCategory(int categoryId) {
		// TODO Auto-generated method stub
		Category c = categoryRepository.findById(categoryId).get();

		if (c != null) {
			categoryRepository.delete(c);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateCategory(Category category) {
		// TODO Auto-generated method stub
		Category c = categoryRepository.findById(category.getCategoryId()).get();

		if (c != null) {
			categoryRepository.save(category);
			return true;
		}
		return false;
	}

	@Override
	public boolean addCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category)==category;
	}

	@Override
	public List<Category> findAllCategory() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}
	
}
