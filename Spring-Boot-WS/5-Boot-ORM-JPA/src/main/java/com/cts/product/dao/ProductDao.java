package com.cts.product.dao;

import java.util.List;
import java.util.Optional;

import com.cts.product.entity.Product;

public interface ProductDao {

	int count();

	void saveProduct(Product prod);

	List<Product> findAll();

	List<Product> findByName(String name);

	Product findById(int id);

	int update(Product prod);

	int delete(int id);

}
