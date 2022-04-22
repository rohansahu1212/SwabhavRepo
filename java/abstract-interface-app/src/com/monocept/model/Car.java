package com.monocept.model;

public abstract class Car {
	public Car() {
		System.out.println("car in initial stage");
	}

	public void speedUp() {
		System.out.println("car running fast");

	}

	public abstract void start();

}
