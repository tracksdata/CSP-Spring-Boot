package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return prodDao.count();
	}

	@Override
	public int saveProduct(Product prod) {
		// TODO Auto-generated method stub
		return prodDao.saveProduct(prod);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return prodDao.findAll();
	}

	@Override
	public List<Product> findByName(String name) {
		// TODO Auto-generated method stub
		return prodDao.findByName(name);
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return prodDao.findById(id);
	}

	@Override
	public int update(Product prod) {
		// TODO Auto-generated method stub
		return prodDao.update(prod);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return prodDao.delete(id);
	}

}
