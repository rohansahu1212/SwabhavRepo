package com.monocept.product.factory;

public class AudiFactory implements AutoFactory {
	Auto auto;
	static AudiFactory audi;
	private AudiFactory() {
		System.out.println("inside private constructor");
	}

	@Override
	public Auto make() {
		auto = new Audi();
		return auto;
	}
	public static AudiFactory getInstance() {
		if(audi==null)
			audi= new AudiFactory();
		return audi;
	}

}
