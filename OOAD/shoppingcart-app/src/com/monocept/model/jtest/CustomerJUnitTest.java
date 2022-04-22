package com.monocept.model.jtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.Customer;
import com.monocept.model.LineItem;
import com.monocept.model.Order;
import com.monocept.model.Product;

class CustomerJUnitTest {

	@Test
	void shouldCreateCustomerAndIdValueShouldMatch() {

		Product pro1 = new Product(11, "oil", 200, 20);
		LineItem li1 = new LineItem(111, 2, pro1);
		Order or = new Order(101, "rohanOrder");
		Customer cus = new Customer(12, "RohanSahu");
		assertTrue(12 == cus.getId());
	}

	@Test
	void shouldCreateCustomerAndOrderValueShouldMatch() {

		Product pro1 = new Product(11, "oil", 200, 20);
		LineItem li1 = new LineItem(111, 2, pro1);
		Order or = new Order(101, "rohanOrder");
		or.addItem(li1);
		Customer cus = new Customer(12, "RohanSahu");
		cus.addOrder(or);
		assertTrue(or== cus.getOrders().get(cus.getOrderCount()-1));
	}
	@Test
	void shouldCreateCustomerAndNameValueShouldMatch() {

		Product pro1 = new Product(11, "oil", 200, 20);
		LineItem li1 = new LineItem(111, 2, pro1);
		Order or = new Order(101, "rohanOrder");
		Customer cus = new Customer(12, "RohanSahu");
		assertTrue("RohanSahu" == cus.getName());
	}
	@Test
	void orderAddedTest() {
		Product pro1 = new Product(11, "oil", 200, 20);
		LineItem li1 = new LineItem(111, 2, pro1);
		Order or = new Order(101, "rohanOrder");
		Customer customer = new Customer(12, "vineet");
		int expectedValue = customer.getOrderCount() + 1;
		customer.addOrder(or);
		assertTrue(expectedValue == customer.getOrderCount());
	}
}
