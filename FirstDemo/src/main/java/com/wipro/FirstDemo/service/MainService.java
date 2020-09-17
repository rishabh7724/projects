package com.wipro.FirstDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.wipro.FirstDemo.dao.ProductRegistry;
import com.wipro.FirstDemo.utility.Product;

@Service
@ControllerAdvice
public class MainService implements ProductService{

	@Autowired
	private ProductRegistry registry;
	
	@Override
	public String addProduct(Product p) {
		// TODO Auto-generated method stub
		
		String result;
		try {
			registry.save(p);
			result = "Product Saved";
		} catch (Exception e) {
			// TODO: handle exception
			result = e.getMessage();
		}
		
		return "{\"message\":\"" + result +"\"}" ;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		
		List<Product> list = null;
		
		try {
			list =  registry.findAll();
		} catch (Exception e) {
			// TODO: handle exception
			list = null;
		}
		
		
		return list;
	}


	
	
}
