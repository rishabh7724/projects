package com.wipro.FirstDemo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.FirstDemo.dao.ProductRegistry;
import com.wipro.FirstDemo.service.MainService;
import com.wipro.FirstDemo.utility.Product;

@RestController
@RequestMapping("api/products")
public class MainController {

	
	@RequestMapping("hi")
	public String hello() {
		return "Hello Ericsson";
	}
	
	@Autowired
	MainService service;
	
	
	@PostMapping("add")
	public String add(@ModelAttribute("name")String name, @ModelAttribute("description")String description, @ModelAttribute("price")int price) {
		
		Product p = new Product();
		//p.setId(id);
		p.setName(name);
		p.setDescription(description);
		p.setPrice(price);
		
		System.out.println(p);
		
		String status = service.addProduct(p);
		
		return status;
	}
	
	@GetMapping("display")
	public List<Product> display(){
		List<Product> list = service.getAll();		
		return list;
	}
	
	
	
}
