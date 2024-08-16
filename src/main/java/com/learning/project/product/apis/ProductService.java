package com.learning.project.product.apis;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	private final ProductRepository productRepository;
	
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository=productRepository;
	}
	
	public Product createProduct(Product product) {
		return productRepository.save(product);
		
	}
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
		
	}
	public Product getProductByName(String name) {
		return productRepository.findByName(name);
	}
	
	public Category[] findAllCategories() {  //find all the possible categories
		//productRepository.findAllCategories();
		return Category.values();
	}
	
	public  Product getProductByType(String type) {
		return productRepository.findByType(type);
	}
	
	public String deleteProduct(Product product) {
		productRepository.delete(product);
		return "Product deleted";
	}
		
	public void deleteAllProducts()	{
		 productRepository.deleteAll();
	}
		
	public Product updateProductByCategory(String category) {
		return productRepository.updateByCategory(category);
		
	}
	
	/*
	 * public Product updateProduct(Product product) { return
	 * productRepository.updateProduct(product); }
	 */
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
	public int getProductQuantity(Long productId) {
		Optional<Product> product=productRepository.findById(productId);
		if (product.isPresent()) {
			return product.get().getQuantity();
		}
		else
			throw new ProductNotFoundException(productId);
	}
	
}
