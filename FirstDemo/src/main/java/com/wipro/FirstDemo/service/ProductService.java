package com.wipro.FirstDemo.service;

import java.util.List;

import com.wipro.FirstDemo.utility.Product;

public interface ProductService {

	public String addProduct(Product p);
	public List<Product> getAll();
	
}
