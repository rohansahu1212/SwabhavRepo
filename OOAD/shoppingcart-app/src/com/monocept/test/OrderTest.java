package com.monocept.test;

import com.monocept.model.Order;

public class OrderTest {
	public void orderTest(Order or) {
     System.out.println(or.getId());
     System.out.println(or.getData());
     System.out.println(or.getItemCount());
     System.out.println("check out price          "+or.checkoutPrice());
	}
	
}
