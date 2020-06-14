package com.ecommerce.service;

import java.util.List;
import com.ecommerce.model.Product;

public interface ProductService {

	Product findProduct(int productId);

	boolean deleteProduct(int productId);

	boolean updateProduct(Product product);

	boolean addProduct(Product product);

	List<Product> findAllProduct();
}
