package com.monocept.test;

import com.monocept.model.Customer;

public class CustomerTest {
	public void test(Customer cus) {
		System.out.println(cus.getId());
		System.out.println(cus.getName());
		System.out.println(cus.getOrderCount());

	}
}
