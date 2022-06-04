package com.monocept.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.Order;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.monocept.dto.OrdersDTO;
import com.monocept.model.Customer;
import com.monocept.model.Orders;

@Repository
public class SOrderRepository {

	@PersistenceContext
	private EntityManager em;

	public SOrderRepository() {
		System.out.println("order repo created");
	}

	@Transactional
	public void addOrder(int id, OrdersDTO orDto) {
		Customer cus = (Customer) em.createQuery("from Customer where id=" + id + " ").getSingleResult();
		Orders sOrder=new Orders(orDto.getOid(), orDto.getOrderName());
		sOrder.setCustomer(cus);
		cus.addOrder(sOrder);
		em.merge(cus);
	}

	public List<Orders> getAllOrder() {
		return em.createQuery("from Orders").getResultList();

	}
	
	@Transactional
	public Orders getSingleOrder(int id) {
		return (Orders) em.createQuery("from Orders where oid="+id+"").getSingleResult();
	}

}
