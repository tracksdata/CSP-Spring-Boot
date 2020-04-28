package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@Service
public class ProductServiceImpl {

	@Autowired
	private ProductDao prodDao;

	public void saveProduct(Product prod) {
		prodDao.save(prod);
	}

}
