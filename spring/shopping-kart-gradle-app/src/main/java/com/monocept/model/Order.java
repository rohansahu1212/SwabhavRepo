package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int id;
	private String data;
	private List<LineItem> items;

	public Order(int id, String data) {

		this.id = id;
		this.data = data;
		this.items = new ArrayList<LineItem>();
	}

	public int getId() {
		return id;
	}

	public String getData() {
		return data;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public void addItem(LineItem li) {
		items.add(li);
	}

	public int getItemCount() {
		return items.size();
	}

	public double checkoutPrice() {
		double price = 0.0;
		for (LineItem li : getItems()) {
			price += li.calculateCost();
		}
		return price;
	}
}
