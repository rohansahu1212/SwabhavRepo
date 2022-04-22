package com.monocept.model.test;

import com.monocept.model.Car;

 class CarTest extends Car{
	public static void main(String[] args) {
		CarTest ob;
		ob=new CarTest();
		ob.speedUp();
		ob.start();
	} 
	@Override
	public
	void start() {
		System.out.println("car run in cartest");
		
	}
	@Override
	public
	void speedUp() {
		System.out.println("running from car test");
		super.speedUp();;
	}

}
