package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductService {
	int count();
	void saveProduct(Product prod);

	List<Product> findAll();

	List<Product> findByName(String name);

	Product findById(int id);

	int update(Product prod);
	int delete(int id);
}
