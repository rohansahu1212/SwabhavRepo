package com.monocept.test;

import com.monocept.model.HatAdapter;
import com.monocept.model.ShoppingCart;
import com.monocpt.model.Hat;

public class ShoppingTest {
	public static void main(String[] args) {
		ShoppingCart kart = new ShoppingCart();

		kart.addItem(new HatAdapter(new Hat("patti", "chai patti", 2211)));
		kart.addItem(new HatAdapter(new Hat("sugar", "Brown sugar", 5299)));
		kart.addItem(new HatAdapter(new Hat("almond", "american almond", 69999)));

		System.out.println(kart.getDetails());
	}
}
