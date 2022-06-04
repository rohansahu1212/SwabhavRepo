package com.monocept.repository;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.monocept.model.Product;

@Repository
public class ProductRepository {

	@PersistenceContext
	private EntityManager em;

	public ProductRepository() {
		System.out.println("repo created of product");
	}
	public List<Product> getproducts(){
		return em.createQuery("from Product").getResultList();
	}
	
	
	@Transactional
	public void addProduct(Product product) {
		em.persist(product);
	}

}
