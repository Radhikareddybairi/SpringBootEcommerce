package com.ecommerce.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import com.ecommerce.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	public ProductServiceImpl() {
		super();
	}
	@Override
	public Product findProduct(int productId) {
		// TODO Auto-generated method stub
		return productRepository.findById(productId).get();
	}

	@Override
	public boolean deleteProduct(int productId) {
		// TODO Auto-generated method stub
		Product p = productRepository.findById(productId).get();

		if (p != null) {
			productRepository.delete(p);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		Product p = productRepository.findById(product.getProductId()).get();

		if (p != null) {
			productRepository.save(product);
			return true;
		}
		return false;
	}

	@Override
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product) == product;	
		}

	@Override
	public List<Product> findAllProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

}
