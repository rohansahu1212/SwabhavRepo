package com.monocept.factory.test;

import com.monocept.product.factory.AudiFactory;
import com.monocept.product.factory.Auto;
import com.monocept.product.factory.AutoFactory;

public class TestOne {
	public static void main(String[] args) {
		AutoFactory factory;
		factory= AudiFactory.getInstance();
		Auto auto = factory.make();
		auto.start();
		auto.stop();
	}
}
