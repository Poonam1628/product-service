package com.learning.project.product.apis;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Product not found")
public class ProductNotFoundException extends RuntimeException {
	
	public ProductNotFoundException(Long id) {
	
	super( "Product is not present with id" +id);
	}

}
