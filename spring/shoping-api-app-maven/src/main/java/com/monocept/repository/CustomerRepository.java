package com.monocept.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.monocept.dto.CustomerDTO;
import com.monocept.model.Customer;

@Repository
public class CustomerRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	public CustomerRepository() {
		System.out.println("customer reposity created");
	}
	
	public List<Customer> getAllCustomers(){
		return em.createQuery("from Customer").getResultList();
	}
	
	@Transactional
	public Customer getCustomer(int id){
		return (Customer) em.createQuery("from Customer where id="+id+" ").getSingleResult();
	}
	
	
	@Transactional
	public void addCustomer(CustomerDTO customerDTO) {
		Customer customer= new Customer(customerDTO.getId(), customerDTO.getCustomerName());
		em.persist(customer);
	}

}
