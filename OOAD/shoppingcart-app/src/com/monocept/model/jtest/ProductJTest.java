package com.monocept.model.jtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.Customer;
import com.monocept.model.LineItem;
import com.monocept.model.Order;
import com.monocept.model.Product;
import com.monocept.test.ProductTest;

class ProductJTest {

	@Test
	public void shouldCreateAProductAndNameValueShouldMatch() {
		Product pro1 = new Product(11, "oil", 200, 20);
		assertTrue("oil" == pro1.getName());
	}

	@Test
	public void shouldCreateAProductAndIdValueShouldMatch() {
		Product pro1 = new Product(11, "oil", 200, 20);
		assertTrue(11 == pro1.getId());

	}

	@Test
	public void shouldCreateAProductAndPriceValueShouldMatch() {
		Product pro1 = new Product(11, "oil", 200, 20);
		assertTrue(200 == pro1.getPrice());

	}

	@Test
	public void shouldCreateAProductAndDiscountValueShouldMatch() {
		Product pro1 = new Product(11, "oil", 200, 20);
		assertTrue(20 == pro1.getDiscount());
	}
	@Test
	public void shouldCreateAProductAndCalculateDiscountValueShouldMatch() {
		Product pro1 = new Product(11, "oil", 200, 20);
		assertTrue(160 == pro1.calculatePriceAfterDiscout());
	}
}
//@Test
//public void shouldCreateAProductAndNameValueShouldMatch() {
//	Product pro1 = new Product(11, "oil", 200, 20);
//	assertTrue("oil" == pro1.getName());
//	assertTrue(11 == pro1.getId()); // it will give failure because correct values in 11
//	assertTrue(200 == pro1.getPrice());
//	assertTrue(20 == pro1.getDiscount());
//}
