package com.monocept.model.jtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.LineItem;
import com.monocept.model.Product;

class LineItemJUnitTest {

	@Test
	void shouldCreateLineItemAndIdValueShouldMatch() {
		Product pro1 = new Product(11, "oil", 200, 20);
		LineItem li1 = new LineItem(111, 2, pro1);
		assertTrue(111 == li1.getId());

	}

	@Test
	void shouldCreateLineItemAndQuantityValueShouldMatch() {
		Product pro1 = new Product(11, "oil", 200, 20);
		LineItem li1 = new LineItem(111, 2, pro1);
		assertTrue(2 == li1.getQuantity());
	}

	@Test
	void shouldCreateLineItemAndProductValueShouldMatch() {
		Product pro1 = new Product(11, "oil", 200, 20);
		LineItem li1 = new LineItem(111, 2, pro1);
		assertEquals(pro1, li1.getProduct());
	}

	@Test
	void shouldCreateLineItemAndCalculateValueShouldMatch() {
		Product pro1 = new Product(11, "oil", 200, 20);
		LineItem li1 = new LineItem(111, 2, pro1);
		assertEquals(320, li1.calculateCost());
	}

}
