package com.monocept.test;

import com.monocept.model.LineItem;

public class LineItemTest {
	public void lineItemTest(LineItem li) {
		System.out.println(li.getId());
		System.out.println(li.getQuantity());
		System.out.println(li.calculateCost());
		System.out.println(li.getProduct());
	}
}
