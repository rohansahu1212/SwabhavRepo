package com.monocept.factory.test;

import com.monocept.product.factory.Auto;
import com.monocept.product.factory.AutoFactory;
import com.monocept.product.factory.BmwFactory;

public class TestTwo {
	public static void main(String[] args) {
		AutoFactory factory;
		factory =BmwFactory.getInstance();
		Auto auto= factory.make();
		auto.start();
		auto.stop();
	}
}
