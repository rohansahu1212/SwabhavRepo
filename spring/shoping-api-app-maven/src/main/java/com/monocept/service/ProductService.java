package com.monocept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monocept.model.Product;
import com.monocept.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public ProductService() {
		System.out.println("product service created");
	}
	
	public  List<Product> getProducts(){
		return productRepository.getproducts();
	}
	public void addProduct(Product product) {
		productRepository.addProduct(product);
	}
	
}
