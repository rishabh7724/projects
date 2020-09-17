package com.wipro.FirstDemo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.wipro.FirstDemo.utility.Product;

public interface ProductRegistry extends CrudRepository<Product, Integer> {

	
	@Override
	public List<Product> findAll();
	@Override
	public Product save(Product p);
}
