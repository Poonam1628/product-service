/**
 * 
 */
package com.learning.project.product.apis;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 */
public interface ProductRepository extends JpaRepository<Product,Long> {
	
	//Product createProduct(Product product);

	Product findByName(String name);
	
	Product findByType(String type);
	
	//Category[] findAllCategories();
	
	String deleteProduct(Product product);
	
	Product updateByCategory(String category);
	
	//Product updateProduct(Product product);
	
	
	

	
}
