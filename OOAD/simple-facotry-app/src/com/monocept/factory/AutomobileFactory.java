package com.monocept.factory;

public class AutomobileFactory {
	private AutoMobile am;

	private static AutomobileFactory autoMobileFact=null;
	
	public static AutomobileFactory getInstance() {
		if(autoMobileFact==null)
			autoMobileFact= new AutomobileFactory();
		return autoMobileFact;
	}
	public AutoMobile make(AutoType auto) {
		if (auto == AutoType.BMW)
			am = new Bmw();
		if (auto == AutoType.AUDI)
			am = new Audi();
		if (auto == AutoType.TESLA)
			am = new Tesla();

		return am;

	}
}
