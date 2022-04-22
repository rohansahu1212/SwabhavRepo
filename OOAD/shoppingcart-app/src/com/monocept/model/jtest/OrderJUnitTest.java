package com.monocept.model.jtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.LineItem;
import com.monocept.model.Order;
import com.monocept.model.Product;

class OrderJUnitTest {

	@Test
	void shoulodCreateOrderAndIdValueShouldMatch() {

		Product pro1 = new Product(11, "oil", 200, 20);
		LineItem li1 = new LineItem(111, 2, pro1);
		Order or = new Order(101, "rohanOrder");
		assertTrue(101== or.getId());

	}
	@Test
	void shoulodCreateOrderAndDataValueShouldMatch() {

		Product pro1 = new Product(11, "oil", 200, 20);
		LineItem li1 = new LineItem(111, 2, pro1);
		Order or = new Order(101, "rohanOrder");
		assertTrue("rohanOrder" == or.getData());

	}

	@Test
	void shoulodCreateOrderAndCheckoutPriceValueShouldMatch() {

		Product pro1 = new Product(11, "oil", 200, 20);
		LineItem li1 = new LineItem(111, 2, pro1);
		Order or = new Order(101, "rohanOrder");
		or.addItem(li1);
		assertTrue(320==or.checkoutPrice());

	}

	@Test
	void shoulodCreateOrderAndItemValueShouldMatch() {

		Product pro1 = new Product(11, "oil", 200, 20);
		LineItem li1 = new LineItem(111, 2, pro1);
		Order or = new Order(101, "rohanOrder");
		or.addItem(li1);
		assertEquals(li1, or.getItems().get(or.getItemCount()-1));

	}

	@Test
	void lineItemAddedTest() {
		Product pro1 = new Product(11, "oil", 200, 20);
		LineItem li1 = new LineItem(111, 2, pro1);
		Order or = new Order(101, "rohanOrder");
		int expectedValue = or.getItems().size() + 1;
		or.addItem(li1);
		assertTrue(or.getItems().size() == expectedValue);
	}
}
