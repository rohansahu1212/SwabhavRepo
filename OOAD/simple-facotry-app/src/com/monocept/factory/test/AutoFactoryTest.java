package com.monocept.factory.test;

import com.monocept.factory.AutoMobile;
import com.monocept.factory.AutoType;
import com.monocept.factory.AutomobileFactory;

public class AutoFactoryTest {
	public static void main(String[] args) {
		AutomobileFactory factory= AutomobileFactory.getInstance();
		AutoMobile product= factory.make(AutoType.AUDI);
		product.start();
		product.stop();
		System.out.println(product.getClass().getSimpleName());
	}
}
