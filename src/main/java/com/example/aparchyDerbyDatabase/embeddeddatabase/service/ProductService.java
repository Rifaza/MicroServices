package com.example.aparchyDerbyDatabase.embeddeddatabase.service;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.example.aparchyDerbyDatabase.embeddeddatabase.model.Product;

@Service
public interface ProductService {

	public abstract void createProduct(Product product);
	   public abstract void updateProduct(String id, Product product);
	   public abstract void deleteProduct(String id);
	   public abstract Collection<Product> getProducts();
	
	
}
