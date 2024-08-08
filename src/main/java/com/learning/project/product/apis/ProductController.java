package com.learning.project.product.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping()
	private String home() {
		return "Welcome to Home Page";
	}
	
}
