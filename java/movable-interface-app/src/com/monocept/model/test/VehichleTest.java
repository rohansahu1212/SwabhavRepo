package com.monocept.model.test;

import com.monocept.model.Bike;
import com.monocept.model.Car;
import com.monocept.model.IMovable;
import com.monocept.model.Truck;

public class VehichleTest {
	public static void main(String[] args) {
		Car c1=new Car("ferrari");
		Car c2=new Car("Audi");
		Bike b1=new Bike("ducati");
		Bike b2=new Bike("jawa");
		Truck t1=new Truck("tesla");
		IMovable[] movables= {c1,c2,b1,b2,t1};
		startRace(movables);
	}
	
	private static void startRace(IMovable[] movables) {
		System.out.println("race is start");
		for(IMovable mov: movables)
			mov.move();
		System.out.println("race ended");
	}
}
