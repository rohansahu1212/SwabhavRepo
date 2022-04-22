package com.monocept.model;

import com.monocpt.model.Hat;

public class HatAdapter implements Item{
	private Hat hat;

	public HatAdapter(Hat hat) {

		this.hat = hat;
	}

	public String getItemName() {
		return hat.getShortName();
	}

	public double getItemPrice() {
		return hat.getBasePrice();
	}

}
