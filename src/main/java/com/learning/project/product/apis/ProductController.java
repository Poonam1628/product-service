package com.learning.project.product.apis;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	private final ProductService productService;
	
	public ProductController(ProductService productService) {
		this.productService=productService;
	}

	@PostMapping
	private ResponseEntity<Product> createProduct(@RequestBody Product product) {
		Product createdProduct=productService.saveProduct(product);
		return new ResponseEntity<>(createdProduct,HttpStatus.CREATED);
	}
	
	
	
}
