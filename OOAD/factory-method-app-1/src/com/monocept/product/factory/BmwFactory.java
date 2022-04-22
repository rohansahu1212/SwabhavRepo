package com.monocept.product.factory;

public class BmwFactory implements AutoFactory {
	static Auto auto;
	static BmwFactory bmw;

	@Override
	public Auto make() {
		auto = new Bmw();
		return auto;
	}
	public static AutoFactory getInstance() {
		if(bmw==null)
		bmw = new BmwFactory();
		return bmw;
	}
}
