package com.cts.product.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductService ps;

	@GetMapping
	public List<Product> findAll() {
		return ps.findAll();
	}

	@GetMapping("/{id}")
	public Product findById(@PathVariable("id") int id) {

		return ps.findById(id);
	}

	// update data

	@PutMapping
	public void updateProduct(@RequestBody Product prod) {
		ps.update(prod);
	}

	// delete data
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable("id") int id) {
		ps.delete(id);
	}

	// POST Data / save Product

	@PostMapping
	public void saveProduct(@RequestBody Product prod) {

		ps.saveProduct(prod);

	}

}
