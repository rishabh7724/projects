package com.wipro.FirstDemo;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import com.wipro.FirstDemo.Controller.MainController;

import java.util.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class FirstDemoApplicationTests {

	
	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void greetingShouldReturnDefaultMessage() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/hi",
				String.class)).contains("Hello Ericsson");
	}
	
	@Autowired
	MainController mainController;
	
	@Test
	public void getAddMessage() throws Exception {
		
	
//		JSONObject jsonObject=new JSONObject(mainController.add("Rishabh", "Good Book", 123));
//		
//		assertEquals("Product Saved",jsonObject.get("message"));
	}
	
	@Test
	public void testDisplayMethod() throws Exception {
//		List<Product> list = mainController.display();
//		assertEquals(1, list.get(0).getId());
//		assertEquals("Rishabh", list.get(0).getName());
	}
	
}
