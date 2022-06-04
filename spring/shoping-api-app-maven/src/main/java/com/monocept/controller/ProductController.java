package com.monocept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.model.Product;
import com.monocept.service.ProductService;

@RestController
@RequestMapping(path = "api/v1/product")
public class ProductController {

	@Autowired
	ProductService service;

	@GetMapping(path = "/list")
	public ResponseEntity<List<Product>> getproduct() {
		return ResponseEntity.ok(service.getProducts());
	}

	@PostMapping(path = "/addproduct")
	public ResponseEntity<Product> addproduct(@RequestBody Product product){
		service.addProduct(product);
		return ResponseEntity.ok(product);
	}

}
