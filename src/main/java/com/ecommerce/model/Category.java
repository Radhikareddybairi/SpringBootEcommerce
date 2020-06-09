package com.ecommerce.model;

import org.springframework.stereotype.Component;

@Component
public class Category {
private int categoryId;
private String categoryName;
public Category() {
	super();
	// TODO Auto-generated constructor stub
}
public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}

}
