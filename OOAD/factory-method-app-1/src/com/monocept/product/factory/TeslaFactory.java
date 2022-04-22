package com.monocept.product.factory;

public class TeslaFactory implements AutoFactory {
	Auto auto;
	static TeslaFactory tesla;

	@Override
	public Auto make() {

		auto = new Tesla();
		return auto;
	}

	public static TeslaFactory getInstance() {
		if (tesla == null)
			tesla = new TeslaFactory();
		return tesla;
	}

}
