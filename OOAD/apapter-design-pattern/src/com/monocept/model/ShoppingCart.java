package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item itm) {
		items.add(itm);
	}
	
	public double getTotalPrice() {
		double total=0;
		for(Item itm : items) {
			total = total+itm.itemPrice();
		}
		return total;
	}
	
	public String getDetails() {
		String orderSummary ="";
		for(Item item : items) {
			orderSummary += "Product Name- "+item.itemName()+" Price----- "+item.itemPrice()+"\n";
		}
		
		orderSummary += "Total Price------------------- "+getTotalPrice();
		
		return orderSummary;
	}
}
