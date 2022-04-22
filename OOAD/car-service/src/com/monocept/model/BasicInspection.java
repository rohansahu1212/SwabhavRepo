package com.monocept.model;

public class BasicInspection implements Service{

	@Override
	public double getCost() {
System.out.println("inspection basic");
		return 200;
	}

}
